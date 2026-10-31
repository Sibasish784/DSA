// SUM OF EVEN NUMBERS BTN 20 TO 40 
package DAY2_Loops_IfElse.JAVA;

public class SumofEvenNbrBtn20to40 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i <= 40; i+=2) {
            sum += i;
        }
        System.out.println("The sum of even numbers between 20 and 40 is: " + sum);
    }
}
