import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PrimeFinder extends JFrame implements Runnable, ActionListener {
    Thread go;
    JLabel howManyLabel;
    JTextField howMany;
    JButton display;
    JButton reset;
    JTextArea primes;
    
    PrimeFinder() {
        super("Find Prime Numbers");
        setLookAndFeel();
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        
        howManyLabel = new JLabel("Quantity: ");
        howMany = new JTextField("400", 10);
        display = new JButton("Display primes");
        display.addActionListener(this);
        primes = new JTextArea(8, 40);
        reset = new JButton("Reset");
        reset.addActionListener(this);
        
        JPanel topPanel = new JPanel();
        topPanel.add(howManyLabel);
        topPanel.add(howMany);
        topPanel.add(display);
        topPanel.add(reset);
        add(topPanel, BorderLayout.NORTH);
        
        primes.setLineWrap(true);
        JScrollPane textPane = new JScrollPane(primes);
        add(textPane, BorderLayout.CENTER);

        // pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent x) {
        Object source = x.getSource();
        if (source == display) {
            display.setEnabled(false);
            if (go == null) {
                go = new Thread(this);
                go.start();
            }
        } else if (source == reset) {
            clear();
        }
    }
    
    public void run() {
        int quantity = Integer.parseInt(howMany.getText());
        int numPrimes = 0;
        // candidate: the number that might be prime
        int candidate = 2;
        primes.append("First " + quantity + " primes:");
        while (numPrimes < quantity) {
            if (isPrime(candidate)) {
                primes.append(candidate + " ");
                numPrimes++;
            }
            candidate++;
        }
    }
    
    public void clear() {
        primes.setText("");
        display.setEnabled(true);
        go = null;
}
    
    public static boolean isPrime(int checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
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
        PrimeFinder fp = new PrimeFinder();
    }
}