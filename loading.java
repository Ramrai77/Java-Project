package travel.management.system1;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class loading extends JFrame implements Runnable {

    Thread t;
    JProgressBar bar;
    String username;

    public void run() {
        try {

            for (int i = 1; i <= 101; i++) {
                int max = bar.getMaximum();
                int value = bar.getValue();

                if (value < max) {

                    bar.setValue(bar.getValue() + 1);

                } else {
                    setVisible(false);
                    new DashBoard(username);
                }
                Thread.sleep(50);

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    loading(String username) {
        this.username = username;
        t = new Thread(this);

        setBounds(400, 190, 700, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway", Font.BOLD, 32));

        add(text);

        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading = new JLabel("Loading, Please Wait.....");
        loading.setBounds(230, 130, 150, 40);
        loading.setForeground(Color.RED);
        loading.setFont(new Font("Raleway", Font.BOLD, 16));
        add(loading);

        JLabel lblusername = new JLabel("Welcome " + username);
        lblusername.setBounds(20, 310, 400, 40);
        lblusername.setForeground(Color.RED);
        lblusername.setFont(new Font("Raleway", Font.BOLD, 16));
        add(lblusername);
        t.start();

        setVisible(true);

    }

    public static void main(String[] args) {

        new loading(" ");

    }

}
