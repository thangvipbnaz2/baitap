package com.mycompany.thang;

import javax.swing.*;

public class Lap11_Bai3 extends JFrame {

    public Lap11_Bai3() {
        setTitle("Bài 3 - Sở thích");
        setSize(350,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JCheckBox c1 = new JCheckBox("Đọc sách");
        JCheckBox c2 = new JCheckBox("Nghe nhạc");
        JCheckBox c3 = new JCheckBox("Xem phim");
        JCheckBox c4 = new JCheckBox("Du lịch");

        JTextArea area = new JTextArea(5,25);
        JButton btn = new JButton("Xác nhận");

        btn.addActionListener(e -> {
            area.setText("");
            if(c1.isSelected()) area.append("Đọc sách\n");
            if(c2.isSelected()) area.append("Nghe nhạc\n");
            if(c3.isSelected()) area.append("Xem phim\n");
            if(c4.isSelected()) area.append("Du lịch\n");
        });

        JPanel p = new JPanel();
        p.add(c1); p.add(c2); p.add(c3); p.add(c4);
        p.add(btn);
        p.add(new JScrollPane(area));
        add(p);
    }

    public static void main(String[] args) {
        new Lap11_Bai3().setVisible(true);
    }
}
