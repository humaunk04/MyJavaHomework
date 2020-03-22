package homework.march.twentyone;

import java.util.HashSet;
import java.util.Iterator;


public class Set {
    public static void main(String [] args){
        HashSet<String> nameset = new HashSet<String>();

        nameset.add("Mamun");
        nameset.add("Jahid");
        nameset.add("Tauhid");
        nameset.add("Juned");
        nameset.add("Mahsuk");
        nameset.add("Sabbir");
        nameset.add("Juned");

        nameset.remove("Juned");
        //nameset.clear();
       // System.out.println(nameset.contains("Juned"));
        //System.out.println(nameset.size());
        //System.out.println(nameset);

       /* try {
            nameset.add("Mamun" + "Jahid" + "Tauhid" + "Mahsuk" + "Sabbir");
            System.out.println("Juned");
        } catch (Exception e) {
            System.out.println("Please Enter Right Name");
        } */

        Iterator<String> it = nameset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }

}
