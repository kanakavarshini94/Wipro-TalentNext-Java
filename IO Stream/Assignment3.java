import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();

        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();

        Map<String, Integer> wordCount = new TreeMap<>();

        try (Scanner fileReader = new Scanner(new FileReader(inputFile))) {

            while (fileReader.hasNext()) {
                String word = fileReader.next();

                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }

            FileWriter fw = new FileWriter(outputFile);

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                fw.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }

            fw.close();

            System.out.println("Word count written to output file.");

        } catch (IOException e) {
            System.out.println("Error while processing file.");
        }

        sc.close();
    }
}