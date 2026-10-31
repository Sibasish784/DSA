// SUM OF 10 NUMBERS
package DAY2_Loops_IfElse.JAVA;

import java.util.Scanner;

public class SumHW_For {
    public static void main(String[] args) {
        System.out.print("Enter a value for next 10 digit sum: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += input;
            input++;
        }
        System.out.println("The sum of next 10 numbers is: " + sum);
    }
}
