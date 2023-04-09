package transposition_encryption;

public class EncryptionTest 
{
    public static void main(String[] args)
    {
        
        //////////
        /*for(i = 0; i < key; i++)
        {
            for(j = 0; j < height; j++)
            {
                System.out.print(newMat[i][j]);
            }
        }*/
    }

    public char[][] encrypt()
    {
        String pre = "Common sense is not so common.";
        int key = 8;
        double temp = (double)pre.length() / (double)key;
        //System.out.println(Math.ceil(temp));
        int height = (int)Math.ceil(temp);
        char[][] mat = new char[height][key];
        int i, j;
        int counter = 0;
        for(i = 0; i < height; i++)
        {
            for(j = 0; j < key; j++)
            {
                if(counter == pre.length())
                    break;
                mat[i][j] = pre.charAt(counter);
                counter++;
            }
        }
        char[][] newMat = new char[key][height];
        for(i = 0; i < height; i++)
        {
            for(j = 0; j < key; j++)
            {
                newMat[j][i] = mat[i][j];
            }
        }
        return newMat;
    }

    public char[][] decrypt(String pre, int key)
    {
        
    }
}
