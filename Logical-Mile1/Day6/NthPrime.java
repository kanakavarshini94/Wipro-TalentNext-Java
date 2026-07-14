import java.util.Scanner;

public class NthPrime {

    public static boolean isPrime(int num) {

        if(num <= 1) {
            return false;
        }

        for(int i = 2; i < num; i++) {

            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int number = 2;

        while(count < n) {

            if(isPrime(number)) {
                count++;
            }

            if(count == n) {
                break;
            }

            number++;
        }

        System.out.println(number);

        sc.close();
    }
}