package Practice1;

public class Car extends Vehicle 
{
    private double velocity;

    public Car(double maxVelocity, String model)
    {
        super(maxVelocity, model);
        this.velocity = 0;
    }

    @Override
    public String toString()
    {
        return "velocity = " + this.velocity + ", " + super.toString();
    }

    public void drive(double v)
    {
        if(v >= 0 && v <= super.getMaxVelocity())
        {
            this.velocity = v;
        }
    }

    public void wash()
    {
        System.out.println("Washing...");
    }
    
}
