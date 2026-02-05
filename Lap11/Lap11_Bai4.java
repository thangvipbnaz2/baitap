package com.mycompany.thang;

import javax.swing.*;

public class Lap11_Bai4 extends JFrame {

    public Lap11_Bai4() {
        setTitle("Bài 4 - Giới tính");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JRadioButton r1 = new JRadioButton("Nam");
        JRadioButton r2 = new JRadioButton("Nữ");
        JRadioButton r3 = new JRadioButton("Khác");

        ButtonGroup group = new ButtonGroup();
        group.add(r1); group.add(r2); group.add(r3);

        JLabel rs = new JLabel();
        JButton btn = new JButton("Hiển thị");

        btn.addActionListener(e -> {
            if(r1.isSelected()) rs.setText("Nam");
            else if(r2.isSelected()) rs.setText("Nữ");
            else if(r3.isSelected()) rs.setText("Khác");
        });

        JPanel p = new JPanel();
        p.add(r1); p.add(r2); p.add(r3);
        p.add(btn); p.add(rs);
        add(p);
    }

    public static void main(String[] args) {
        new Lap11_Bai4().setVisible(true);
    }
}
