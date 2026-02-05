package com.mycompany.thang;

import javax.swing.*;

public class Lab11_Bai8 extends JFrame {

    public Lab11_Bai8() {
        setTitle("Bài 8 - Language");
        setSize(250,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lbl = new JLabel("Xin chào");
        JButton vn = new JButton("Tiếng Việt");
        JButton en = new JButton("English");

        vn.addActionListener(e -> lbl.setText("Xin chào"));
        en.addActionListener(e -> lbl.setText("Hello"));

        JPanel p = new JPanel();
        p.add(lbl); p.add(vn); p.add(en);
        add(p);
    }

    public static void main(String[] args) {
        new Lab11_Bai8().setVisible(true);
    }
}
