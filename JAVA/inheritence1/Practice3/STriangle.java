//package Practice3;

public class STriangle extends SShape
{
    private int width;
    private static int center = 0;
    private static int left = -1;
    private static int right = 1;
    private int mode;

    public STriangle()
    {
        super("Tringle");
        this.width = 0;
    }

    public STriangle(int width, int mode)
    {
        super("Triangle");
        this.width = width;
        this.mode = mode;
    }

    public void show()
    {
        if(this.mode == this.left)
        {
            
            for(int i = 1; i <= this.width; i++)
            {
                String str = "";
                for(int j = 1; j <= i; j++)
                {
                    str += "*";
                }
                System.out.println(str);
            }
        }

        if(this.mode == this.right)
        {
            for(int i = 0; i < this.width; i++)
            {
                String str = "";
                for(int j = this.width - 1; j > i; j--)
                {
                    str += " ";
                }
                for(int j = 0; j <= i; j++)
                {
                    str += "*";
                }
                System.out.println(str);
            }
        }

        if(this.mode == this.center)
        {
            for(int y = 1; y <= this.width; y++) {
                for(int x = 0; x < this.width; x++) {
                    if(x < width - y) {
                        System.out.print(" ");
                    }else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }

    public int getArea()
    {
        return (width * width) / 2;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", mode = " + this.mode + ", width = " + this.width;
    }

}
