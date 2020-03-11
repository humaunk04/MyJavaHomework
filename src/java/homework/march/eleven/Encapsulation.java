package java.homework.march.eleven;

// private can be access different class if we used set and get.

public class Encapsulation {
    private String name;
    private int age;
    // set
    public void setName(String newName) {
        name = newName;
    }
    // get
    public String getName() {
        return name;
    }
    // set
    public void setAge(int newAge){
        age = newAge;
    }
    // get
    public int getAge(){
        return age;
    }

}
