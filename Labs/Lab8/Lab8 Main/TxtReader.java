import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Used to read in a text file, and print its word, character, and line counts.
 * 
 * @author London Brunell, Matthew Pigliavento
 * @version 0.1
 */
public class TxtReader{
     /**
     * The program's main method, used to run the class.
     * 
     * @param args[], the command line arguments
     */
    public static void main(String[] args){
        
        int lineCount, wordCount, charCount;
        lineCount = wordCount = charCount = 0;
        
        Scanner input = null;
        
        String fileName = "testfile.txt";

        try{
            //character count = number of bytes in the file = file.length
            charCount = (int)(new File(fileName)).length();
            
            input = new Scanner(new File(fileName));
            
            while(input.hasNextLine()){
               input.nextLine();
               lineCount++;
            }
            
            //reset input to read in the file again
            input.close();
            input = new Scanner(new File(fileName));
            
            while(input.hasNext()){
               input.next();
               wordCount++;
            }            
            
            System.out.println("Char count: "+charCount+ " | Word count: "+
            wordCount+" | Line Count: "+lineCount);
        }catch(FileNotFoundException e){
            System.err.println(fileName+" not found");
        }finally{
            if(input != null) input.close();
        } 
    }
}
