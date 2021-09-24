import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Test for task 1
        LocalDateTime monday = LocalDateTime.of(2021, 8, 2, 20, 0);
        LocalDateTime saturday = LocalDateTime.of(2021, 8, 7, 16, 0);
        long days = ChronoUnit.DAYS.between(monday, saturday);
        long hours = ChronoUnit.HOURS.between(monday, saturday);
        long minutes = ChronoUnit.MINUTES.between(monday, saturday);
        long seconds = ChronoUnit.SECONDS.between(monday, saturday);

        System.out.println("Different between our lessons is " + days
                + " days, or " + hours + " hours, or "
                + minutes + " minutes, or "
                + seconds + " seconds");

        // Test for task 2

        Duration durationOfLesson = Duration.ofHours(2);
        System.out.println("Duration of 1 lesson in minutes:  " + durationOfLesson.toMinutes()
                + "\nin seconds: " + durationOfLesson.toSeconds());

        // Test for task 3

        String timeForParsing = "1999/Jun/18 07:34:56 PM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd h:mm:ss a", Locale.ENGLISH);
        LocalDateTime localDateTime = LocalDateTime.parse(timeForParsing, formatter);
        System.out.println(localDateTime);

        // Test for task 4

        DateTimeFormatter formatterForStringOutput = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd");
        LocalDateTime timeForFormat = LocalDateTime.now();
        String outputFromLocalDate = timeForFormat.format(formatterForStringOutput);
        System.out.println(outputFromLocalDate);

    }
}
