import java.util.Objects;
import java.util.Scanner;

public class Movie {

    private String title;
    private Time duration;



    public Movie(String title, Time duration) throws Time.IllegalTimeFormatException {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Фільм {" +
                "назва фільму ='" + title + '\'' +
                ", тривалість фільму =" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                Objects.equals(duration, movie.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }
}
