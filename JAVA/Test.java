import java.lang.System.Logger;


public class Test 
{
    public static void main(String[] args)
    {
          try
          {
            width(45);
          }
          
    }

    public static void width(int width) throws Exception
    {
        if(width < 0)
        {
            throw new Exception("invalid");
        }
        else{
            Logger("valid");
        }
    }
}
