//remove x
import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();


        if (str.length() > 0) {

            if (str.charAt(0) == 'x') {
                str = str.substring(1);
            }


            if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
                str = str.substring(0, str.length() - 1);
            }
        }


        System.out.println("Output: " + str);

        sc.close();
    }
}