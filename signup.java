package travel.management.system1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener {

    JButton create, back;
    Choice security;
    JTextField tfname, tfusername, tfpassword, tfanswer;
   

    signup() {
        setBounds(300, 190, 900, 360);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(360, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(510, 30, 360, 250);
        add(image);
        add(p1);

        JLabel lblusername = new JLabel("UserName");
        lblusername.setBounds(50, 20, 125, 25);
        lblusername.setFont(new Font("SAN SERIF", Font.BOLD, 14));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 180, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 70, 125, 25);
        lblname.setFont(new Font("SAN SERIF", Font.BOLD, 14));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(150, 70, 180, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(50, 120, 125, 25);
        lblpassword.setFont(new Font("SAN SERIF", Font.BOLD, 14));
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(150, 120, 180, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        setVisible(true);

        JLabel lblsecurity = new JLabel("Security Query");
        lblsecurity.setBounds(50, 160, 90, 25);
        lblsecurity.setFont(new Font("SAN SERIF", Font.BOLD, 14));

        p1.add(lblsecurity);

        security = new Choice();
        security.add("favourate Subject");
        security.add("favourate Game");
        security.add("your lucky number");
        security.add("your childhood superhero");
        security.setBounds(150, 160, 180, 25);
        p1.add(security);

        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(50, 200, 125, 25);
        lblanswer.setFont(new Font("SAN SERIF", Font.BOLD, 14));
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(150, 200, 180, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133, 193, 233));
        create.setFont(new Font("Tamoha", Font.BOLD, 14));
        create.setBounds(120, 240, 100, 30);
        create.setBorder(new LineBorder(new Color(133, 193, 232)));
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133, 193, 233));
        back.setFont(new Font("Tamoha", Font.BOLD, 14));
        back.setBounds(280, 240, 100, 30);
        back.setBorder(new LineBorder(new Color(133, 193, 232)));
        back.addActionListener(this);
        p1.add(back);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/twilight.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(1000, 0, 200, 200);
//        p1.add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ac) {
        if (ac.getSource() == create) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();
            String query = "insert into account values('" + username + "','" + name + "','" + password + "','" + question + "','" + answer + "')";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "account created successfully");
                setVisible(false);
                new login();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ac.getSource() == back) {
            setVisible(false);
            new login();

        }

    }

    public static void main(String[] args) {
        new signup();

    }

}
