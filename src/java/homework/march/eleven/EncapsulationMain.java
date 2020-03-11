package java.homework.march.eleven;

public class EncapsulationMain {
    public static void main (String [] args) {
        Encapsulation a = new Encapsulation();
        a.setName("mamun");
        a.setAge(34);

        System.out.println(a.getName());
        System.out.println(a.getAge());
    }
}
