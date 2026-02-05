package com.mycompany.thang;

import javax.swing.*;

public class Lab11_Bai7 extends JFrame {

    public Lab11_Bai7() {
        setTitle("Bài 7 - Phản hồi");
        setSize(350,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField title = new JTextField(20);
        JTextArea content = new JTextArea(5,20);
        JButton btn = new JButton("Gửi");

        btn.addActionListener(e -> {
            if(content.getText().trim().isEmpty())
                JOptionPane.showMessageDialog(this,"Nội dung rỗng");
            else JOptionPane.showMessageDialog(this,"Gửi thành công");
        });

        JPanel p = new JPanel();
        p.add(new JLabel("Tiêu đề")); p.add(title);
        p.add(new JScrollPane(content));
        p.add(btn);
        add(p);
    }

    public static void main(String[] args) {
        new Lab11_Bai7().setVisible(true);
    }
}
