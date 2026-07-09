class Foundation {

    private int var1 = 10;

    int var2 = 20;          // default access

    protected int var3 = 30;

    public int var4 = 40;


    public void display() {

        System.out.println("Private var1: " + var1);
        System.out.println("Default var2: " + var2);
        System.out.println("Protected var3: " + var3);
        System.out.println("Public var4: " + var4);

    }
}


public class TestAccess {

    public static void main(String[] args) {


        Foundation obj = new Foundation();


        // Private variable
        // System.out.println(obj.var1);
        // Not accessible


        // Default variable
        System.out.println("Default var2: " + obj.var2);


        // Protected variable
        System.out.println("Protected var3: " + obj.var3);


        // Public variable
        System.out.println("Public var4: " + obj.var4);

    }
}