package homework.march.eighteen;

import java.util.ArrayList;

public class ArrayListsProj {
    public static void main (String [] args) {
      // This Array how you add manually.
        String[] country = new String[4];
        country[0] = "Bangladesh";
        country[1] = "United States";
        country[2] = "United Kingdom";
        country[3] = "Turkey";
        System.out.println(country [0]);

       // This is ArrayList ... More flexible
        ArrayList countryList = new ArrayList();
        countryList.add("Bangladesh");
        countryList.add("United States");
        countryList.add("United Kingdom");
        countryList.add("Turkey");
        countryList.remove(2);
        countryList.remove("Bangladesh");
        //countryList.clear();
        System.out.println(countryList.contains("India"));
        System.out.println(countryList);





    }
}
