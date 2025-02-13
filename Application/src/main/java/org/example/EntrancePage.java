package org.example;

import javax.swing.*;
import java.awt.*;

public class EntrancePage {
    JFrame frame;

    JTextField userName;

    JPanel userNamePanel;
    EntrancePage(){
        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLayout(new GridLayout(3,1));

        userName = new JTextField();
        userName.setPreferredSize(new Dimension(200,30));

        userNamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        userNamePanel.add(new JLabel("Kullanıcı Adı: "));
        userNamePanel.add(userName);

        frame.add(userNamePanel);
        frame.add(userName);
        frame.pack();
        frame.setVisible(true);
    }
}
