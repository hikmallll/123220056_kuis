/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220056_kuis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame2 extends JFrame {

    JTextField inputa, inputb, hasil;
    JButton hitung, ulang, kemain;
    JLabel perhitungan;

    public Frame2() {

        super("Hitung Suku");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel nilaia = new JLabel("Masukkan nilai A : ");
        inputa = new JTextField(15);
        panel.add(nilaia);
        panel.add(inputa);

        JLabel nilaib = new JLabel("Masukkan nilai B : ");
        inputb = new JTextField(15);
        panel.add(nilaib);
        panel.add(inputb);

        hitung = new JButton("Hitung");
        panel.add(hitung);
        hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double a = Double.parseDouble(inputa.getText());
                    double b = Double.parseDouble(inputb.getText());

                    double finalResult = Math.sqrt((a * a) + (b * b));
                    perhitungan.setText(String.valueOf(finalResult));
                } catch (NumberFormatException p) {
                    JOptionPane.showMessageDialog(null, "Isi pake angka bang", "Error", JOptionPane.ERROR_MESSAGE);
                    inputa.setText("");
                    inputb.setText("");
                }

            }
        });

        perhitungan = new JLabel("null");
        panel.add(perhitungan);

        ulang = new JButton("Ulang");
        panel.add(ulang);
        ulang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputa.setText("");
                inputb.setText("");
                perhitungan.setText("");

            }
        });

        kemain = new JButton("Ke Login");
        panel.add(kemain);
        kemain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame1 frame1 = new Frame1();
                frame1.setVisible(true);
                dispose();
            }
        });

        add(panel);
        setSize(300, 130);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
