import java.util.Scanner;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) throws Time.IllegalTimeFormatException{

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введіть час відкриття кінотеатру: ");
        Time timeOpen = inputTime();
        System.out.println("Введіть час закриття кінотеатру: ");
        Time timeClose = inputTime();
        Cinema cinema = new Cinema(new TreeMap<>(), timeOpen, timeClose);

        showMenu();
        System.out.println("Введіть потрібне число: ");
        int choice = scanner1.nextInt();

        while (choice != 8){
            switch (choice){
                case 1:
                    Movie movie = inputNewMovie();
                    cinema.addMovie(movie);
                    break;
                case 2:
                    System.out.println("Введіть день, до якого хочете додати сеанс: ");
                    String day = scanner1.next();
                    Movie movie1 = inputNewMovie();
                    System.out.println("Введіть час початку фільму: ");
                    Time timeOfStart = inputTime();
                    Seance seance = new Seance(movie1, timeOfStart);
                    if (timeOfStart.getHour() < cinema.getTimeOpen().getHour() ||
                        timeOfStart.getHour() > cinema.getTimeClose().getHour()) {
                        System.out.println("Кінотеатр буде закритий. Оберіть інший час.");
                    } else {
                        cinema.addSeance(seance, day);
                    }
                    break;
                case 3:
                    Movie movie3 = Main.inputNewMovie();
                    cinema.removeMovie(movie3);
                    break;
                case 4:
                    System.out.print("Введіть день, з якого хочете видалити сеанс:");
                    String day1 = scanner1.next();
                    Movie movie2 = inputNewMovie();
                    System.out.println("Введіть час початку фільму: ");
                    Time timeOfStart2 = inputTime();
                    cinema.removeSeance(new Seance(movie2, timeOfStart2), day1);
                    break;
                case 5:
                    cinema.showAllMoviesLibrary();
                    break;
                case 6:
                    System.out.print("Введіть день:");
                    String day2 = scanner1.next();
                    cinema.showScheduleOfTheDay(day2);
                    break;
                case 7:
                    cinema.showAllSchedule();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Такого пункту меню не існує");

            }
            System.out.println("Введіть потрібне число: ");
            showMenu();
            choice = scanner1.nextInt();
        }

    }

    private static void showMenu() {
        System.out.println("Меню: ");
        System.out.println("\t1. Додати фільм до фільмотеки.");
        System.out.println("\t2. Додати сенанс до розкладу.");
        System.out.println("\t3. Видалити фільм.");
        System.out.println("\t4. Видалити сеанс.");
        System.out.println("\t5. Вивести список усіх фільмів.");
        System.out.println("\t6. Вивести розклад фільмів на день.");
        System.out.println("\t7. Вивести весь розклад.");
        System.out.println("8.Вийти");
    }

    private static Time inputTime() throws Time.IllegalTimeFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Години: ");
        int hour = Integer.parseInt(scanner.nextLine());
        System.out.println("Хвилини: ");
        int min = Integer.parseInt(scanner.nextLine());

        return new Time(hour, min);
    }

    public static Movie inputNewMovie () throws Time.IllegalTimeFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву фільму");
        String titleOfMovie = scanner.next();
        Time durationOfMovie = inputTimeDuration();

        return new Movie(titleOfMovie, durationOfMovie);
    }

    public static Time inputTimeDuration () throws Time.IllegalTimeFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть тривалість фільму" );
        System.out.println("Години: ");
        int hour = scanner.nextInt();
        System.out.println("Хвилини: ");
        int min = scanner.nextInt();

        return new Time(min, hour);
    }



}
