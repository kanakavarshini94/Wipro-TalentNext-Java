//Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
//The strings will not be the same length, but they may be empty (length 0).
//If input is "hi" and "hello", then output will be "hihellohi"
import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();


        String shortString;
        String longString;


        if (a.length() < b.length()) {
            shortString = a;
            longString = b;
        } 
        else {
            shortString = b;
            longString = a;
        }


        String result = shortString + longString + shortString;


        System.out.println("Output: " + result);

        sc.close();
    }
}