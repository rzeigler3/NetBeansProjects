import javax.swing.*;
import java.awt.*;

public class ClockFrame extends JFrame {
    public ClockFrame() {
        super("Clock");
        setLookAndFeel();
        //setSize(225, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        ClockPanel time = new ClockPanel();
        add(time);
        pack();
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }
    
    public Insets getInsets() {
        Insets squeeze = new Insets(50, 15, 10, 15);        // creates padding
        return squeeze;
    }
    
    public static void main(String[] args) {
        ClockFrame cf = new ClockFrame();
    }
}