package com.mycompany.thang;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Bai3 extends JFrame {

    public Bai3() {
        setTitle("Lê Văn A - TT601K14");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1,5,5));

        JPanel p1 = new JPanel();
        p1.setBackground(Color.CYAN);
        p1.setBorder(new BevelBorder(BevelBorder.RAISED));

        JPanel p2 = new JPanel(new GridLayout(1,2));
        JPanel c1 = new JPanel();
        JPanel c2 = new JPanel();
        c1.setBorder(new LineBorder(Color.BLACK));
        c2.setBorder(new EtchedBorder());
        p2.add(c1); p2.add(c2);

        JPanel p3 = new JPanel(new GridLayout(1,3));
        for(int i=0;i<3;i++){
            JPanel p = new JPanel();
            p.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
            p3.add(p);
        }

        add(p1); add(p2); add(p3);
    }

    public static void main(String[] args) {
        new Bai3().setVisible(true);
    }
}
