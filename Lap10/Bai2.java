package com.mycompany.thang;

import javax.swing.*;
import java.awt.*;

public class Bai2 extends JFrame {

    public Bai2() {
        setTitle("Lê Văn A - TT601K14");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Layout tổng: chia 3 hàng
        setLayout(new BorderLayout(5, 5));

        /* ===== HÀNG 1: 4 PANEL ===== */
        JPanel top = new JPanel(new GridLayout(1, 4, 5, 5));

        JPanel p1 = new JPanel(); p1.setBackground(Color.YELLOW);
        JPanel p2 = new JPanel(); p2.setBackground(Color.PINK);
        JPanel p3 = new JPanel(); p3.setBackground(new Color(0, 150, 150));
        JPanel p4 = new JPanel(); p4.setBackground(new Color(0, 70, 70));

        top.add(p1);
        top.add(p2);
        top.add(p3);
        top.add(p4);

        /* ===== HÀNG 2: 2 PANEL ===== */
        JPanel middle = new JPanel(new GridLayout(1, 2, 5, 5));

        JPanel p5 = new JPanel(); p5.setBackground(Color.GREEN);
        JPanel p6 = new JPanel(); p6.setBackground(Color.RED);

        middle.add(p5);
        middle.add(p6);

        /* ===== HÀNG 3: 1 PANEL ===== */
        JPanel bottom = new JPanel();
        bottom.setBackground(Color.BLUE);

        /* ===== ADD VÀO FRAME ===== */
        add(top, BorderLayout.NORTH);
        add(middle, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Bai2().setVisible(true);
    }
}
