//RemoveFirstLast
import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();


        String result = str.substring(1, str.length() - 1);


        System.out.println("Output: " + result);

        sc.close();
    }
}