import java.util.TreeSet;
import java.util.Iterator;

class Country {
    TreeSet<String> H1 = new TreeSet<String>();

    // Method to add country
    public TreeSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // Method to search country
    public String getCountry(String countryName) {
        Iterator<String> it = H1.iterator();

        while (it.hasNext()) {
            String country = it.next();
            if (country.equals(countryName)) {
                return country;
            }
        }

        return null;
    }
}

public class Assignment4 {
    public static void main(String[] args) {

        Country obj = new Country();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries: " + obj.H1);

        System.out.println("Search India: " + obj.getCountry("India"));
        System.out.println("Search Canada: " + obj.getCountry("Canada"));
    }
}