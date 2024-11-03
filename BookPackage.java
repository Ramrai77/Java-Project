package travel.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener {

    Choice cpackage;
    JTextField tfpersons;
    String username;
    JLabel labelusername, labelid, labelnumber, labelphone, labelprice;
    JButton checkprice, bookpackage, back;

    BookPackage(String username) {
        this.username = username;

        setBounds(180, 100, 1100, 500);

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 60, 100, 20);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblusername);

        labelusername = new JLabel("");
        labelusername.setBounds(220, 60, 200, 20);
        labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelusername);

        JLabel lblselectpackage = new JLabel("Select Package");
        lblselectpackage.setBounds(40, 110, 150, 20);
        lblselectpackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblselectpackage);

        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronz Package");
        cpackage.setBounds(220, 110, 200, 25);
        add(cpackage);

        JLabel lbltperson = new JLabel("Total Persons");
        lbltperson.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbltperson.setBounds(40, 160, 150, 20);
        add(lbltperson);

        tfpersons = new JTextField();
        tfpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfpersons.setBounds(220, 160, 200, 25);
        add(tfpersons);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(40, 210, 150, 20);
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblid);

        labelid = new JLabel("");
        labelid.setBounds(220, 210, 200, 20);
        labelid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(40, 260, 150, 20);
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblnumber);

        labelnumber = new JLabel("");
        labelnumber.setBounds(220, 260, 150, 20);
        labelnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40, 310, 150, 20);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblphone);

        labelphone = new JLabel("");
        labelphone.setBounds(220, 310, 150, 20);
        labelphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelphone);

        JLabel lblprice = new JLabel("Total Price");
        lblprice.setBounds(40, 360, 150, 20);
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblprice);

        labelprice = new JLabel("");
        labelprice.setBounds(220, 360, 150, 20);
        labelprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelprice);

        try {

            Conn c = new Conn();

            String query = "select * from customer where username='" + username + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));

                labelphone.setText(rs.getString("phone"));

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60, 410, 120, 25);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage = new JButton("Book Package");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(200, 410, 120, 25);
        bookpackage.addActionListener(this);
        add(bookpackage);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340, 410, 120, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(530, 40, 500, 400);
        add(image);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ac) {
        if (ac.getSource() == checkprice) {
            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if (pack.equals("Gold Package")) {
                cost += 12000;

            } else if (pack.equals("Silver Package")) {
                cost += 24000;

            } else {
                cost += 32000;

            }

            int persons = Integer.parseInt(tfpersons.getText());
            cost *= persons;
            labelprice.setText("Rs." + cost);

        } else if (ac.getSource() == bookpackage) {

            try {
                Conn c = new Conn();

                c.s.executeUpdate("insert into bookpackage values('" + labelusername.getText() + "','" + cpackage.getSelectedItem() + "','" + tfpersons.getText() + "','" + labelid.getText() + "','" + labelnumber.getText() + "','" + labelphone.getText() + "','" + labelprice.getText() + "')");
                JOptionPane.showMessageDialog(null, "Package Booked Succesfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();

            }

        } else {
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new BookPackage("ram");

    }

}
