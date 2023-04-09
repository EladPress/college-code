public abstract class Bird extends Animal
{
    public Bird()
    {
        super(2, "Bird");
    }

    public void eat()
    {
        System.out.println("Eating grains… Yummy…");
    }

    public void fly()
    {
        System.out.println("I can fly…");
    }
}
