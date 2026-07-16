import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Assignment2 {

    public static void main(String[] args) {

        // First day of next month
        LocalDate firstDayNextMonth = LocalDate.now()
                                               .plusMonths(1)
                                               .withDayOfMonth(1);

        // First Sunday of next month
        LocalDate firstSunday = firstDayNextMonth.with(
                TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        // Second Sunday
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Second Sunday of Next Month : " + secondSunday);
    }
}