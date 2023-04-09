package Practice1;

public class Garage 
{
    private Car car;
    private SportCar sportCar;
    private Bus bus;

    public Garage()
    {
        car = new Car(180, "Model S");
        sportCar = new SportCar(300, "Roadster", 1400);
        bus = new Bus("big", 140, 40);
    }

    public void doIt()
    {
        car.drive(100);
        sportCar.drive(200);
        bus.drive(70);
        System.out.println("car{"+ car.toString() + "}, sport car{" + sportCar.toString() + "}, bus{" + bus.toString());
    }

    public static void main(String[] args)
    {
        Garage garage = new Garage();
        garage.doIt();
    }
}
