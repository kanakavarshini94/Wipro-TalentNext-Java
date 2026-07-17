import java.util.*;

public class CardMain {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<Character,Card> map=new LinkedHashMap<>();

        int count=0;

        while(map.size()<4){

            System.out.println("Enter a card:");

            char symbol=sc.next().charAt(0);
            int number=sc.nextInt();

            count++;

            if(!map.containsKey(symbol))
                map.put(symbol,new Card(symbol,number));
        }

        System.out.println("Four symbols gathered in "+count+" cards.");

        System.out.println("Cards in Set are:");

        TreeMap<Character,Card> sorted=new TreeMap<>(map);

        for(Card c:sorted.values()){
            System.out.println(c.symbol+" "+c.number);
        }
    }
}