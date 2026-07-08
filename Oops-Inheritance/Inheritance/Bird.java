public class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("Bird is eating grains");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping on a tree");
    }

    public void fly() {
        System.out.println("Bird is flying in the sky");
    }
}