import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class MainTask2 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        System.out.println("Date to local time: " + dateToLocalTime(date));
        System.out.println("Date to local date: " + dateToLocalDate(date));
        System.out.println("Date to local date and time: " + dateToLocalDateTime(date));

    }

    public static LocalTime dateToLocalTime(Date date){
        LocalTime localTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        return localTime;
    }
    public static LocalDate dateToLocalDate (Date date){
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate;
    }
    public static LocalDateTime dateToLocalDateTime(Date date){
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return localDateTime;
    }
}
