import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame {
    public Playback() {
        super("Playback");      // or setTitle()
        setLookAndFeel();
        setSize(480, 320);      // or pack() near end
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set FlowLayout
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        // Buttons
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        add(play);
        add(stop);
        add(pause);
        // Label and text boxes
        JLabel pageLabel = new JLabel("Web page address: ", JLabel.RIGHT);
        JTextField pageAddress = new JTextField("Default Text", 10);
        add(pageLabel);
        add(pageAddress);
        // check box
        JCheckBox jumboSized = new JCheckBox("Jumbo Size", false);
        JCheckBox shmedium = new JCheckBox("Shmedium", false);
        JCheckBox small = new JCheckBox("Small", true);
        ButtonGroup meal = new ButtonGroup();
        meal.add(jumboSized);
        meal.add(shmedium);
        meal.add(small);
        add(jumboSized);
        add(shmedium);
        add(small);
        // combo box
        JComboBox position = new JComboBox();
        position.setEditable(false);    // not required to have. Allows to enter text.
        position.addItem("Cashier");
        position.addItem("Cook");
        position.addItem("Janitor");
        position.addItem("Manager");
        add(position);
        // text area
        JTextArea comments = new JTextArea("Comments go here\n" + "Please...",8, 40); // 8 lines, 40 characters
        add(comments);
        // panels
        JPanel topRow = new JPanel();
        JTextField boxPanel = new JTextField("This text box is inside a panel!");
        topRow.add(boxPanel);
        add(topRow);
        
        //pack();
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            // ignore error
        }
    }
    public static void main(String[] args) {
        Playback pb = new Playback();
        
    }
}