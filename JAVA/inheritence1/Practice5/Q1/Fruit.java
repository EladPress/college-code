public abstract class Fruit 
{
    private String type;
    public abstract String color();
    public Fruit(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return "Type = " + this.type;
    }

    public String getType()
    {
        return this.type;
    }
}
