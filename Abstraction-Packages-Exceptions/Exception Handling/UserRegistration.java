public class UserRegistration {


    public void registerUser(String username, String userCountry)
            throws InvalidCountryException {


        if (!userCountry.equals("India")) {

            throw new InvalidCountryException(
                    "User Outside India cannot be registered"
            );

        } 
        else {

            System.out.println("User registration done successfully");

        }
    }


    public static void main(String[] args) {

        UserRegistration ur = new UserRegistration();


        try {

            ur.registerUser("Mickey", "US");

        } 
        catch (InvalidCountryException e) {

            System.out.println("InvalidCountryException");
            System.out.println(e.getMessage());

        }


        try {

            ur.registerUser("Mini", "India");

        } 
        catch (InvalidCountryException e) {

            System.out.println("InvalidCountryException");
            System.out.println(e.getMessage());

        }

    }
}