interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}


interface Fourwheeler {

    default void message() {
        System.out.println("Inside Fourwheeler");
    }
}


class Car implements Vehicle, Fourwheeler {

    @Override
    public void message() {

        // Calling Vehicle interface default method
        Vehicle.super.message();

        // Calling Fourwheeler interface default method
        Fourwheeler.super.message();

        System.out.println("Inside Car");
    }
}


public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car();

        car.message();
    }
}