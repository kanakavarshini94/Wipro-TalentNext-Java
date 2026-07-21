class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName());
    }
}

public class TestThread {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Scooby");
        MyThread thread2 = new MyThread("Shaggy");

        thread1.start();
        thread2.start();
    }
}