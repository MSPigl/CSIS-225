import java.util.*;
import java.text.Collator;
/**
 *  Demonstrates the functionality of the built-in Locale class 
 * 
 * @author Darren Lim 
 * @version 1.0
 */
public class LocaleTest
{
    public String[] bubbleSort(String[] str)
    {
        Collator frenchCollator = Collator.getInstance(Locale.FRANCE); 
        int n = str.length;
        String temp;

        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < n - i; j++)
            {
                if (frenchCollator.compare(str[j-1],str[j]) > 0)
                {
                    temp = str[j - 1];
                    str[j-1] = str[j];
                    str[j] = temp;
                }
            }
        }

        return str;
    }

    public static void main(String args[])
    {
        Locale rightHere = Locale.getDefault();
        System.out.println(rightHere.getDisplayName());

        String[] names = {"fácil", "facil", "fast", "Où", "êtes-vous","spécifique", "specific","ou"};
        Collator frenchCollator = Collator.getInstance(Locale.FRANCE); 
        LocaleTest test = new LocaleTest();
        names = test.bubbleSort(names);
        
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
