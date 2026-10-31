package DAY1_Prints.JAVA;

import java.util.Scanner;

public class HW_AVG_and_PRODUCT {
    public static void main(String[] args) {
        // Input of 3 numbers then printing the product------------
        System.out.println("Enter 3 numbers as below");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for A: ");
        int a = sc.nextInt();
        System.out.print("Enter number for B: ");
        int b = sc.nextInt();
        System.out.print("Enter number for C: ");
        int c = sc.nextInt();

        int d = a*b*c;
        System.out.print("the product for this is: "+d);
        sc.close();


        // Taking numbers as input then printing the average---------------
        System.out.println("Taking the input and printing the AVG");
        System.out.print("Enter number for A: ");
        int a1 = sc.nextInt();
        System.out.print("Enter the number for B: ");
        int b1 = sc.nextInt();
        System.out.print("The avg for the A and B is: "+((a1+b1)/2) );
        sc.close();
    }
}
