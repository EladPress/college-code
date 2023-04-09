package Practice2;

public class TableSetting 
{
    private int hosts;
    Spoon[] spoons;
    Knife[] knives;
    Fork[] forks;
    DinnerPlate[] dinnerPlates;
    WineGlass[] wineGlasses;
    
    public TableSetting(int hosts)
    {
        
        this.hosts = hosts;
        spoons = new Spoon[this.hosts];
        knives = new Knife[this.hosts];
        forks = new Fork[this.hosts];
        dinnerPlates = new DinnerPlate[this.hosts];
        wineGlasses = new WineGlass[this.hosts];
        for(int i = 0; i < this.hosts; i++)
        {
            spoons[i] = new Spoon();
            knives[i] = new Knife();
            forks[i] = new Fork();
            dinnerPlates[i] = new DinnerPlate();
            wineGlasses[i] = new WineGlass();
        }
        
    }

    public void show()
    {
        for(int i = 0; i < this.hosts; i++)
        {
            System.out.println("Host " + (i + 1) + ":" + spoons[i].toString() + "," + forks[i].toString() + ", " + knives[i].toString() + ", " + dinnerPlates[i].toString() + ", " + wineGlasses[i].toString() + "\n");
        }
    }

    public static void main( String[] args)
    {
        TableSetting tableSetting = new TableSetting(5);
        tableSetting.show();
    }
}
