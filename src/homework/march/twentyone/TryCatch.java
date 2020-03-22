package homework.march.twentyone;

import java.util.Scanner;

public class TryCatch {
    public static void main(String [] args){
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
