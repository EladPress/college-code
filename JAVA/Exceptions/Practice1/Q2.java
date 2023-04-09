import java.util.Scanner;

public class Q2 
{
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter number:");
        boolean flag = false;
        String str = reader.next();
        int num = 0;
        double doubleNum = 0;
        try
        {
            double a = Double.parseDouble(str);
            a *= 10;
            try
            {
                int b = Integer.parseInt(str);
                System.out.println(b + 10);
                flag = true;
            }
            catch(NumberFormatException e)
            {
                //System.out.println(e);
                
            }
            if(!flag)
            {
                System.out.println(a);
            }
            
            
            
        }
        catch(NumberFormatException e)
        {
            e = new NumberFormatException("string can't be converted to int or double");
            System.out.println(e);
        }
        // switch(flag)
        // {
        //     case 1:
        //     System.out.println(num + 10);
        //     break;
        //     case 2:
        //     System.out.println(doubleNum * 10);
        //     break;
        //     default:
            
        // }
    }
}
