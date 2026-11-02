package DAY2_Loops_IfElse.JAVA;

public class SumOf1st10Numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of first 10 numbers is: " + sum);
    }
}
