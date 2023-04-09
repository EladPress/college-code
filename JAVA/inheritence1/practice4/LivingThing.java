public abstract class LivingThing 
{
    private int legs;
    private String type;

    public abstract void eat();
    public LivingThing(int legs, String type)
    {
        this.legs = legs;
        this.type = type;
    }

    public void walk()
    {
        System.out.println("This animal walks on " + this.legs + " legs");
    }

    public String toString()
    {
        return "Type = " + this.type + ", number of legs = " + this.legs;
    }
}
