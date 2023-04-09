import java.util.Random;

public class Pardess 
{
    public static void main(String[] args)
    {
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Lemon();
        fruits[1] = new Pomelo();
        fruits[2] = new Orange();
        fruits[3] = new Apple();

        Random rand = new Random();
        Fruit ref = fruits[rand.nextInt(4)];
        if(ref instanceof Citrus)
        {
            Citrus c1 = (Citrus)ref;
            c1.squeeze();
        }

        for(int i = 0; i < fruits.length; i++)
        {
            System.out.println(fruits[i].toString() + ", color = " + fruits[i].color());
        }

        
    }    
}
