

public abstract class Animal 
{
    private String type;

    public Animal(String type)
    {
        this.type = type;
    }

    public abstract void sound();

    public String getType()
    {
        return this.type;
    }

    
}
