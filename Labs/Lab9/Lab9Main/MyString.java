
/**
 * Write a description of class MyString here.
 * 
 * @author Julia Dunbar, Matt Pigliavento
 * @version Spring 2017
 */
public class MyString
{
    // instance variables
    protected String contents;
    private String backwardsContent;
    private String currentString;

    /**
     * Constructor for objects of type MyString
     * 
     * @param input a String input argument
     */
    public MyString(String input)
    {
        // initialize instance variables
        contents = input;
        currentString = contents;
        
        // add last letter of contents to backwardsContents
        backwardsContent = "" + contents.charAt(contents.length() - 1);
        
        // replace all white space and convert to lowercase
        contents = contents.replaceAll(" ", "");
        contents = contents.toLowerCase();
    }

    /**
     * Recursively determines if a string is a palindrome
     * 
     * @return true if a palindrome, false otherwise
     */
    public boolean isPalindrome()
    {
        // convert currentString to a substring of itself
        currentString=currentString.substring(0,currentString.length()-1);
        
        // base case
        if (currentString.length() == 1)
        {
            backwardsContent += currentString.charAt(0);
        }
        // inductive steps
        else if (currentString.charAt(currentString.length()-1) == ' ')
        {
            backwardsContent += "";
            isPalindrome();
        }
        else
        {
            backwardsContent+=currentString.charAt(currentString.length()-1);
            isPalindrome();
        }
        
        // converts backwardsContents to lower case
        backwardsContent = backwardsContent.toLowerCase();
        
        // determine if a string is a palindrome
        for (int i = 0; i < contents.length(); i++)
        {
            if (contents.charAt(i) != backwardsContent.charAt(i))
            {
                return false;
            }
        }

        return true;
    }
    
    /**
     * Main method for class MyString
     * 
     * @param args an array of command line arguments
     */
    public static void main(String[] args)
    {
        // save sentences to Strings
        String hannah = "Did Hannah say as Hannah did";
        String noon = "Noon";
        String midnight = "Midnight";
        String never = "Never odd nor even";
        
        // create MyString objects
        MyString han = new MyString(hannah);
        MyString non = new MyString(noon);
        MyString mid = new MyString(midnight);
        MyString nev = new MyString(never);
        
        // print results
        System.out.println("'"+hannah +": "+han.isPalindrome());
        System.out.println("'"+noon +": "+non.isPalindrome());
        System.out.println("'"+midnight+": "+mid.isPalindrome());
        System.out.println("'"+never +": "+nev.isPalindrome());
    }
}