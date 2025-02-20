package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownServiceException;

class loginPage implements ActionListener {
    JFrame frame;

    JTextField userName;
    JTextField userPassword;

    JPanel userNamePanel;
    JPanel userPasswordPanel;

    JButton button;

    loginPage(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));

        userName = new JTextField();
        userName.setPreferredSize(new Dimension(200,30));

        userPassword = new JTextField();
        userPassword.setPreferredSize(new Dimension(200,30));

        userNamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        userNamePanel.add(new JLabel("Kullanıcı Adı: "));
        userNamePanel.add(userName);

        userPasswordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        userPasswordPanel.add(new JLabel("Şifre: "));
        userPasswordPanel.add(userPassword);

        button = new JButton("Gönder");
        button.addActionListener(this);
        button.setFocusable(false);

        frame.add(userNamePanel);
        frame.add(userName);
        frame.add(userPasswordPanel);
        frame.add(userPassword);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (button == e.getSource()){
            String userNameText = userName.getText();
            String userPasswordText = userPassword.getText();

            if (userNameText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı Veya Şifre Boş Bırakılamaz!", "Uyarı", JOptionPane.WARNING_MESSAGE);
            }

            if (userPasswordText.length() < 5){
                JOptionPane.showMessageDialog(null, "Şifre  En az 5 Karakterli Olabilir!", "Uyarı", JOptionPane.WARNING_MESSAGE);
            }

            if (userNameText.equals("Abdulhamit") && userPasswordText.equals("1234")){
                JOptionPane.showMessageDialog(null, "Giriş Başarılı!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Hatalı Giriş Yaptınız Tekrar Deneyin!", "Uyarı", JOptionPane.WARNING_MESSAGE);
            }

        }
    }
}
