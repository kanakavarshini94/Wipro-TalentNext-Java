import java.util.Scanner;

public class Day3Programs {

    // 1. Is Even?
    public static int isEven(int input) {
        if (input % 2 == 0) {
            return 2;
        }
        return 1;
    }

    // 2. Is Odd?
    public static int isOdd(int input) {
        if (input % 2 != 0) {
            return 2;
        }
        return 1;
    }

    // 3. Return last digit of the given number
    public static int lastDigit(int input) {
        return Math.abs(input % 10);
    }

    // 4. Return second last digit of the given number
    public static int secondLastDigit(int input) {
        input = Math.abs(input);

        if (input < 10) {
            return -1;
        }

        return (input / 10) % 10;
    }

    // 5. Sum of last digits of two numbers
    public static int addLastDigits(int input1, int input2) {
        int digit1 = Math.abs(input1 % 10);
        int digit2 = Math.abs(input2 % 10);

        return digit1 + digit2;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for Even check: ");
        int num = sc.nextInt();

        System.out.println("Is Even Result: " + isEven(num));

        System.out.println("Is Odd Result: " + isOdd(num));

        System.out.println("Last Digit: " + lastDigit(num));

        System.out.println("Second Last Digit: " + secondLastDigit(num));


        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum of Last Digits: " + addLastDigits(a, b));

        sc.close();
    }
}