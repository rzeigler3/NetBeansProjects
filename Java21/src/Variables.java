/**
 * javadoc comment
 * Variables
 * @author Rick
 * This program creates and displays different types of variables.
 */

public class Variables {
    public static void main(String[] args) {
        final char UP = 'U';    // a single line comment
        byte initialLevel = 12;
        short location = 13250;
        int score = 3500100;
        boolean newGame = true;
        double y = 2e5;        
        /*
        a multiline comment
        */
        
        System.out.println("Level: " + initialLevel);
        System.out.println("Up: " + UP);
        System.out.println("y: " + y);
    }
}