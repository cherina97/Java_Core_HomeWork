import java.util.Objects;
import java.util.Scanner;

public class Time {

    private int min;
    private int hour;

    public Time (int min, int hour) throws IllegalTimeFormatException {
        if ((min >= 0 || min <=60) && (hour >= 0 || hour <= 24)){
            this.setMin(min);
            this.setHour(hour);
        } else {
            throw new IllegalTimeFormatException("Помилка! Введений час повинен становити від 0 до 60 - для хвилин" +
                    "та від 0 до 24 - для годин! ");
        }
    }



    public static Time endTime (Time movieTime, Time startTime) throws IllegalTimeFormatException {
        int min = movieTime.getMin() + startTime.getMin();
        int hour = movieTime.getHour() + startTime.getHour();

        if (min >= 60 ){
            hour =+ 1;
            min =- 60;
        } else if (hour >= 24) {
            hour =- 24;
        }
        return new Time(min, hour);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return " Час {" +
                " хвилини =" + min +
                ", години =" + hour +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min &&
                hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }

    class IllegalTimeFormatException extends Exception {
         public IllegalTimeFormatException (String massage){
             super(massage);
         }
    }
}
