import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyViewer extends JFrame implements KeyListener {
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field.");
    
    KeyViewer() {
        super("KeyViewer");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public void keyTyped(KeyEvent pressedKey) {
        char key = pressedKey.getKeyChar();
        keyLabel.setText("You pressed " + key);
    }
    
    public void keyPressed(KeyEvent txt) {
        
    }
    
    public void keyReleased(KeyEvent txt) {

    }
    
    public void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.swing.java.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore
        }
    }
    
    public static void main(String[] args) {
        KeyViewer kv = new KeyViewer();
    }
}