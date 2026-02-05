package com.mycompany.thang;

import javax.swing.*;

public class Bai2_Lap11 extends JFrame {

    public Bai2_Lap11() {
        setTitle("Kiểm tra mật khẩu");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPasswordField pw = new JPasswordField(15);
        JButton btn = new JButton("Kiểm tra");

        btn.addActionListener(e -> {
            if (pw.getPassword().length < 6) {
                JOptionPane.showMessageDialog(this, "Mật khẩu quá ngắn");
            } else {
                JOptionPane.showMessageDialog(this, "Hợp lệ");
            }
        });

        JPanel p = new JPanel();
        p.add(new JLabel("Password:"));
        p.add(pw);
        p.add(btn);
        add(p);
    }

    public static void main(String[] args) {
        new Bai2_Lap11().setVisible(true);
    }
}
