/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/**
 *
 * @author ayodr
 */
import javax.swing.*;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(test.class.getResource("/eye-care.png")));
        frame.add(label);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
