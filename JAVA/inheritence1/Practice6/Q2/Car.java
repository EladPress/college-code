public class Car extends Vehicle
{
    private double speed;
    
    public String toString()
    {
        return super.toString() + ", speed = " + this.speed;
    }

    public void drive(int speed)
    {
        this.speed = speed;
    }

    public Car()
    {
        super("Car", 150);
    }
}
