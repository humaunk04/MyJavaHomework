package java.homework.march.eleven;

/* Exceptions are events that occur during the execution of programs that disrupt the normal
flow of instructions (e.g. divide by zero, array access out of bound, etc.). In Java,
an exception is an object that wraps an error
event that occurred within a method and contains: Information about the error including its type.
 */
public class Exceptions {
    public static void main (String [] args){
        String[] name ={ "Mamun", "Sabbir", "Juned" };
        System.out.println(name [3]);

    }

}
