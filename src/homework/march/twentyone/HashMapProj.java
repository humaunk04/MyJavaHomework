package homework.march.twentyone;

import java.util.HashMap;

public class HashMapProj {
    public static void main(String [] args){
        HashMap< String, Integer > age = new HashMap< String, Integer>();
        age.put("Sabbir ",34);
        age.put("Mamun", 25);
        age.put("Juned",34);
        age.put("Jahid",36);
        age.put("Juned",34 );


        age.remove("Juned");
        System.out.println(age.containsValue(36));
        System.out.println(age.containsKey(36));
        System.out.println(age.size());
        //System.out.println(age.replace("Sabbir",45));
        System.out.println(age);
       /* try {
            age.put("Sabbir",34);
            age.put("Mamun", 25);
            age.put ("Jahid", 36);
            System.out.println(age.put("Juned",34);
        } catch (Exception e) {
            System.out.println("Please enter right String key and Integer value");


  */  }
}
