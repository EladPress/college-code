import java.lang.System.Logger;
import java.lang.*;

public class Q1 
{
    public static double addPos(double num1, double num2) throws IllegalArgumentException
    {
        if(num1 <= 0 || num2 <= 0)
        {
            throw new IllegalArgumentException("num1 or num2 are not positive");
        }
        return num1 + num2;
    }    


    public static void main(String[] args)
    {
        double num1 = -64;
        double num2 = 432;
        try
        {
            System.out.println(addPos(num1, num2));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
}
