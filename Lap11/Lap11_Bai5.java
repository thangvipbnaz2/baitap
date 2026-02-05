package com.mycompany.thang;

import javax.swing.*;

public class Lap11_Bai5 extends JFrame {

    public Lap11_Bai5() {
        setTitle("Bài 5 - Đăng ký");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField txtName = new JTextField(15);
        JPasswordField pw = new JPasswordField(15);

        JRadioButton nam = new JRadioButton("Nam");
        JRadioButton nu = new JRadioButton("Nữ");
        ButtonGroup g = new ButtonGroup();
        g.add(nam); g.add(nu);

        JCheckBox c1 = new JCheckBox("Đọc sách");
        JCheckBox c2 = new JCheckBox("Nghe nhạc");

        JTextArea area = new JTextArea(5,25);
        JButton btn = new JButton("Đăng ký");

        btn.addActionListener(e -> {
            if(txtName.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Thiếu họ tên");
                return;
            }
            area.setText("Họ tên: "+txtName.getText()+"\n");
            area.append("Giới tính: "+(nam.isSelected()?"Nam":"Nữ")+"\n");
            area.append("Sở thích: ");
            if(c1.isSelected()) area.append("Đọc sách ");
            if(c2.isSelected()) area.append("Nghe nhạc ");
        });

        JPanel p = new JPanel();
        p.add(new JLabel("Họ tên")); p.add(txtName);
        p.add(new JLabel("Mật khẩu")); p.add(pw);
        p.add(nam); p.add(nu);
        p.add(c1); p.add(c2);
        p.add(btn);
        p.add(new JScrollPane(area));
        add(p);
    }

    public static void main(String[] args) {
        new Lap11_Bai5().setVisible(true);
    }
}
