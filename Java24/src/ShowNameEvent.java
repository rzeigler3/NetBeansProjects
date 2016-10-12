import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowNameEvent implements ActionListener {
    ShowName gui;
    Thread playing;
    
    public ShowNameEvent(ShowName in) {
        gui = in;
    }
    
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == gui.join) {
            concatenate();
        }
    }
    
    void concatenate(){
        String getFirst;
        String getLast;
        String combine;
        getFirst = gui.first.getText();
        getLast = gui.last.getText();
        combine = getFirst + " " + getLast;
        gui.name.setText(combine);
    }
    
}
    