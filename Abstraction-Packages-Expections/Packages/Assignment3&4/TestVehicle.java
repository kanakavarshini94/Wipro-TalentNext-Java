import com.automobile.Honda;
import com.automobile.twowheeler.Hero;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestVehicle {

    public static void main(String[] args) {
        
        Logan logan = new Logan();

System.out.println("\nLogan Details");
System.out.println("Model Name: " + logan.getModelName());
System.out.println("Registration Number: " + logan.getRegistrationNumber());
System.out.println("Owner Name: " + logan.getOwnerName());
System.out.println("Speed: " + logan.speed());
System.out.println("GPS: " + logan.gps());



Ford ford = new Ford();

System.out.println("\nFord Details");
System.out.println("Model Name: " + ford.getModelName());
System.out.println("Registration Number: " + ford.getRegistrationNumber());
System.out.println("Owner Name: " + ford.getOwnerName());
System.out.println("Speed: " + ford.speed());
System.out.println("Temperature Control: " + ford.tempControl());
        Hero hero = new Hero();

        System.out.println("Hero Details");
        System.out.println("Model Name: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());

        hero.radio();



        System.out.println();


        Honda honda = new Honda();

        System.out.println("Honda Details");
        System.out.println("Model Name: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());

        honda.cdplayer();

    }
}