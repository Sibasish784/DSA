// SUM OF 1ST 10 EVEN NUMBERS

package DAY2_Loops_IfElse.JAVA;

import java.util.Scanner;

public class SumOf10EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of 10 even numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int sum = 0;
        if (input % 2 != 0) input++;
        for (int i = 0; i < 10; i++) {
            sum = sum + input + (i * 2);
            // Here how this works:
            // i = 0: sum = 2 + (0 * 2) = 2
            // i = 1: sum = 2 + (1 * 2) = 4
            // i = 2: sum = 4 + (2 * 2) = 8
            // i = 3: sum = 8 + (3 * 2) = 14
            // i = 4: sum = 14 + (4 * 2) = 22
            // i = 5: sum = 22 + (5 * 2) = 32
            // i = 6: sum = 32 + (6 * 2) = 44
            // i = 7: sum = 44 + (7 * 2) = 58
            // i = 8: sum = 58 + (8 * 2) = 74
            // i = 9: sum = 74 + (9 * 2) = 92
        }
        System.out.println("The sum of next 10 even numbers is: " + sum);
        sc.close();
    }
}
