public class Pigeon extends Bird 
{
    public Pigeon()
    {
        super();
    }    

    public String toString()
    {
        return super.toString() + " I am a pigeon. I bring peace !";
    }

    public void sound()
    {
        System.out.println("Uu Uu Uu...");
    }
}
