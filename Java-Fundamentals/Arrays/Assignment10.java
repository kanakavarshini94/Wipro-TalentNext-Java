public class Assignment10 {

    public static void main(String[] args) {

        int[] arr = {5, 8, 3, 6, 1, 4};

        int[] result = new int[arr.length];

        int j = 0;

        // Store even numbers
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                result[j] = arr[i];
                j++;

            }
        }

        // Store odd numbers
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                result[j] = arr[i];
                j++;

            }
        }

        // Print result
        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");

        }
    }
}
