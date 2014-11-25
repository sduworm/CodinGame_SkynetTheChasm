import java.util.*;
import java.io.*;
import java.math.*;

/**
 * This is my customization of the Auto Generated code provided by CodinGame.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt(); // the length of the road before the gap.
        int G = in.nextInt(); // the length of the gap.
        int L = in.nextInt(); // the length of the landing platform.
        
        boolean jumped = false;

        // game loop
        while (true) {
            int S = in.nextInt(); // the motorbike's speed.
            int X = in.nextInt(); // the position on the road of the motorbike.
            
            // A small set of troubleshooting code
            System.err.println("Speed: " + S);
            System.err.println("Gap:   " + G);
            
            // Simple logic to "quickly reach the /minimum/ speed necessary to clear the gap
            if (!jumped) {
                if(S <= G) System.out.println("SPEED");
                else if(S > (G + 1)) System.out.println("SLOW");
                else if(X == (R - 1)) {
                    System.out.println("JUMP");
                    jumped = true;
                }
                else System.out.println("WAIT");
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            // After jumping, only slow down.
            if (jumped) System.out.println("SLOW"); // A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
        }
    }
}
