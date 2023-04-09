

public abstract class Bird extends Animal implements Legs, Wings
{
    public Bird(String type)
    {
        super(type);
    }

    public int numberOfWings()
    {
        return 2;
    }
    public int numberOfLegs()
    {
        return 2;
    }
}
