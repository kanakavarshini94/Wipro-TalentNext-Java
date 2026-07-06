// Write a program to initialize an integer array and print the sum and average of the array
public class Assignment01 {

    public static void main(String[] args) {

        // Step 1: Initialize the array
        int[] arr = {10, 20, 30, 40, 50};

        // Step 2: Store total sum
        int sum = 0;

        // Step 3: Traverse the array and add each element
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Step 4: Calculate average
        double average = (double) sum / arr.length;

        // Step 5: Print the result
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}