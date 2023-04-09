import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Utils
{
    //-----------------------------------------------------------------------------------------------------------
    /*
    This function prints the frame at each stage
    Input:  frame, focused page
    Output: None
    */
    public static void printArray(int[] pages, int focus, int fault)
    {
        String str = "page fault " + fault + ": ";
        if(fault == 0)
            str = "Ignore :";

        System.out.print(str);
        for (int page : pages)
        {
            if (page == focus)
            {
                System.out.print("[" + page + "] ");
            }
            else
            {
                System.out.print(page + "  ");
            }
        }
        System.out.println();
    }
    //-----------------------------------------------------------------------------------------------------------
    /*
    This function handles numerical input from user
    Input:  message to show on screen
    Output: validated num
    */
    public static int getNum(String msg)
    {
        Scanner scanner = new Scanner(System.in);
        String tmp = "None";

        while (isNotNumeric(tmp) || (!isNotNumeric(tmp) && Integer.parseInt(tmp) < 1))
        {
            System.out.print(msg);
            tmp = scanner.nextLine();
        }

        return Integer.parseInt(tmp);
    }
    //-----------------------------------------------------------------------------------------------------------
    /*
    This function handles reference string input from user
    Input:  None
    Output: pages array after int casting
    */

    public static int[] getReferenceString()
    {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        String reference = "None";
        while (!flag)
        {
            System.out.println("Enter reference string: ");
            reference = scanner.next();

            for (int i = 0; i < reference.length(); i++)
            {
                if(reference.charAt(i) < '0' || reference.charAt(i) > '9') {
                    flag = false;
                    break;
                }
                flag = true;
            }

        }

        int[] pages = new int[reference.length()];

        for (int j = 0; j < reference.length(); j++)
        {
            pages[j] = Integer.parseInt(String.valueOf(reference.charAt(j)));
        }

        return pages;
    }

     /*
    public static int[] getReferenceString()
    {
        Scanner scanner = new Scanner(System.in);
        String reference = "None";
        boolean correctReference = false;

        int totalSubstrings = 1, i, substringSize = 8;
        String[] strSubstrings;

        while(!correctReference) {
            System.out.print("Enter Reference string: ");
            reference = scanner.nextLine();
            if (reference.length() > substringSize) {
                totalSubstrings = (int) Math.ceil((double) reference.length() / substringSize);
                //System.out.print(totalSubstrings);
                strSubstrings = new String[totalSubstrings];

                int index = 0;
                for (i = 0; i < reference.length(); i = i + substringSize) {

                    strSubstrings[index++] = reference.substring(i, Math.min(i + substringSize, reference.length()));
                }
                for (i = 0; i <  strSubstrings.length; i++) {

                    System.out.print(strSubstrings[i] + " ,");
                }
            } else {
                strSubstrings = new String[1];
                strSubstrings[0] = reference;
            }
            System.out.println(strSubstrings.length);
            for (i = 0; i < strSubstrings.length && !isNotNumeric(strSubstrings[i]); i++);

            if(i == strSubstrings.length)
                correctReference = true;

            System.out.print(i);
        }


        int[] pages = new int[reference.length()];
        for (int x = 0; x < totalSubstrings; x++) {
            for (int j = 0; j < substringSize; j++) {
                pages[x * totalSubstrings + substringSize] = Integer.parseInt(String.valueOf(strSubstrings[x].charAt(j);
            }
        }

        return pages;
    }
    */

    //-----------------------------------------------------------------------------------------------------------
    /*
    This function checks if number is string
    Input:  str to test
    Output: true - if not number
    */
    public static boolean isNotNumeric(String str)
    {
        try
        {
            Integer.parseInt(str);
            return false;
        }
        catch (Exception e)
        {
            return true;
        }
    }

    public static String countPagesShowing(ArrayList<Integer> list)
    {
        ArrayList<Integer> temp = list;
        int i,j,page,count = 0;
        ArrayList<point> l = new ArrayList<point>();
        for(i = 0; i < list.size(); i++)
        {
            if(temp.get(i) != -1)
            {
                page = temp.get(i);
                temp.set(i ,-1);
                count++;
                for(j = i + 1; j < list.size(); j++)
                {
                    if(page == temp.get(j))
                    {
                        count++;
                        temp.set(j ,-1);
                    }

                }
                //System.out.print(temp);
                l.add(new point(page,count));
                count = 0;
            }


        }
        String str = "";
        for(i = 0; i < l.size() ;i++)
        {
            str+=l.get(i).getX()+":"+l.get(i).getY() +" ,";
        }
        return str;
    }





}