

public class Zoo 
{
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Chicken();
        animals[2] = new Pegasus();

        for(int i = 0; i < animals.length; i++)
        {
            System.out.print(animals[i].getType() + ": ");
            if(animals[i] instanceof Chicken)
            {
                Chicken chicken = (Chicken)animals[i];
                
                System.out.print(chicken.numberOfLegs() + " legs, " + chicken.numberOfWings() + " wings, ");
            }
            if(animals[i] instanceof Pegasus)
            {
                Pegasus pegasus = (Pegasus)animals[i];
                System.out.print(pegasus.numberOfLegs() + " legs, " + pegasus.numberOfWings() + " wings, ");
            }
            if(animals[i] instanceof Dog)
            {
                Dog dog = (Dog)animals[i];
                System.out.print(dog.numberOfLegs() + " legs, ");
            }

            animals[i].sound();
        }
    }
}
