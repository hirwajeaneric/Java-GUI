/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BorderLayout;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author hirwa
 */
public class BorderLayout {
    public static void main (String []args){
        JFrame frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        JButton button1 = new JButton("North");
        JButton button2 = new JButton("South");
        JButton button3 = new JButton("Center");
        JButton button4 = new JButton("East");
        JButton button5 = new JButton("West");
        
         frame.setSize(300,300);
         frame.setVisible(true);
    }        
}
