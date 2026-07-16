import java.util.ArrayList;
import java.util.function.Supplier;

public class Assignment8 {

    public static void main(String[] args) {

        Supplier<ArrayList<Integer>> primeSupplier = () -> {

            ArrayList<Integer> primeList = new ArrayList<>();
            int number = 2;

            while (primeList.size() < 10) {

                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeList.add(number);
                }

                number++;
            }

            return primeList;
        };

        ArrayList<Integer> primes = primeSupplier.get();

        System.out.println("First 10 Prime Numbers:");
        for (Integer prime : primes) {
            System.out.println(prime);
        }
    }
}