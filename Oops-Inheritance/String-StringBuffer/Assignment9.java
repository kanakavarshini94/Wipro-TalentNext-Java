import java.util.Scanner;

public class Assignment9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();


        String result = "";

        int maxLength = Math.max(a.length(), b.length());


        for (int i = 0; i < maxLength; i++) {

            if (i < a.length()) {
                result = result + a.charAt(i);
            }

            if (i < b.length()) {
                result = result + b.charAt(i);
            }
        }


        System.out.println("Output: " + result);

        sc.close();
    }
}