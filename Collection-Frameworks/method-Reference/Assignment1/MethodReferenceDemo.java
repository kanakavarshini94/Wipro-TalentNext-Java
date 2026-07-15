public class MethodReferenceDemo {

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        // Instance Method Reference
        FactorialInterface fi = obj::factorial;

        int result = fi.calculate(5);

        System.out.println("Factorial = " + result);
    }
}
