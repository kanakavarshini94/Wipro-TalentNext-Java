public class MyClassWithLambda {

    public static void main(String[] args) {

        // Lambda Expression
        WordCount wc = (str) -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            return str.trim().split("\\s+").length;
        };

        String sentence = "Java Lambda Expressions are easy";

        System.out.println("Sentence : " + sentence);
        System.out.println("Number of Words : " + wc.count(sentence));
    }
}