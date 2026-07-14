import java.util.Scanner;

public class HillWeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();

        int weight = h * (h + 1) / 2;

        System.out.println(weight);

        sc.close();
    }
}