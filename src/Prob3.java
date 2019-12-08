import java.util.Scanner; //util package's Scanner class imported
import java.io.*; //whole of io package imported

/**
 *  Author: Salman
 *
 *  This programs asks user for speed and time, calculates distance travelled every hour
 *  and writes it to a file
 */
public class Prob3 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main (String[] args) throws IOException{
        Scanner kbd = new Scanner(System.in);
        int spd;
        int time;
        boolean sValid = false;
        //asks and validates speed
        do {
            System.out.print("Enter speed (in mph): ");
            spd = kbd.nextInt();
            if(spd >= 0){
                sValid = true;
            } else {
                System.out.println("Invalid Entry");
            }
        }while(!sValid);
        boolean tValid = false;
        //asks and validates time
        do {
        System.out.print("Enter time (in hours): ");
            time = kbd.nextInt();
            if(time >= 1) {
                tValid = true;
            } else {
                System.out.println("Invalid Entry");
            }
        }while(!tValid);
        kbd.close();
        PrintWriter dist = new PrintWriter("Distance Travelled.txt");
        dist.println("Hour\tDistance Travelled");
        dist.println("--------------------------");
        for (int i = 1 ; i <= time; i++){
            dist.println(String.format("%d\t\t\t\t%d", i, (i*spd))); // writes distances to file
        }
        dist.close();
        System.out.println("Written");
    }
}
