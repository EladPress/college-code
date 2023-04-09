public class Citrus extends Fruit implements Squeezable
{
    private boolean sq;

    public Citrus(String type)
    {
        super(type);
    }

    public void squeeze()
    {
        this.sq = true;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", am squeezed";
    }
    
    public String color()
    {
    	return "";
    }
}
