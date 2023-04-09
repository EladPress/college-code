
public class Car {
	private double velocity;
	private double maxVelocity;
	//Constructors:
	public  Car(double maxVelocity) {
		this.maxVelocity=maxVelocity;
		velocity=0;
	}
    //Getters:
	public double getMaxVelocity() {
		return maxVelocity;
	}
	public double getVelocity() {
		return velocity;
	}
	public void drive(double v) throws TooLargeVelocityException,NegativeVelocityException{	
		if (v<0)
			throw new NegativeVelocityException("Can't " +
					"drive with negative velocity");

		if(v>maxVelocity)
			throw new TooLargeVelocityException("Can't " +
			"drive faster than maxVelocity: "+maxVelocity);

		velocity=v;
		System.out.println("Drive with velocity "+velocity);
	}
	
	
}
