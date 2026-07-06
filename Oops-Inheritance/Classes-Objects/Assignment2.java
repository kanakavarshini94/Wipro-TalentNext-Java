class Calculator {

    // Static method for int values
    static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Static method for double values
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class Assignment2 {

    public static void main(String[] args) {

        System.out.println("Power of Integer = " + Calculator.powerInt(2, 3));

        System.out.println("Power of Double = " + Calculator.powerDouble(2.5, 3));

    }
}