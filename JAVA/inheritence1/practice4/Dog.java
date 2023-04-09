public class Dog extends Animal
{
    private String name;
    
    public Dog(String name)
    {
        super(4, "Dog");
        this.name = name;
    }

    public void eat()
    {
        System.out.println("Eating Dogli…");
    }

    public void sound()
    {
        System.out.println("Hav hav...");
    }
}
