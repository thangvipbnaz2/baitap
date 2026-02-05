package com.mycompany.thang;

import javax.swing.*;

public class Bai6 extends JFrame {

    public Bai6() {
        setTitle("Bài 6 - Email");
        setSize(300,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField txt = new JTextField(20);
        JLabel lbl = new JLabel();

        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                if(txt.getText().matches("\\w+@\\w+\\.\\w+"))
                    lbl.setText("Hợp lệ");
                else lbl.setText("Email sai");
            }
        });

        JPanel p = new JPanel();
        p.add(new JLabel("Email"));
        p.add(txt);
        p.add(lbl);
        add(p);
    }

    public static void main(String[] args) {
        new Bai6().setVisible(true);
    }
}
