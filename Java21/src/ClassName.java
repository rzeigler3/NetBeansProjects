import java.awt.*;
import javax.swing.*;

class ClassName {
    public static void main(String[] args) {
        Integer x = new Integer(10);
        Point y = new Point(10,20);

        
        String name;
        boolean check, check2;
        
        name = x.getClass().getName();
        
        System.out.println("x.getClass().getName(): " + name + "\n");
        
        check = (y instanceof Point);
        System.out.println("x instanceof Integer: " + check + "\n");

    }
}