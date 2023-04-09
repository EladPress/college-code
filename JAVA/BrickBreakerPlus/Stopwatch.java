import java.awt.*;

public class Stopwatch extends Thread
{
    private int secs, mins;//, hours;
    String time[] = new String[3];
    
    public Stopwatch()
    {
        this.secs = 0;
        this.mins = 0;
        this.time[0] = "00";
        this.time[1] = ":";
        this.time[2] = "00";
    }
    public Stopwatch(Stopwatch s)
    {
        this.secs = s.secs;
        this.mins = s.mins;
        this.time[1] = ":";
        this.setTime();
    }
    public Stopwatch(int time[])
    {
        this.mins = time[0];
        this.secs = time[1];
        this.time[1] = ":";
        this.setTime();
    }
    public int getSecs()
    {
        return this.secs;
    }
    public int getMins()
    {
        return this.mins;
    }
    public void setMins(int offset)
    {
        this.mins += offset;
    }
    public void setSecs(int offset)
    {
        this.secs += offset;
        if(this.getSecs() >= 60)
        {
            this.secs -= 60;
            this.setMins(1);
        }
    }
    public void setTime()
    {
        this.time[0] = Integer.toString(this.getMins());
        this.time[2] = Integer.toString(this.getSecs());
        if(this.getMins() < 10)
        {
            this.time[0] = "0" + this.time[0];
        }
        if(this.getSecs() < 10)
        {
            this.time[2] = "0" + this.time[2];
        }
    }
    public void setTime(String time)
    {

    }
    public String getTime()
    {
        return this.time[0] + this.time[1] + this.time[2];
    }
    public void run()
    {
        while(true)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            this.setSecs(1);
            //System.out.println(this.getMins() + ":" + this.getSecs());
            this.setTime();
            System.out.println(this.getTime());
        }
    }
}
