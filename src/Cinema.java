import java.util.*;

public class Cinema {

    TreeMap <Days, Schedule> schedules;
    ArrayList <Movie> moviesLibrary = new ArrayList<>();
    private Time timeOpen;
    private Time timeClose;

    public void addMovie (Movie movie){
        moviesLibrary.add(movie);
        System.out.println(movie + " успішно доданий до фільмотеки.");
    }

    public void addSeance (Seance seance, String day) throws Time.IllegalTimeFormatException {
        for(Days dayOfTheWeek : Days.values()){
            if(dayOfTheWeek.name().equalsIgnoreCase(day)){
                if(schedules.containsKey(dayOfTheWeek)){
                    Schedule schedule = schedules.get(dayOfTheWeek);
                    schedule.addSeance(seance);
                    System.out.println(seance.toString() + " успішно доданий до розкладу.");
                }
                else {
                    schedules.put(dayOfTheWeek, new Schedule(new TreeSet<>()));
                    Schedule schedule = schedules.get(dayOfTheWeek);
                    schedule.addSeance(seance);
                }
            }
        }
    }

    public void removeMovie (Movie movie) throws Time.IllegalTimeFormatException {
        Iterator<Movie> iterator = moviesLibrary.iterator();
        while (iterator.hasNext()){
            Movie next = iterator.next();
            if (next.getTitle().equalsIgnoreCase(movie.getTitle())){
                iterator.remove();
            }
        }
        for (Days dayOfTheWeek : Days.values()){
            if (schedules.containsKey(dayOfTheWeek)){
                Schedule schedule = schedules.get(dayOfTheWeek);
                Iterator<Seance> iterator1 = schedule.getSeances().iterator();
                while (iterator1.hasNext()){
                    Seance next = iterator1.next();
                    Movie movie1 = next.getMovie();
                    if (movie1.getTitle().equalsIgnoreCase(movie.getTitle())){
                        iterator1.remove();
                        System.out.println("Фільм і сеанси на цей фільм було видалено з розкладу.");
                    }
                }
            }
        }
    }

    public void removeSeance (Seance seance, String day){
        for(Days dayOfTheWeek : Days.values()){
            if (dayOfTheWeek.name().equalsIgnoreCase(day)){
                Schedule schedule = schedules.get(dayOfTheWeek);
                schedule.removeSeance(seance);
                System.out.println(seance.toString() + " успішно видалений з розкладу.");
            }
        }
    }

    public void showAllMoviesLibrary(){
        System.out.println("Список всіх фільмів укі доступні на даний час в кінотеатрі: ");
        for(Movie movie : moviesLibrary){
            System.out.println(movie);
        }
    }

    public void showScheduleOfTheDay (String day){
        for (Days dayOfTheWeek : Arrays.asList(Days.values())){
            if (dayOfTheWeek.name().equalsIgnoreCase(day)){
                Schedule schedule = schedules.get(dayOfTheWeek);
                Set<Seance> seances = schedule.getSeances();
                Iterator<Seance> iterator = seances.iterator();
                while (iterator.hasNext()){
                    Seance next = iterator.next();
                    System.out.println(next.toString());
                }
            }
        }
    }

    public void showAllSchedule (){
        Iterator<Map.Entry<Days, Schedule>> iterator = schedules.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Days, Schedule> next = iterator.next();
            System.out.println(next.toString());
        }
    }
//    public void showTimeOfWorking () {
//
//    }

    public Cinema(TreeMap<Days, Schedule> schedules, Time timeOpen, Time timeClose) {
        this.schedules = schedules;
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
    }

    public Time getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(Time timeOpen) {
        this.timeOpen = timeOpen;
    }

    public Time getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(Time timeClose) {
        this.timeClose = timeClose;
    }
}
