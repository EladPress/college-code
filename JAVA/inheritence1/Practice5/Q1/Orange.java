public class Orange extends Citrus
{
    public Orange()
    {
        super("Orange");
    }

    public String color()
    {
        return "orange";
    }

    public void peel()
    {
        System.out.println("The orange is ready to eat");
    }
}
