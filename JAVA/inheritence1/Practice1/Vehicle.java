package Practice1;

public class Vehicle
{
    private String model;
    private double maxVelocity;

    public Vehicle(double maxVelocity, String model)
    {
        this.maxVelocity = maxVelocity;
        this.model = model;
    }

    public String toString()
    {
        return "Model = " + this.model + ", max velocity = " + this.getMaxVelocity();
    }

    public double getMaxVelocity()
    {
        return this.maxVelocity;
    }

    public String getModel()
    {
        return this.model;
    }
}