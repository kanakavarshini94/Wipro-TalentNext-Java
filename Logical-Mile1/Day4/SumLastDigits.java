import java.util.Scanner;

public class SumLastDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = (num1 % 10) + (num2 % 10);

        System.out.println(sum);

        sc.close();
    }
}