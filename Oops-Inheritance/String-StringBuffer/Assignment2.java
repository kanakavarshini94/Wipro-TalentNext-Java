import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();


        // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        // Remove duplicate character at joining point
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            str2 = str2.substring(1);
        }


        String result = str1 + str2;


        System.out.println("Result: " + result);

        sc.close();
    }
}