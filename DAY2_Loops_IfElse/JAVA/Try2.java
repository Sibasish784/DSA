package DAY2_Loops_IfElse.JAVA;

public class Try2 {
    static  int input = 20;
    static int sum = 0; 
    static int count = 0;
    public static void main(String[] args) {
        mainlogic();
    }
    public static void mainlogic()
    {
        if (count == 11)
        {
            System.out.println("the sum is: "+sum);
        }
        else{
            if(input%2==0)
            {
                sum = sum + input;
                count++;
            }
            input++;
            mainlogic();
        }
    }
}
