public abstract class Vehicle implements Comparable<Vehicle>
{
    private String model;
    private double maxVelocity;

    public Vehicle(String model, double maxVelocity)
    {
        this.maxVelocity = maxVelocity;
        this.model = model;
    }

    public String toString()
    {
        return "Model = " + this.model + ", max velocity = " + this.maxVelocity;
    }

    public double getMaxVel()
    {
        return this.maxVelocity;
    }

    
    public int compareTo(Vehicle v) 
    {
		if(this.getMaxVel() > v.getMaxVel()) 
			return 1;
		else if(this.getMaxVel() < v.getMaxVel())
			return -1;
		else 
			return 0;
	}
}
