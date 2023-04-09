//package solution;

import java.lang.ref.Reference;
import java.util.Scanner;
import java.util.Arrays;


public class Main 
{
    static int[] wsArr;
    static int[] timeCounters;
    static String referenceString;

    static int faultCounter = 0;
    static int[] swapOutCounter;
    static int[] swapInCounter;

    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
       
        System.out.println("input reference string:");
        referenceString = reader.next();
        System.out.println("input working set:");
        wsArr = new int[reader.nextInt()];
        System.out.println("FIFO(1) or LIFO?(2)"); 
        timeCounters = new int[wsArr.length];
        int choice = reader.nextInt();

        swapInCounter = new int[10];
        swapOutCounter = new int[10];
        for(int i = 0; i < 10; i++)
        {
            swapInCounter[i] = 0;
            swapOutCounter[i] = -1;
        }
        /*for(int i = 0; i < referenceString.length(); i++)
        {
            swapInCounter[referenceString.charAt(i) - '0']++;
        }*/

        if(choice == 1)
            fifo(wsArr, referenceString, timeCounters);
        if(choice == 2)
            lifo(wsArr, referenceString, timeCounters);
        
        //System.out.println(referenceString.substring(1));
    }

    public static void printFinal()
    {
        System.out.println();
        System.out.print("Swap In: ");
        for(int i = 0; i < 10; i++)
        {
            if(swapInCounter[i] != 0)
            {
                System.out.print(i + "= " + 1 + ", ");
            }
                
        }
        System.out.println();
        System.out.print("Swap Out: ");
        for(int i = 0; i < 10; i++)
        {
            if(swapOutCounter[i] != -1)
                System.out.print(i + "= " + swapOutCounter[i] + ", ");
        }
        System.out.println();
        System.out.println("Page Faults: " + faultCounter);
    }


    public static void printResult(String type, int[] ws, int focusIndex)
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

    public static void fifo(int[] ws, String rs, int[] tc)
    {
        //timeCounters = new int[tc];
        int i, j;
        for(i = 0; i < ws.length; i++)
        {
            ws[i] = -1;
        }
        outerLoop:
        while(rs.length() > 0)
        {
            //System.out.println(rs.length());
            //outerLoop:
            for(i = 0; i < ws.length; i++)// Check if process exists in RAM
            {
                if(ws[i] == rs.charAt(0) - '0')
                {
                    
                    for(j = 0; j<tc.length; j++)// increment time counters for all proccesses
                        tc[j]++;

                    rs = rs.substring(1);
                    printResult("Ignore", ws, i);
                    //System.out.println(rs.length());
                    continue outerLoop;//////////////////////////////////
                    //System.out.println(rs.length());
                }

            }

            for(i = 0; i < ws.length; i++)//Check if there's an empty slot
            {
                
                if(ws[i] == -1)
                {
                    
                    
                    //System.out.println(rs.length());
                    ws[i] = rs.charAt(0) - '0';
                    tc[i] = 0;
                    for(j = 0; j < tc.length; j++)// increment time counters for all proccesses
                        tc[j]++;
                    
                    printResult("Page Fault" + faultCounter, ws, i);    
                    rs = rs.substring(1);
                    swapInCounter[ws[i]]++;
                    if(swapInCounter[ws[i]] == 1)
                        swapOutCounter[ws[i]]++;
                    faultCounter++;
                    continue outerLoop;/////////////////////////////
                    //break;
                }
            }
            int maxTime = 0;
            for(i = 0; i < ws.length; i++)// find the longest time a process has been in RAM, because FIFO
            {
                if(tc[i] > maxTime)
                    maxTime = tc[i];
            }
            int maxPlace = -1;
            for(i = 0; i < ws.length; i++)// find the process which has been in RAM for the longest time
            {
                if(tc[i] == maxTime)
                    maxPlace = i;
            }
            ws[maxPlace] = rs.charAt(0) - '0';
            rs = rs.substring(1);
            faultCounter++;
            tc[maxPlace] = 0;
            for(i = 0; i < tc.length; i++)// increment time counters for all proccesses
                tc[i]++;

            printResult("Page Fault" + faultCounter, ws, maxPlace);
            /*if(swapOutCounter[ws[maxPlace]] == -1)
                swapOutCounter[ws[maxPlace]]++;*/
            swapInCounter[ws[maxPlace]]++;
            if(swapInCounter[ws[maxPlace]] == 1)
                swapOutCounter[ws[maxPlace]]++;
            swapOutCounter[ws[maxPlace]]++;
            //ws[maxPlace] = (Integer)rs.charAt(0);


                //rs = rs.substring(1);

            
        }
        printFinal();
        
    }

    public static void lifo(int[] ws, String rs, int[] tc)
    {
        //timeCounters = new int[tc];
        int i, j;
        for(i = 0; i < ws.length; i++)
        {
            ws[i] = -1;
        }
        outerLoop:
        while(rs.length() > 0)
        {
            //System.out.println(rs.length());
            //outerLoop:
            for(i = 0; i < ws.length; i++)// Check if process exists in RAM
            {
                if(ws[i] == rs.charAt(0) - '0')
                {
                    
                    for(j = 0; j<tc.length; j++)// increment time counters for all proccesses
                        tc[j]++;

                    rs = rs.substring(1);
                    printResult("Ignore", ws, i);
                    //System.out.println(rs.length());
                    continue outerLoop;//////////////////////////////////
                    //System.out.println(rs.length());
                }

            }

            for(i = 0; i < ws.length; i++)//Check if there's an empty slot
            {
                
                if(ws[i] == -1)
                {
                    
                    
                    //System.out.println(rs.length());
                    ws[i] = rs.charAt(0) - '0';
                    tc[i] = 0;
                    for(j = 0; j < tc.length; j++)// increment time counters for all proccesses
                        tc[j]++;
                    
                    printResult("Page Fault" + faultCounter, ws, i);    
                    rs = rs.substring(1);
                    swapInCounter[ws[i]] = 1;
                    faultCounter++;
                    continue outerLoop;/////////////////////////////
                    //break;
                }
            }
            
            int minCounter = tc[0];
            for(i = 1; i < tc.length; i++)
            {
                if(tc[i] < minCounter)
                    minCounter = tc[i];
            }
            int minPlace = -1;
            for(i = 0; i < tc.length; i++)
            {
                if(tc[i] == minCounter)
                {
                    minPlace = i;
                    break;
                }
            }
            ws[minPlace] = rs.charAt(0) - '0';
            rs = rs.substring(1);
            tc[minPlace] = 0;
            faultCounter++;

            for(i = 0; i < tc.length; i++)// increment time counters for all proccesses
                tc[i]++;

            printResult("Page Fault" + faultCounter, ws, minPlace);
            //ws[maxPlace] = (Integer)rs.charAt(0);

            swapInCounter[ws[minPlace]]++;
            if(swapInCounter[ws[minPlace]] == 1)
                swapOutCounter[ws[minPlace]]++;
                //rs = rs.substring(1);

            
        }
        printFinal();
        
    }
    
}
