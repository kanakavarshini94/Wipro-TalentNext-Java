import java.util.Random;

class ColourDisplay implements Runnable {

    public void run() {

        String[] colours = {"white", "blue", "black", "green", "red", "yellow"};

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red found. Program stopped.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestColour {

    public static void main(String[] args) {

        Thread thread = new Thread(new ColourDisplay());

        thread.start();
    }
}