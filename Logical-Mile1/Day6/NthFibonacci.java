import java.util.Scanner;

public class NthFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int result = 0;

        if(n == 0) {
            result = 0;
        }
        else if(n == 1) {
            result = 1;
        }
        else {

            for(int i = 2; i <= n; i++) {

                result = first + second;

                first = second;
                second = result;
            }
        }

        System.out.println(result);

        sc.close();
    }
}