class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

public class TestPriority {

    public static void main(String[] args) {

        MyThread max = new MyThread("MAX");
        MyThread min = new MyThread("MIN");
        MyThread norm = new MyThread("NORM");

        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);

        max.start();
        min.start();
        norm.start();
    }
}