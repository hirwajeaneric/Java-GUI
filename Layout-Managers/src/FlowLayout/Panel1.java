package FlowLayout;

import java.awt.*;
import javax.swing.*;

public class Panel1 {
    public static void main(String[] args){
        Panel1 gui = new Panel1();
        gui.go();
    }
    
    public void go(){
        JFrame frame = new JFrame("Flow Layout");
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);
        
        JButton button = new JButton("shock me");
        JButton button2 = new JButton("Bliss");
        
        panel.add(button);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
