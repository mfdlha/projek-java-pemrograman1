package src.tugas_2;

import java.awt.Graphics;
import javax.swing.JFrame;

import java.awt.Color;

public class t2 extends JFrame {
    public void paint (Graphics g) {
        super.paint(g);
        g.drawString("Membuat Program Java Dengan Applet", 25, 25);
        g.setColor(Color.RED);
        g.drawString("Membuat Program Java Sangat Sangat Menyenangkan :) ", 25, 45);
    }
    public static void main(String[] args) {
        t2 frame = new t2();
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}   

