import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Map;

class Country {

    Hashtable<String, String> M1 = new Hashtable<String, String>();

    // 1. Save Country and Capital
    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get Capital using Country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get Country using Capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create M2 (Capital -> Country)
    public Hashtable<String, String> swapKeyValue() {
        Hashtable<String, String> M2 = new Hashtable<String, String>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // 5. Create ArrayList of Countries
    public ArrayList<String> toArrayList() {
        ArrayList<String> list = new ArrayList<String>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }
}

public class Assignment6 {
    public static void main(String[] args) {

        Country obj = new Country();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Map M1 : " + obj.M1);

        System.out.println("Capital of India : " + obj.getCapital("India"));

        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("Map M2 : " + obj.swapKeyValue());

        System.out.println("Country List : " + obj.toArrayList());
    }
}