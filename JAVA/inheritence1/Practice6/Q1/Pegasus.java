
public class Pegasus extends Animal implements Wings, Legs
{
    public Pegasus()
    {
        super("Pegasus");
    }

    public int numberOfLegs()
    {
        return 4;
    }

    public int numberOfWings()
    {
        return 2;
    }

    public void sound()
    {
        System.out.println("Hiiiiiiii");
    }

    
}
