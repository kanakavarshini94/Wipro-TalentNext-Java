import java.util.Scanner;

public class UniqueDigitsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] count = new int[10];

        int temp = num;

        while(temp != 0) {

            int digit = temp % 10;
            count[digit]++;

            temp = temp / 10;
        }


        int unique = 0;

        for(int i = 0; i < 10; i++) {

            if(count[i] == 1) {
                unique++;
            }
        }

        System.out.println(unique);

        sc.close();
    }
}