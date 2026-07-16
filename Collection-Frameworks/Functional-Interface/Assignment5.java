import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(16);
        numbers.add(25);
        numbers.add(18);
        numbers.add(36);
        numbers.add(40);
        numbers.add(49);
        numbers.add(50);
        numbers.add(64);
        numbers.add(81);

        Predicate<Integer> isPerfectSquare = num -> {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        };

        System.out.println("Perfect Square Numbers:");

        for (Integer num : numbers) {
            if (isPerfectSquare.test(num)) {
                System.out.println(num);
            }
        }
    }
}