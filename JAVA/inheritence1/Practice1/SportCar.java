package Practice1;

public class SportCar extends Car 
{
    private double engineVolume;
    public SportCar(double maxVelocity, String model, double engineVolume)
    {
       super(maxVelocity, model);
       this.engineVolume = engineVolume;
    } 
    @Override
    public String toString()
    {
        return "Model = " + super.getModel() + ", max velocity = " + this.getMaxVelocity() + ", engine volume = " + this.getEngineVolume();
    }

    public double getEngineVolume()
    {
        return this.engineVolume;
    }
}
