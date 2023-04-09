import java.util.*;
public class Test2 
{
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        double sum = 0;
        double num = 0;
        int counter = 0;
        do
        {
            sum += num;
            counter++;
            num = reader.nextDouble(); 
            
        }while(num >= 0);
        double avg = sum / (counter - 1);
        System.out.println(avg);
    }
}
