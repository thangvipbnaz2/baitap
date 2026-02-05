package com.mycompany.thang;

import javax.swing.*;
import java.awt.*;

public class Bai1 extends JFrame {

    public Bai1() {
        setTitle("Lê Văn A - TT601K14");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel 1 - Vàng
        JPanel p1 = new JPanel();
        p1.setBackground(Color.YELLOW);
        p1.setPreferredSize(new Dimension(0, 100));

        // Panel 2 - Xanh lá
        JPanel p2 = new JPanel();
        p2.setBackground(Color.GREEN);
        p2.setPreferredSize(new Dimension(0, 100));

        // Panel 3 - Xanh dương
        JPanel p3 = new JPanel();
        p3.setBackground(Color.BLUE);
        p3.setPreferredSize(new Dimension(0, 100));

        // GroupLayout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(p1)
                .addComponent(p2)
                .addComponent(p3)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(p1)
                .addComponent(p2)
                .addComponent(p3)
        );
    }

    public static void main(String[] args) {
        new Bai1().setVisible(true);
    }
}
