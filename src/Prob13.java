import java.util.Scanner; //util package's Scanner class imported
import java.io.*; //whole of io package imported

/**
 *  Author: Salman
 *
 *  This program aks user for a file path and reads the file's first five lines
 */
public class Prob13 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main (String[] args) throws IOException{
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter file path: "); //asks file path
        File file = new File(kbd.nextLine());
        kbd.close();
        Scanner fRead = new Scanner(file);
        int i = 1;
        while(fRead.hasNext() && i<=5){
            System.out.println(fRead.nextLine()); //prints lines
            i++;
        }
        fRead.close();
        System.out.println("\nDone");
    }
}
