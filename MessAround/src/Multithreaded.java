import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Multithreaded extends JFrame 
        implements ActionListener, Runnable {
    Thread go1;
    Thread go2;
    JButton count1;
    JButton count2;
    JTextArea area1;
    JTextArea area2; 
    
    public Multithreaded() {
        super("Multithreaded");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(2, 2);
        setLayout(grid);
        
        count1 = new JButton("Count 1");
        count2 = new JButton("Count 2");
        count1.addActionListener(this);
        count2.addActionListener(this);
        area1 = new JTextArea(8, 20);
        area2 = new JTextArea(8, 20);
        area1.setLineWrap(true);
        area2.setLineWrap(true);
        
        add(count1);
        add(count2);
        add(area1);
        add(area2);
        
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == count1) {
            go1 = new Thread(this);                 // IMPORTANT FOR THREADING!!!!!
            go2 = new Thread(this); 
            go1.start();
            go2.start(); 
            System.out.println("Button1 was pressed");
        }
        
    }
    
    public void run() {
        System.out.println("Are you working?");
        Thread thisThread = Thread.currentThread();
        if (thisThread == go1) {
            for (int i = 0; i < 100; i++) {
                System.out.println("go1: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException x) {
                    // ignore
                }
            }
        } else if (thisThread == go2) {
            try {
                    Thread.sleep(50);
                } catch (InterruptedException x) {
                    // ignore
                }
            for (int i = 0; i < 100; i++) {
                System.out.println("go2: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException x) {
                    // ignore
                }
            }
        } else {
            System.out.println("WTF!");
        }
    }


    public static void main(String[] args) {
        Multithreaded multi = new Multithreaded();
    }
}