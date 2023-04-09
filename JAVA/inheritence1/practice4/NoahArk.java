import java.util.Random;

public class NoahArk 
{
    public static void main(String[] args)
    {
        LivingThing[] things = new LivingThing[4];
        things[0] = new Dog("Dina");
        things[1] = new Pigeon();
        things[2] = new Boy("Elad");
        things[3] = new Girl("Lia");

        Random rand = new Random();
        LivingThing ref = things[rand.nextInt(4)];
        System.out.println(ref.toString());
        ref.eat();
        ref.walk();
        if(ref instanceof Human)
        {
            Human h1 = (Human)ref;
            h1.speak();
        }
        if(ref instanceof Animal)
        {
            Animal a1 = (Animal)ref;
            a1.sound();
            if(a1 instanceof Bird)
            {
                Bird b1 = (Bird)a1;
                b1.fly();
            }
        }
    }
}
