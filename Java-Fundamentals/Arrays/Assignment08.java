import java.util.Scanner;

public class Assignment08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        boolean ignore=false;

        for(int i=0;i<n;i++){

            if(arr[i]==6){
                ignore=true;
            }

            if(ignore==false){
                sum=sum+arr[i];
            }

            if(arr[i]==7 && ignore==true){
                ignore=false;
            }

        }

        System.out.println(sum);
        sc.close();

    }
}