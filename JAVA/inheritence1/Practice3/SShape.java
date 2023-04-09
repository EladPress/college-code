//package Practice3;

public abstract class SShape 
{
    private String type;
    private int x = 0, y = 0;
    public void move(int dx, int dy)
    {
        this.x = dx;
        this.y = dy;
    }

    public abstract int getArea();
    public abstract void show();

    public SShape(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return "Type = " + this.type + ", X = " + this.x + ", y = " + this.y;
    }
}
