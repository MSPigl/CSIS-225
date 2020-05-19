import java.nio.*;
import java.nio.file.*;
/**
 * Used to find the depth of the directory this file is in and print it.
 * 
 * @author London Brunell, Matt Pigliavento
 * @version 0.1
 */
public class Depth{
    /**
     * The program's main method, used to run the class.
     * 
     * @param args[], the command line arguments
     */
    public static void main(String[] args){
        //get the path to our location
        Path p = FileSystems.getDefault().getPath(".");

        //make sure we have the full file path
        p = p.toAbsolutePath();
        
        // used to count depth
        int count = 0;
        
        while(p.getParent() != null){//while there's another folder up to go
            p = p.getParent();//go up a folder
            count++;
        }
        
        count--; //to make sure the rooit isn't counted
        
        //print the result
        System.out.println("This file is "+count+" folders deep.");
    }
}
