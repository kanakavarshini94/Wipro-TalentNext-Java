class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}


public class PersonAge {


    public static void validateAge(int age)
            throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                    "Age should be greater than or equal to 18"
            );

        }

        if (age >= 60) {

            throw new InvalidAgeException(
                    "Age should be less than 60"
            );

        }

    }


    public static void main(String[] args) {


        try {

            if (args.length != 2) {

                throw new InvalidAgeException(
                        "Please enter name and age as command line arguments"
                );

            }


            String name = args[0];

            int age = Integer.parseInt(args[1]);


            validateAge(age);


            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Valid age");


        }

        catch (NumberFormatException e) {

            System.out.println("Age should be an integer");

        }

        catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }

        catch (Exception e) {

            System.out.println("Invalid input");

        }

    }
}