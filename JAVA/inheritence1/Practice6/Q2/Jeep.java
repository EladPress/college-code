public class Jeep extends Vehicle
{
    public double speed;
    
    public String toString()
    {
        return super.toString() + ", speed = " + this.speed;
    }

    public void drive(int speed)
    {
        this.speed = speed;
    }

    public Jeep()
    {
        super("Jeep", 100);
    }
}
