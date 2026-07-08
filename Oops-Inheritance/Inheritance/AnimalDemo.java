public class AnimalDemo {

    public static void main(String[] args) {

        // Creating Animal object
        Animal animal = new Animal();

        animal.eat();
        animal.sleep();


        // Creating Bird object
        Bird bird = new Bird();

        bird.eat();
        bird.sleep();
        bird.fly();
    }
}