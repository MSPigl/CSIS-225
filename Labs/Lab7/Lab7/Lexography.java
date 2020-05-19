
/**
 * Write a description of class Lexography here.
 * 
 * @author Matt, Jose
 * @version Spring 2017
 */
public class Lexography
{
    public String[] bubbleSort(String[] str)
    {
        int n = str.length;
        String temp;
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < n - i; j++)
            {
                if (str[j-1].compareToIgnoreCase(str[j]) > 0)
                {
                    temp = str[j - 1];
                    str[j-1] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        return str;
    }
    
    public static void main(String[] args)
    {
        Lexography text = new Lexography();
        String[] test = {"##$$$", "happy", "Smiles", "Smile", "Happier"};
        
        test = text.bubbleSort(test);
        
        for (int i = 0; i < test.length; i++)
        {
            System.out.println(test[i]);
        }
    }
}
