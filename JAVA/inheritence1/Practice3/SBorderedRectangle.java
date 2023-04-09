public class SBorderedRectangle extends SRectangle
{
    private char ch;

    public SBorderedRectangle(char ch, int height, int width)
    {
        super(height, width);
        this.ch = ch;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", ch = " + this.ch;
    }

    @Override
    public void show()
    {
        for(int i = 0; i < this.getWidth(); i++)
        {
            System.out.print(this.ch);

        }
        System.out.println();
        for(int i = 0; i < this.getHeight(); i++)
        {
            System.out.print(ch);
            for(int j = 0; j < this.getWidth(); j++)
            {
                System.out.print("*");
            }
            System.out.print(ch);
            System.out.println();
        }
        
        for(int i = 0; i < this.getWidth(); i++)
        {
            System.out.print(this.ch);

        }
    }
}