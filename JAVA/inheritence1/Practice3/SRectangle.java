package Practice3;

public class SRectangle extends SShape
{
    private int height;
    private int width;
    
    public SRectangle()
    {
        super("Rectangle");
        this.height = 0;
        this.width = 0;
    }

    public SRectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", width = " + this.width + ", height = " + this.height;
    }

    public int getArea()
    {
        return this.width * this.height;
    }

    public void show()
    {
        for(int i = 0; i < this.height; i++)
        {
            for(int j = 0; j < this.width; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int getWidth()
    {
        return this.width;
    }
    public int getHeight()
    {
        return this.height;
    }
}
