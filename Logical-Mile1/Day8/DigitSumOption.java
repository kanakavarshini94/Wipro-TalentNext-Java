import java.util.Scanner;

public class DigitSumOption {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int choice = sc.nextInt();

        int sum = 0;


        while(n != 0) {

            int digit = n % 10;


            if(choice == 1) {

                // Sum of even digits
                if(digit % 2 == 0) {
                    sum = sum + digit;
                }

            } else if(choice == 2) {

                // Sum of odd digits
                if(digit % 2 != 0) {
                    sum = sum + digit;
                }
            }


            n = n / 10;
        }


        System.out.println(sum);

        sc.close();
    }
}