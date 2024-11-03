package travel.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class forgetpassword extends JFrame implements ActionListener {

    JTextField tfusername, tfname, tfsecurity, tfanswer, tfpassword;
    JButton search, retrieve, back;

    forgetpassword() {
        setBounds(300, 190, 850, 380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 70, 200, 200);
        add(image);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 30, 500, 280);
        add(p1);
        JLabel lblusername = new JLabel("UserName");
        lblusername.setBounds(40, 20, 100, 25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(220, 20, 150, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        search = new JButton("search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
        search.setBounds(380, 20, 90, 25);
        search.addActionListener(this);
        p1.add(search);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40, 60, 100, 25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(220, 60, 150, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblquestion = new JLabel("SecQue.");
        lblquestion.setBounds(40, 100, 100, 25);
        lblquestion.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblquestion);

        tfsecurity = new JTextField();
        tfsecurity.setBounds(220, 100, 150, 25);
        tfsecurity.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfsecurity);

        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(40, 140, 100, 25);
        lblanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(220, 140, 150, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        retrieve = new JButton("Retrieve");
        retrieve.setBackground(Color.GRAY);
        retrieve.setForeground(Color.WHITE);
        retrieve.setBounds(380, 140, 90, 25);
        retrieve.addActionListener(this);
        p1.add(retrieve);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 180, 150, 25);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(220, 180, 150, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        back = new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setBounds(150, 230, 90, 25);
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ac) {
        if (ac.getSource() == search) {

            try {

                String query = "select * from account where username= '" + tfusername.getText() + "' ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    tfname.setText(rs.getString("name"));
                    tfsecurity.setText(rs.getString("security"));
                }
            } catch (Exception e) {

                e.printStackTrace();

            }

        } else if (ac.getSource() == retrieve) {

            try {

                String query = "select * from account where answer= '" + tfanswer.getText() + "' AND username= '" + tfusername.getText() + "' ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    tfpassword.setText(rs.getString("password"));

                }
            } catch (Exception e) {

                e.printStackTrace();

            }

        } else {
            setVisible(false);
            new login();
        }

    }

    public static void main(String[] args) {
        new forgetpassword();

    }

}
