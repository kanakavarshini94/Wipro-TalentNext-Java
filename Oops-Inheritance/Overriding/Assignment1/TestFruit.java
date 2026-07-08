public class TestFruit {

    public static void main(String[] args) {


        Fruit fruit = new Fruit("Fruit", "Sweet", "Medium");
        fruit.eat();


        Apple apple = new Apple("Apple", "Sweet", "Small");
        apple.eat();


        Orange orange = new Orange("Orange", "Sour", "Medium");
        orange.eat();

    }
}