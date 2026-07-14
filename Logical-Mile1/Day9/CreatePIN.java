import java.util.Scanner;

public class CreatePIN {

    public static int smallestDigit(int n) {

        int min = 9;

        while(n != 0) {

            int digit = n % 10;

            if(digit < min) {
                min = digit;
            }

            n = n / 10;
        }

        return min;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alpha = sc.nextInt();
        int beta = sc.nextInt();
        int gamma = sc.nextInt();


        int a = smallestDigit(alpha);
        int b = smallestDigit(beta);
        int c = smallestDigit(gamma);


        System.out.println("" + a + b + c);

        sc.close();
    }
}