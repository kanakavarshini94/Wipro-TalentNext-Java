import java.util.Scanner;

public class MostFrequentDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] frequency = new int[10];


        while(n != 0) {

            int digit = n % 10;

            frequency[digit]++;

            n = n / 10;
        }


        int max = 0;
        int result = 0;


        for(int i = 0; i < 10; i++) {

            if(frequency[i] > max) {

                max = frequency[i];

                result = i;
            }
        }


        System.out.println(result);

        sc.close();
    }
}