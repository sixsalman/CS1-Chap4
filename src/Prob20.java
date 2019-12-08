import java.util.Scanner; //util package's Scanner class imported

/**
 *  Author: Salman
 *
 *  This program asks for side size and prints a square accordingly
 */
public class Prob20 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main (String[] args){
        Scanner kbd = new Scanner(System.in);
        int side;
        boolean isValid = false;
        //asks and validates side size
        do {
        System.out.print("Enter a positive integer no greater than 15: ");
            side = kbd.nextInt();
            if(side >= 0 && side <= 15){
                isValid = true;
            } else {
                System.out.println("Invalid Entry");
            }
        }while(!isValid);
        kbd.close();
        //prints square
        for (int i = 1; i<=side; i++){
            for (int j = 1; j<=side; j++){
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }
}
