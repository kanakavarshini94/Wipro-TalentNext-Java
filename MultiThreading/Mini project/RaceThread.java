class RaceThread extends Thread {

    private static boolean raceFinished = false;
    private boolean hareSleep;

    public RaceThread(String name, boolean hareSleep) {
        super(name);
        this.hareSleep = hareSleep;
    }

    public void run() {

        for (int i = 1; i <= 100 && !raceFinished; i++) {

            System.out.println(getName() + " covered " + i + " meters");

            // Hare sleeps after 60 meters
            if (hareSleep && getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                return;
            }
        }

        if (!raceFinished) {
            raceFinished = true;
            System.out.println("\n***** " + getName() + " Wins the Race! *****");
        }
    }
}