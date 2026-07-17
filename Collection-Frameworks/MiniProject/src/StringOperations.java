import java.util.*;

public class StringOperations {

    public static ArrayList<String> operate(String s1,String s2){

        ArrayList<String> list=new ArrayList<>();

        //1
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s1.length();i++){

            if(i%2==0)
                sb.append(s2);
            else
                sb.append(s1.charAt(i));
        }

        list.add(sb.toString());

        //2
        int first=s1.indexOf(s2);
        int last=s1.lastIndexOf(s2);

        if(first!=last){

            String rev=new StringBuilder(s2).reverse().toString();

            String ans=s1.substring(0,last)+rev+
                    s1.substring(last+s2.length());

            list.add(ans);

        }else{
            list.add(s1+s2);
        }

        //3

        if(first!=last){

            String ans=s1.replaceFirst(s2,"");
            list.add(ans);

        }else{
            list.add(s1);
        }

        //4

        int mid=(s2.length()+1)/2;

        String ans=s2.substring(0,mid)+
                s1+
                s2.substring(mid);

        list.add(ans);

        //5

        String result=s1;

        for(char ch:s2.toCharArray()){
            result=result.replace(ch,'*');
        }

        list.add(result);

        return list;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter S1:");
        String s1=sc.next();

        System.out.println("Enter S2:");
        String s2=sc.next();

        ArrayList<String> list=operate(s1,s2);

        System.out.println(list);
        sc.close();
    }
}