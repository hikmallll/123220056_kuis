/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220056_kuis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Frame1 extends JFrame {
    
    
    JTextField tusername;
    JPasswordField tpassword;
    JLabel lblLogin;
    JButton btnlogin,btncancel;
    
    
    public Frame1(){
        
    super ("Login");  
    
    JPanel mainpanel = new JPanel();
    mainpanel.setLayout(new GridLayout(4,2,5,5));
    
    JLabel username = new JLabel ("Username : " );
    tusername = new JTextField(15);
    mainpanel.add(username);
    mainpanel.add(tusername);
    
    
    JLabel password = new JLabel ("Password : " );
    tpassword = new JPasswordField(15);
    mainpanel.add(password);
    mainpanel.add(tpassword);
    
    btnlogin = new JButton("Masuk");
    mainpanel.add(btnlogin);
    
    btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             String username = tusername.getText();
             String password = new String (tpassword.getPassword());
             if("tukang_056".equals(username) && "tukang_056".equals(password)){
             // ke frame selanjutnya
             Frame2 frame2 = new Frame2();
             frame2.setVisible(true);
             dispose();
             }else{
             lblLogin.setText("Status : Gagal Masuk");
             }
            }
        });
    
    btncancel = new JButton("Keluar");
    mainpanel.add(btncancel);
    btncancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             System.exit(0);
            }
        });
    
    lblLogin = new JLabel("Status : None");
    mainpanel.add(lblLogin);
    
    add(mainpanel);
    
    setSize(300,130);
    setResizable(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    
}
