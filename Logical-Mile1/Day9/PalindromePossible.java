import java.util.Scanner;

public class PalindromePossible {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] frequency = new int[10];


        while(n != 0) {

            int digit = n % 10;

            frequency[digit]++;

            n = n / 10;
        }


        int oddCount = 0;


        for(int i = 0; i < 10; i++) {

            if(frequency[i] % 2 != 0) {
                oddCount++;
            }
        }


        if(oddCount <= 1) {
            System.out.println("Possible");
        }
        else {
            System.out.println("Not Possible");
        }

        sc.close();
    }
}