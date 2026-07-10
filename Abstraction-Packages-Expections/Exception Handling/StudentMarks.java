import java.util.Scanner;

class NegativeValueException extends Exception {

    public NegativeValueException(String message) {
        super(message);
    }
}


class OutOfRangeException extends Exception {

    public OutOfRangeException(String message) {
        super(message);
    }
}


public class StudentMarks {


    public static void checkMarks(int marks)
            throws NegativeValueException, OutOfRangeException {

        if (marks < 0) {
            throw new NegativeValueException(
                    "Marks cannot be negative"
            );
        }

        if (marks > 100) {
            throw new OutOfRangeException(
                    "Marks should be between 0 and 100"
            );
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {

            System.out.println("Enter student 1 name");
            String name1 = sc.nextLine();

            int total1 = 0;

            System.out.println("Enter marks in 3 subjects");

            for (int i = 0; i < 3; i++) {

                int marks = Integer.parseInt(sc.nextLine());

                checkMarks(marks);

                total1 = total1 + marks;
            }


            System.out.println("Enter student 2 name");
            String name2 = sc.nextLine();

            int total2 = 0;

            System.out.println("Enter marks in 3 subjects");

            for (int i = 0; i < 3; i++) {

                int marks = Integer.parseInt(sc.nextLine());

                checkMarks(marks);

                total2 = total2 + marks;
            }


            double average1 = total1 / 3.0;
            double average2 = total2 / 3.0;


            System.out.println(name1 + " Average Marks = " + average1);
            System.out.println(name2 + " Average Marks = " + average2);


        }
        catch (NumberFormatException e) {

            System.out.println("java.lang.NumberFormatException");

        }
        catch (NegativeValueException e) {

            System.out.println(e.getMessage());

        }
        catch (OutOfRangeException e) {

            System.out.println(e.getMessage());

        }
        finally {

            sc.close();

        }
    }
}