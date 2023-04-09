//package solution;

import java.util.*;

//import javax.lang.model.util.ElementScanner14;
public class LRU_LFU 
{
    static int[] ws;
    static int[] recentCounter;
    static String refeString;
    static int swapCounter = 0;
    static int[] usedCounter; 
    static int[] timeCounter;
    static ArrayList<Integer> lfus;
    static ArrayList<Couple> contactCounter;
    static ArrayList<Couple> swapOutCounter;

    
    static int pfs = 0;
    static float missRatio;
    

    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        //String refeString;
        println("enter reference string:");
        refeString = reader.next();
        println("enter workset:");


        ws = new int[reader.nextInt()];
        recentCounter = new int[ws.length];
        usedCounter = new int[ws.length];
        timeCounter = new int[ws.length];
        lfus = new ArrayList<Integer>();
        contactCounter = new ArrayList<Couple>();
        swapOutCounter = new ArrayList<Couple>();
        missRatio = refeString.length();

        println("LRU(1) OR LFU(2)?");
        int choice = reader.nextInt();
        
        for(int i = 0; i < ws.length; i++)
        {
            recentCounter[i] = -1;
            usedCounter[i] = 0;
            timeCounter[i] = 0;
            ws[i] = -1;
        }
            
        if(choice == 1)
            lru();
        else
            lfu();

        printFinal();
        //print(ws[0] + ", " + ws[1] + ", " + ws[2]);
        
        
    }

    public static void lfu()
    {
        while(refeString.length() > 0)
        {
            int pexists = pExists(refeString.charAt(0) - '0');
            if(wsEmpty() != -1)
            {
                if(pexists == -1)
                    swap(wsEmpty());
                else
                    ignore(pexists);   
            }
            else if(pexists != -1)
            {
                ignore(pexists);
            }
            else
            {
                findMatchingLfu(findLfu());
                //fifo should work no matter the size of arraylist, may be a problem later, hopefully not :)
                swap(fifo());
            }


            incrementStep();
            for(int i = 0; i < lfus.size(); i++)
                lfus.remove(i);


        }
    }

    public static void lru()//
    {
        
        while(refeString.length() > 0)
        {
            int pexists = pExists(refeString.charAt(0) - '0');
            if(wsEmpty() != -1)
            {
                if(pexists == -1)
                    swap(wsEmpty());
                else
                    ignore(pexists);
                
                
            }
            else if(pexists != -1)
            {
                ignore(pexists);
            }
            else
            {
                swap(findlru());
            }
            //jump1:
            incrementStep();
        }
    }

    public static void printResult(String type, int focusIndex)//prints result of current step of algorithm
    {
        String str = type + ": ";
        int i;
        for(i = 0; i < ws.length; i++)
        {
            String toAdd;
            //String tempStr = Integer.toString(ws[i]);
            if(focusIndex == i)
                toAdd = "[" + Integer.toString(ws[i]) + "] ";
            else
                toAdd = Integer.toString(ws[i]) + " ";
            str+= toAdd;

            
        }
        System.out.println(str);
        
    }

    public static void printFinal()//prints summary after algorithm finishes
    {
        missRatio = (float)pfs / missRatio;

        println();
        println("Page faults: " + pfs);
        println("Miss ratio: " + String.format("%.2f", missRatio));
        print("Ignore: ");
        for(int i = 0; i < contactCounter.size(); i++)
        {
            print(contactCounter.get(i).a + ": " );
            print(Integer.toString(contactCounter.get(i).b));
            print(", ");
        }
        println();
        print("Swap out: ");
        //print(Integer.toString(swapOutCounter.size()));
        for(int i = 0; i < swapOutCounter.size(); i++)
        {
            print(swapOutCounter.get(i).a + ": " + swapOutCounter.get(i).b + ", ");
        }
        println();

        println();
    }

    public static int findlru()//finds least recently used process, returns the index in workset
    {
        int max = 0, maxIndex = 0;
        for(int i = 0; i < ws.length; i++)
        {
            if(recentCounter[i] > max)
            {
                max = recentCounter[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findLfu()//finds least frequently used, returns index
    {
        int min = usedCounter[0], minIndex = 0;
        for(int i = 1; i < ws.length; i++)
        {
            if(usedCounter[i] < min)
            {
                min = usedCounter[i];
                minIndex = i;
            }
        }
        return min;
    }

    public static void findMatchingLfu(int min)//builds arraylist with the least frequently used
    {
        for(int i = 0; i < ws.length; i++)
        {
            if(usedCounter[i] == min)
            {
                lfus.add(i);
            }
        }
        
    }

    public static int fifo()//returns the index which has been in cache the longest
    {
        int maxTime = 0, maxIndex = 0;
        for(int i = 0; i < lfus.size(); i++)
        {
            if(timeCounter[lfus.get(i)] > maxTime)
            {
                maxTime = timeCounter[lfus.get(i)];
                maxIndex = lfus.get(i);
            }
        }
        return maxIndex;
    }
    
    public static int pExists(int p)//checks if p exists already in the cache, if true returns the index, -1 otherwise
    {
        for(int i = 0; i < ws.length; i++)
        {
            if(ws[i] == p)
                return i;
        }
        return -1;
    }

    public static int wsEmpty()//checks if there's an empty slot in the workspace, returns index if true, -1 otherwise
    {
        for(int i = 0; i < ws.length; i++)
        {
            if(ws[i] == -1)
                return i;
        }
        return -1;
    }

    public static void swap(int i)//swaps in the current process into ws[i]
    {
        if(ws[i] != -1)
            addToSwapOutCounter(ws[i]);
        ws[i] = refeString.charAt(0) - '0';
        
        recentCounter[i] = -1;

        printResult("Page Fault " + pfs, i);
        swapCounter++;
        usedCounter[i] = 1;//
        timeCounter[i] = 0;
        pfs++;
    }

    public static void ignore(int i)//performs contact on the current process
    {
        recentCounter[i] = -1;
        usedCounter[i]++;
        printResult("Ignore", i);
        addToContactCounter(ws[i]);
        //timeCounter[i] = 1;
    }

    public static void incrementStep()// moves to the next step in the algorithm
    {
        for(int i = 0; i < ws.length; i++)
        {
            recentCounter[i]++;
            if(ws[i] != -1)
                timeCounter[i]++;
            
        }
        refeString = refeString.substring(1);
    }

    
    public static void addToContactCounter(int index)//handles the counter of contacts
    {
        for(int i = 0; i < contactCounter.size(); i++)
        {
            if(contactCounter.get(i).a == index)
            {
                contactCounter.get(i).b++;
                return;
            }
        }
        contactCounter.add(new Couple(index, 1));

    }

    public static void addToSwapOutCounter(int p)//handles counter of swap outs
    {
        for(int i = 0; i < swapOutCounter.size(); i++)
        {
            if(swapOutCounter.get(i).a == p)
            {
                swapOutCounter.get(i).b++;
                return;
            }
            
        }
        swapOutCounter.add(new Couple(p, 1));
    }

    public static void print(String str)
    {
        System.out.print(str);
    }
    public static void println(String str)
    {
        System.out.println(str);
    }
    public static void println()
    {
        System.out.println();
    }
}
