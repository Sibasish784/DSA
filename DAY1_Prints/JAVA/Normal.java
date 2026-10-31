package DAY1_Prints.JAVA;
import java.util.Scanner;

/**
 * Normal
 */
public class Normal {

    public static void main(String[] args) {
        // Printing constant
        // System.out.println("Hey");
        
        // Printing Variables
        // var a = "Siba";
        // var b = 5;
        // System.out.println(a +","+ b);

        // Printing Input
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a value for a: ");
        // String a = sc.next();
        // System.out.println("Your entered value is: " + a);
    
        // Printing Operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value for A for sum: ");
        int a = sc.nextInt();
        System.out.println("Enter a Value for B for sum: ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("the Sum of A and B is: "+ c);
        sc.close();
    }
}