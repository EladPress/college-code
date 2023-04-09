import java.util.Arrays;

public class TestVehicle 
{
    public static void main(String[] args)
    {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Jeep();
        vehicles[2] = new SportCar();
        Arrays.sort(vehicles);

        for(int i = 0; i < vehicles.length; i++)
        {
            System.out.println(vehicles[i].toString());
        }
    }
}
