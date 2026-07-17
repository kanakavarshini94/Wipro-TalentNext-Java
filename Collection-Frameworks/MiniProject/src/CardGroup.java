import java.util.*;

public class CardGroup {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number of Cards:");
        int n=sc.nextInt();

        TreeMap<Character,ArrayList<Card>> map=new TreeMap<>();

        for(int i=1;i<=n;i++){

            System.out.println("Enter card "+i+":");

            char symbol=sc.next().charAt(0);
            int number=sc.nextInt();

            map.putIfAbsent(symbol,new ArrayList<>());

            map.get(symbol).add(new Card(symbol,number));
        }

        System.out.println("Distinct Symbols are:");

        for(Character c:map.keySet())
            System.out.print(c+" ");

        System.out.println();

        for(Character c:map.keySet()){

            System.out.println("Cards in "+c+" Symbol");

            int sum=0;

            for(Card card:map.get(c)){
                System.out.println(card.symbol+" "+card.number);
                sum+=card.number;
            }

            System.out.println("Number of cards : "+map.get(c).size());
            System.out.println("Sum of Numbers : "+sum);
            sc.close();
        }
    }
}