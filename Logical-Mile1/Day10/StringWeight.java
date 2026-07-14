import java.util.Scanner;

public class StringWeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();

        int weight = 0;


        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            weight = weight + (ch - 'A' + 1);
        }


        System.out.println(weight);

        sc.close();
    }
}