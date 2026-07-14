import java.util.Scanner;

public class NonRepeatedDigitsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] frequency = new int[10];

        int temp = num;


        while(temp != 0) {

            int digit = temp % 10;

            frequency[digit]++;

            temp = temp / 10;
        }


        int count = 0;

        for(int i = 0; i < 10; i++) {

            if(frequency[i] == 1) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}