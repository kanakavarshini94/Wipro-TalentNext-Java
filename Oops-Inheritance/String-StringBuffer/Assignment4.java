//Write a java program that will return the firsthalf of the string, if the length of the string is even. It should return null for odd length string
import java.util.Scanner;

public class Assignment4
 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = null;

        // Check length is even or not
        if (str.length() % 2 == 0) {

            result = str.substring(0, str.length() / 2);

        }

        System.out.println("Output: " + result);

        sc.close();
    }
}