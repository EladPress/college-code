//package Practice3;

public class SSquare extends SShape
{
    private int width;
    
    public SSquare()
    {
        super("Square");
        this.width = 0;
    }

    public SSquare(int width)
    {
        super("Square");
        this.width = width;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", width = " + this.width;
    }

    public int getArea()
    {
        return this.width * this.width;
    }

    public void show()
    {
        for(int i = 0; i < this.width; i++)
        {
            for(int j = 0; j < this.width; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
