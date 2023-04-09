public abstract class Human extends LivingThing
{
    private String name;
    public Human(String type, String name)
    {
        super(2, "Human");
        this.name = name;
    }

    public void speak()
    {
        System.out.println("Bla bla bla...");
    }

    @Override
    public String toString()
    {
        return super.toString() + ", name = " + this.name;
    }
}
