// SUM OF 10 NUMBERS
// SUM OF 1ST 10 EVNN NUMBERS
// SUM OF EVEN NUMBERS BTN 20 TO 40 
// -------BOTH BY USING IF ELSE AND LOOPS---------
package DAY2_Loops_IfElse.JAVA;

import java.util.Scanner;

public class HW_LOOPS {
    static int input;
    static int count = 0;
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for next 10 sum: ");
        input = sc.nextInt();
        // input = 20;
        sc.close();
        mainlogic();
    }
    public static void mainlogic(){
        if (count == 11)
        { 
            System.out.println("the sum of the 10 next numbers are : "+ sum);
            return;
        }

        // if(){
            if(input%2 ==0)
            {
                sum = sum + input;
                count++;
                input++;
                mainlogic();
            }
        // }
            else {
                input++;
                mainlogic();
            }
        
    }
}