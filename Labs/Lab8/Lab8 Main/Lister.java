import java.nio.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
/**
 * Used to find the files in the directory this file is in and list them.
 * 
 * @author London Brunell, Matt Pigliavento
 * @version 0.1
 */
public class Lister
{    
    /**
     * The program's main method, used to run the class.
     * 
     * @param args[], the command line arguments
     */
    public static void main(String[] args){
        Path p = FileSystems.getDefault().getPath(".");

        try{           
            DirectoryStream<Path> ds = Files.newDirectoryStream(p);
            
            List<String> list = new ArrayList<>();
            
            // loops through current directory, normalizes, 
            // adds to ArrayList list
            for(Path entry : ds){
                entry.normalize();
                list.add(entry.toString());
            }
            
            // convert ArrayList to array
            String[] arr = new String[list.size()];
            arr = list.toArray(arr);
            
            // sort the array in lexographical order
            arr = bubble(arr);
            
            // prints the contents of the current directory
            for(String s: arr){
                System.out.println(s);
            }
        }catch(IOException e){
            System.err.println(e);
        }
    }
    
    /**
     * Sorts an array of Strings using bubble sort, lexicographically.
     * 
     * @param s, the array to be sorted
     * 
     * @return the array, but sorted
     */
    public static String[] bubble(String[] s) {
        for (int i = 0; i <= s.length-2; i++){
            for (int j = 0; j <= s.length-2-i; j++){
                if (s[j+1].compareTo( s[j] ) < 0){
                    String temp = s[j+1];
                    s[j+1] = s[j];
                    s[j] = temp;
                }
            }
        }
        return s;
    }
}