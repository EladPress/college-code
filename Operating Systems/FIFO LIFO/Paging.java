import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Paging
{
    //-----------------------------------------------------------------------------------------------------------
    /*
    This function emulates fifo algorithm
    Input:  ws and parsed reference string
    Output: None
    */
    public void fifo(int ws, int[] pages)
    {
        int[] frame = new int[ws];
        ArrayList<Integer> listSO = new ArrayList<Integer>();
        ArrayList<Integer> listContact = new ArrayList<Integer>();
        boolean isNotFound;

        int pageIdx = 0;
        int faults = 0;
        int fptr = 0;
        int page ,beforeSO;
        int currentPF = 0; // 0 --> Ignore , 1,2,3,4... --> num of page fault

        Arrays.fill(frame, -1);

        while (pageIdx != pages.length)
        {
            for (int idx = 0; idx < pages.length; idx++)
            {
                page = pages[idx];
                isNotFound = true;

                // Check if page is loaded
                for (int j = 0; j < ws; j++)
                {
                    if (page == frame[j])
                    {
                        currentPF = 0;
                        listContact.add(page);
                        isNotFound = false;
                        break;
                    }
                }

                // if page is not loaded
                if (isNotFound)
                {
                    beforeSO = frame[fptr];
                    frame[fptr] = page;

                    if(fptr != page)
                        listSO.add(beforeSO);

                    fptr++;
                    if (fptr == ws)
                    {
                        fptr = 0;
                    }
                    faults++;
                    currentPF = faults;
                }

                // Print the current memory image
                Utils.printArray(frame, page , currentPF);
                pageIdx++;
            }
        }
        System.out.println("");
        System.out.println("Page fault : " + faults);
        System.out.println("Swap Out : " + Utils.countPagesShowing(listSO));
        System.out.println("Contact : " + Utils.countPagesShowing(listContact));
        System.out.println("miss ratio: " + String.format("%.2f",(float)faults/pages.length));

    }
    //-----------------------------------------------------------------------------------------------------------
    /*
    This function emulates fifo algorithm
    Input:  ws and parsed reference string
    Output: None
    */
    public void lifo(int ws, int[] pages)
    {
        ArrayList<Integer> listSO = new ArrayList<Integer>();
        ArrayList<Integer> listContact = new ArrayList<Integer>();
        int[] frame = new int[ws];
        boolean isNotFound;
        boolean loc;

        int beforeSO;
        int lastPageIndex = 0;
        int pageIdx = 0;
        int faults = 1;
        int fptr = 0;
        int page;
        int currentPF = 1; // 0 --> Ignore , 1,2,3,4... --> num of page fault

        Arrays.fill(frame, -1);

        while (pageIdx != pages.length)
        {
            for (int pg = 0; pg < pages.length; pg++)
            {
                page = pages[pg];
                isNotFound = true;

                // Check if page is loaded
                for (int j = 0; j < ws; j++)
                {
                    if (page == frame[j])
                    {
                        listContact.add(page);
                        currentPF = 0;
                        isNotFound = false;
                        break;
                    }
                }

                // if page is not loaded
                if (isNotFound)
                {
                    loc = false;
                    currentPF = faults;
                    faults++;

                    // Check if ws is not empty and place accordingly
                    for(int i = 0; i < ws; i++)
                    {
                        if(frame[i] == -1)
                        {
                            lastPageIndex = i;
                            loc = true;
                            frame[i] = page;
                            fptr++;
                            break;
                        }
                    }

                    // Place using lifo
                    if(!loc)
                    {
                        beforeSO =  frame[lastPageIndex];
                        listSO.add(beforeSO);
                        frame[lastPageIndex] = page;
                        fptr++;
                    }

                    if(fptr == ws)
                    {
                        fptr = 0;
                    }
                }

                // Print the current memory image
                Utils.printArray(frame, page ,currentPF);
                pageIdx++;
            }
        }
        System.out.println("Page fault(s): " + faults);
        System.out.println("Swap Out : " + Utils.countPagesShowing(listSO));
        System.out.println("Contact : " + Utils.countPagesShowing(listContact));
        System.out.println("miss ratio: " + String.format("%.2f",(float)faults/pages.length));
    }
}