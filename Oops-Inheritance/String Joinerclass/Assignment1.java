import java.util.ArrayList;
import java.util.StringJoiner;

public class Assignment1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Sachin");
        names.add("Rahul");
        names.add("Virat");
        names.add("Dhoni");


        StringJoiner sj = new StringJoiner(",", "{", "}");


        names.forEach(name -> sj.add(name));


        System.out.println(sj);
    }
}