public class RaceMain {

    public static void main(String[] args) {

        System.out.println("===== Hare and Tortoise Race =====");

        RaceThread hare = new RaceThread("Hare", true);
        RaceThread tortoise = new RaceThread("Tortoise", false);

        // Hare has higher priority
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}