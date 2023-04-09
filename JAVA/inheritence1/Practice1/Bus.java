package Practice1;

public class Bus extends Vehicle
{
    private double velocity;
    private int passengers;
    
    public Bus(String model, double maxVelocity, int passengers)
    {
        super(maxVelocity, model);
        this.passengers = passengers;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", velocity = " + this.velocity + ", passengers = " + this.passengers;
    }

    public void drive(double v)
    {
        if(v >= 0 && v <= super.getMaxVelocity())
        {
            this.velocity = v;
        }
    }
}
