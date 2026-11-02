// Given an integer n. Your task is to calculate the sum of all
// natural numbers from 1 up to n (inclusive). If n is 0, the sum
// should be 0.

package DAY3_Functions.JAVA;

public class Functions {
    public static int function_factorial (int nur)
    {
        if (nur == 0)
        {
            return 0;
        }
        int sum = nur*(nur+1)/2;
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("sum is");
        int n = 10;
        int fact = function_factorial(n);
        System.out.println(fact);
    }
}


// in java function is defined using the return type, followed by the function name, followed by parentheses (), followed by a block of code inside curly braces {}
// the function name should be descriptive and follow the camelCase naming convention
// it can take parameters (arguments) inside the parentheses
// it can return a value using the return statement
// it can be called by its name followed by parentheses (), multiple times
// it can be defined anywhere in the program
// it can be defined before or after it is called

