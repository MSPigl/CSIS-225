import java.util.Scanner;
/**
 * Write a description of class ReverseCase here.
 * 
 * @author Matt and Jose
 * @date Spring 2017
 */
public class ReverseCase
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a word: ");
        String word1 = sc.next();

        StringBuffer test = new StringBuffer(word1);

        for (int i = 0; i < test.length(); i++){
            if(Character.isLowerCase(test.charAt(i)))
            {
                test.setCharAt(i, Character.toUpperCase(test.charAt(i)));
            }
            else
            {
                test.setCharAt(i, Character.toLowerCase(test.charAt(i)));
            }
        }
        
        System.out.println(test);
    }
}
