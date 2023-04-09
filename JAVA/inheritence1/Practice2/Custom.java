package Practice2;

public class Custom 
{
    private String type;
    
    public Custom(String type)
    {
        this.type = type;
        System.out.println(type + " constructor");
    }

    public String toString()
    {
        return this.type;
    }
}
