

public class Dog extends Animal implements Legs
{
    public Dog()
    {
        super("Dog");
    }

    public void sound()
    {
        System.out.println("Hav hav");
    }

    public int numberOfLegs()
    {
        return 4;
    }
}
