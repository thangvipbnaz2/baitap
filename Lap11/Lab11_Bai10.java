package com.mycompany.thang;

import javax.swing.*;

public class Lab11_Bai10 extends JFrame {

    public Lab11_Bai10() {
        setTitle("Bài 10 - Login");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField user = new JTextField(15);
        JPasswordField pass = new JPasswordField(15);
        JButton btn = new JButton("Đăng nhập");

        btn.addActionListener(e -> {
            if(user.getText().equals("admin") && 
               String.valueOf(pass.getPassword()).equals("123"))
                JOptionPane.showMessageDialog(this,"Chào mừng!");
            else JOptionPane.showMessageDialog(this,"Sai thông tin");
        });

        JPanel p = new JPanel();
        p.add(new JLabel("User")); p.add(user);
        p.add(new JLabel("Pass")); p.add(pass);
        p.add(btn);
        add(p);
    }

    public static void main(String[] args) {
        new Lab11_Bai10().setVisible(true);
    }
}
