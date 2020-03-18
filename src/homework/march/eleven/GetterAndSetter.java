package homework.march.eleven;

public class GetterAndSetter {
    String name;
    int age;

    public static void main(String [] args) {
        GetterAndSetter a = new GetterAndSetter();

        a.setName("mamun");
        a.setAge(34);
        System.out.println(a.getAge());
        System.out.println(a.getName());

    }
    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    // Getter
    public String getName(){
        return this.name;
    }
    public Integer getAge(){
        return this.age;
    }


}
