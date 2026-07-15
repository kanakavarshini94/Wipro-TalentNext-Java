public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        // Constructor Reference
        PrimeInterface pi = Prime::new;

        pi.checkPrime(17);
        pi.checkPrime(20);
    }
}