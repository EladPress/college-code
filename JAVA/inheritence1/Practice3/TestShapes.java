import java.util.Random;

public class TestShapes 
{
    public static void main(String[] args)
    {
        SShape[] shapes = new SShape[9];
        shapes[0] = new SSquare(4);
        shapes[1] = new SSquare(7);
        shapes[2] = new STriangle(9, 0);
        shapes[3] = new STriangle(4, -1);
        shapes[4] = new STriangle(10, 1);
        shapes[5] = new SRectangle(4, 9);
        shapes[6] = new SRectangle(8, 3);
        shapes[7] = new SBorderedRectangle('%', 10, 3);
        shapes[8] = new SBorderedRectangle('#', 12, 19);
        for(int i = 0; i < 5; i++)
        {
            Random rnd = new Random();
            rnd.nextInt(9);
            System.out.println(shapes[i].toString());
            shapes[i].show();
        }
    }
}
