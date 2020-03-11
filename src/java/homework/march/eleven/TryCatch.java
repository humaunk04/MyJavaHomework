package java.homework.march.eleven;

/* Java try and catch
The try statement allows you to define a block of code to be tested for errors
while it is being executed. The catch
statement allows you to define a block of code to be executed, if an error occurs in the try block.
 */
import java.util.Scanner;

public class TryCatch {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( " Enter a number?");
        try {
            int j = scan.nextInt();
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("Sorry please enter a number ");
        }


    }
}
