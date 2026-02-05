package com.mycompany.thang;

import javax.swing.*;

public class Lab11_Bai9 extends JFrame {

    public Lab11_Bai9() {
        setTitle("Bài 9 - Xóa");
        setSize(200,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btn = new JButton("Xóa dữ liệu");
        btn.addActionListener(e -> {
            int c = JOptionPane.showConfirmDialog(this,"Xóa?");
            if(c==JOptionPane.YES_OPTION)
                JOptionPane.showMessageDialog(this,"Đã xóa");
        });

        add(btn);
    }

    public static void main(String[] args) {
        new Lab11_Bai9().setVisible(true);
    }
}
