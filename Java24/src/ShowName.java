import javax.swing.*;
import java.awt.*;

public class ShowName extends JFrame {
    ShowNameEvent show = new ShowNameEvent(this);
    
    JLabel lastName = new JLabel("Enter last name: ");
    JLabel firstName = new JLabel("Enter first name: ");
    JLabel fullName = new JLabel("Entered text: ");
    JTextField first = new JTextField(20);
    JTextField last = new JTextField(20);
    JTextField name = new JTextField(20);
    JButton join = new JButton("Join");
    
    ShowName() {
        super("ShowName");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(350,350);
        setLayout(new GridLayout(3,1));
        FlowLayout flow1 = new FlowLayout();
        
        join.addActionListener(show);
        
        // set up row 1
        JPanel row1 = new JPanel();
        GridLayout grid2 = new GridLayout(2, 2);
        row1.setLayout(grid2);
        row1.add(firstName);
        row1.add(first);
        row1.add(lastName);
        row1.add(last);
        add(row1);
        
        // set up row 2
        JPanel row2 = new JPanel();
        row2.setLayout(flow1);
        row2.add(join);
        add(row2);
        
        // set up row 3
        JPanel row3 = new JPanel();
        row3.setLayout(flow1);
        row3.add(fullName);
        row3.add(name);
        add(row3);
        
        pack();
        setVisible(true);
    }
    
     private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore
        }
    }
    
    public static void main(String[] args) {
        ShowName sN = new ShowName();
    }
}