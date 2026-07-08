import java.util.Scanner;

public class Assignment8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();


        int starIndex = str.indexOf('*');


        String result = str.substring(0, starIndex - 1)
                + str.substring(starIndex + 2);


        System.out.println("Output: " + result);

        sc.close();
    }
}