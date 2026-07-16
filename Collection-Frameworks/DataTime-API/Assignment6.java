import java.time.LocalTime;

public class Assignment6 {

    public static void main(String[] args) {

        // Current Time
        LocalTime currentTime = LocalTime.now();

        // Time before 5 hours and 30 minutes
        LocalTime beforeTime = currentTime.minusHours(5).minusMinutes(30);

        System.out.println("Current Time : " + currentTime);
        System.out.println("Time before 5 hours and 30 minutes : " + beforeTime);
    }
}