import javax.swing.*;
import java.awt.*;

class BalancingGUI extends JFrame {
    
    BalancingGUI() {
        setTitle("BalancingGUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gridMain = new GridLayout(4,1);
        GridLayout gridSub1 = new GridLayout(1,2);
        GridLayout gridSub2 = new GridLayout(1,4);
        setLayout(gridMain);
        
        //set up row 1 with Statement selection
        JPanel row1 = new JPanel();
        row1.setLayout(gridSub1);
        JLabel labelStatements = new JLabel("Select a statement");
        JComboBox statements = new JComboBox();
        statements.addItem("Select");
        statements.addItem("Delete");
        row1.add(labelStatements);
        row1.add(statements);
        
        //set up row 2
        JPanel row2 = new JPanel();
        row2.setLayout(gridSub2);
        JLabel labelTableSelect = new JLabel("Select Tables:");
        JLabel labelSex = new JLabel("Sex: ");
        JCheckBox sex = new JCheckBox();
        JLabel labelAddress = new JLabel("Address: ");
        JCheckBox address = new JCheckBox();
        row2.add(labelTableSelect);
        row2.add(labelSex);
        row2.add(sex);
        row2.add(labelAddress);
        row2.add(address);
        
        //set up row 3
        JPanel row3 = new JPanel();
        row3.setLayout(gridSub2);
        JLabel labelColumnSelect = new JLabel("Select Columns from Tables: ");
        JLabel labelName = new JLabel("Name: ");
        JCheckBox name = new JCheckBox();
        JLabel labelSexCol = new JLabel("Sex: ");
        JCheckBox sexCol = new JCheckBox();
        row3.add(labelColumnSelect);
        row3.add(labelName);
        row3.add(name);
        row3.add(labelSexCol);
        row3.add(sexCol);
        
        //set up row 2 with ?
        JPanel rowSQL = new JPanel();
        rowSQL.setLayout(gridSub1);
        JLabel labelCombinedSQL = new JLabel("Your SQL statement");
        JTextField combinedSQL = new JTextField(20);
        rowSQL.add(labelCombinedSQL);
        rowSQL.add(combinedSQL);
        
        //add all rows
        add(row1);
        add(row2);
        add(row3);
        add(rowSQL);
        
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        BalancingGUI bGUI = new BalancingGUI();
    }
}