import java.util.Scanner;

public class Assignment0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter n value: ");
        int n = sc.nextInt();


        // Get last n characters
        String lastChars = str.substring(str.length() - n);


        String result = "";

        // Repeat n times
        for (int i = 0; i < n; i++) {
            result = result + lastChars;
        }


        System.out.println("Output: " + result);

        sc.close();
    }
}