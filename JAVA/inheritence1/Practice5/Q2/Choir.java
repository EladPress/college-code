import java.util.Random;

public class Choir 
{
    public static void main(String[] args)
    {
        Singer[] singers = new Singer[4];
        singers[0] = new GirlSinger("Noga");
        singers[1] = new GirlSinger("Or");
        singers[2] = new BoySinger("Elad");
        singers[3] = new BoySinger("Adir");

        Random rand = new Random();
        Singer ref = singers[rand.nextInt(4)];
        if(ref instanceof BoySinger)
        {
            BoySinger boy = ref;
            boy.sing();
        }
        else
        {
            GirlSinger girl = ref;
            girl.sing();
        }

    }
}
