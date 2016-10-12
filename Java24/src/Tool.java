import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tool extends JFrame implements ActionListener {
        // build toolbar buttons
        ImageIcon image1 = new ImageIcon("newfile.gif");
        JButton button1 = new JButton(image1);
        ImageIcon image2 = new ImageIcon("openfile.gif");
        JButton button2 = new JButton(image2);
        ImageIcon image3 = new ImageIcon("savefile.gif");
        JButton button3 = new JButton(image3);
        JTextArea edit = new JTextArea(8,40);
        
        
    public Tool() {
        super("Tool");
        setLookAndFeel();
        setSize(370, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add object listener to buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        
        //buld toolbar
        JToolBar bar = new JToolBar();
        bar.add(button1);
        bar.add(button2);
        bar.add(button3);
        
        // build text area
        JScrollPane scroll = new JScrollPane(edit);
        
        // create frame
        BorderLayout border = new BorderLayout();
        setLayout(border);
        add("North", bar);
        add("Center", scroll);
        // pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == button1) {
            edit.setText("You clicked on button1");
        } else if (source == button2) {
            edit.setText("You clicked on button2");
        } else if (source == button3) {
            edit.setText("You clicked on button3");
        } else {
            edit.setText("What the hell");
        }
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
        Tool frame = new Tool();
    }
}