public class StaticMethodReferenceDemo {

    public static void main(String[] args) {

        // Static Method Reference
        DigitCountInterface dci = DigitCount::digitCount;

        int number = 123456;

        System.out.println("Number = " + number);
        System.out.println("Digit Count = " + dci.countDigits(number));
    }
}