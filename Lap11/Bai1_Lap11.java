package com.mycompany.thang;

import javax.swing.*;

public class Bai1_Lap11 extends JFrame {

    public Bai1_Lap11() {
        setTitle("Form Họ Tên");
        setSize(300,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lbl = new JLabel("Họ tên:");
        JTextField txt = new JTextField(15);
        JButton btn = new JButton("Hiển thị");
        JLabel rs = new JLabel();

        btn.addActionListener(e -> {
            if(txt.getText().trim().isEmpty())
                JOptionPane.showMessageDialog(this,"Không được rỗng");
            else rs.setText(txt.getText());
        });

        JPanel p = new JPanel();
        p.add(lbl); p.add(txt); p.add(btn); p.add(rs);
        add(p);
    }

    public static void main(String[] args) {
        new Bai1_Lap11().setVisible(true);
    }
}
