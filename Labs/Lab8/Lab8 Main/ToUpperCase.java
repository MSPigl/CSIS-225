import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintWriter;
/**
 * Used to read in a text file, and output a similar file, 
 * but with all letters capital.
 * 
 * @author London Brunell, Matthew Pigliavento
 * @version 0.1
 */
public class ToUpperCase{
    
     /**
     * The program's main method, used to run the class.
     * 
     * @param args[], the command line arguments
     */
    public static void main(String[] args){
        Scanner input = null;
        PrintWriter pw = null;
        
        String fileName = "testfile.txt";

        //used to store the output
        List<String> output = new ArrayList<>();
        
        try{
            input = new Scanner(new File(fileName));
            
            //for each line in the input, turn it to all uppercase
            //then add it to the output
            while(input.hasNextLine()){
                output.add(input.nextLine().toUpperCase());
            }

            pw = new PrintWriter(new File("outfile.txt"));
            
            //print the output to the output file.
            for(String s: output){
                pw.println(s);
            }
        }catch(FileNotFoundException e){
            System.err.println(fileName+" not found");
        }finally{
            if(input != null) input.close();
            if(pw != null) pw.close();
        }        
    }
}