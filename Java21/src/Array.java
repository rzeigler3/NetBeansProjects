import java.awt.*;
import javax.swing.*;

class Array {
    public static void main(String[] args) {
        Integer[] numbers = { new Integer(10), new Integer(5), new Integer(12), }; // uses new
        Double[] dbl = { 15.5, 10.75, 13.76 }; // no new
        JButton[] jB = { new JButton("Tim"), new JButton("Jeb"), new JButton("Scott") };
        Point[] dots = new Point[3];
        dots[0] = new Point(1,3);
        dots[1] = new Point(5,6);
        dots[2] = new Point(2,9);
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+1 + ": " + numbers[i] + "\t" + dots[i] + "\t" 
                + dbl[0]);
        }
    }
}