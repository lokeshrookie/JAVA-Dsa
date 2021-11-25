import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(dtf.format(ld));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date and Time : " + localDateTime);
    }
}
