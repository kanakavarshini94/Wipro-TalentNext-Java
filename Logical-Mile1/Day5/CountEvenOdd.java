import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 5; i++) {

            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

        sc.close();
    }
}