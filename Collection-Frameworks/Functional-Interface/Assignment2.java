import java.util.ArrayList;
import java.util.function.Function;

public class Assignment2{

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        Function<ArrayList<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (Integer num : list) {
                sum += num;
            }
            return sum;
        };

        int result = sumFunction.apply(numbers);

        System.out.println("Numbers : " + numbers);
        System.out.println("Sum of all elements : " + result);
    }
}