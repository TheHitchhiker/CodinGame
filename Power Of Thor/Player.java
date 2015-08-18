import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        
        // game loop
        while (true) {
            String directionX = "";
            String directionY = "";
            int remainingTurns = in.nextInt();
            System.err.println(remainingTurns);
            System.err.println("TX: "+TX+" TY: "+TY);
            
            if (TX > LX) {
                directionX = "W";
                TX++;
            } else if (TX < LX) {
                directionX = "E";
                TX--;
            }
            
            if (TY > LY) {
                directionY = "N";
                TY--;
            } else if (TY < LY) {
                directionY = "S";
                TY++;
            }
            String direction =  directionY + directionX;
            System.err.println(direction);
            System.out.println(direction);
        }
    }
