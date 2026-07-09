import java.util.Random;


// Abstract class
abstract class Compartment {

    public abstract String notice();

}


// FirstClass child class
class FirstClass extends Compartment {

    public String notice() {
        return "First Class Compartment: Comfortable seats and AC facility available.";
    }

}


// Ladies child class
class Ladies extends Compartment {

    public String notice() {
        return "Ladies Compartment: This compartment is reserved for ladies.";
    }

}


// General child class
class General extends Compartment {

    public String notice() {
        return "General Compartment: General passengers can travel here.";
    }

}


// Luggage child class
class Luggage extends Compartment {

    public String notice() {
        return "Luggage Compartment: Only luggage is allowed in this compartment.";
    }

}


// Main class
public class TestCompartment {

    public static void main(String[] args) {


        // Array of Compartment size 10
        Compartment[] compartments = new Compartment[10];


        Random random = new Random();


        // Creating random compartments
        for(int i = 0; i < 10; i++) {


            int number = random.nextInt(4) + 1;


            switch(number) {

                case 1:
                    compartments[i] = new FirstClass();
                    break;


                case 2:
                    compartments[i] = new Ladies();
                    break;


                case 3:
                    compartments[i] = new General();
                    break;


                case 4:
                    compartments[i] = new Luggage();
                    break;

            }

        }


        // Polymorphic behavior
        for(int i = 0; i < compartments.length; i++) {

            System.out.println(
                "Compartment " + (i + 1) + ": "
                + compartments[i].notice()
            );

        }

    }
}