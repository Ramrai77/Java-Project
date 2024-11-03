package travel.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotels extends JFrame implements ActionListener {

    Choice chotel, cac, cfood;
    JTextField tfdays, tfpersons;
    String username;
    JLabel labelusername, labelid, labelnumber, labelphone, labelprice;
    JButton checkprice, bookpackage, back;

    BookHotels(String username) {
        this.username = username;

        setBounds(150, 100, 1100, 600);

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("BOOK HOTEL");
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

        JLabel lblselectpackage = new JLabel("Select Hotel");
        lblselectpackage.setBounds(40, 110, 150, 20);
        lblselectpackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblselectpackage);

        chotel = new Choice();
        chotel.setBounds(220, 110, 200, 25);
        add(chotel);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while (rs.next()) {
                chotel.add(rs.getString("name"));

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        JLabel lbltperson = new JLabel("Total Persons");
        lbltperson.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbltperson.setBounds(40, 160, 150, 20);
        add(lbltperson);

        tfpersons = new JTextField();
        tfpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfpersons.setBounds(220, 160, 200, 25);
        add(tfpersons);

        JLabel lbldays = new JLabel("No. Of Days");
        lbldays.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbldays.setBounds(40, 210, 150, 20);
        add(lbldays);

        tfdays = new JTextField();
        tfdays.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfdays.setBounds(220, 210, 200, 25);
        add(tfdays);

        JLabel lblac = new JLabel("AC/Non-AC");
        lblac.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblac.setBounds(40, 260, 150, 20);
        add(lblac);

        cac = new Choice();
        cac.setBounds(220, 260, 200, 25);
        cac.add("AC");
        cac.add("Non-AC");

        add(cac);

        JLabel lblfood = new JLabel("Food Included");
        lblfood.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblfood.setBounds(40, 310, 150, 20);
        add(lblfood);

        cfood = new Choice();
        cfood.setBounds(220, 310, 200, 25);
        cfood.add("Yes");
        cfood.add("No");

        add(cfood);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(40, 360, 150, 20);
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblid);

        labelid = new JLabel("");
        labelid.setBounds(220, 360, 200, 20);
        labelid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(40, 410, 150, 20);
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblnumber);

        labelnumber = new JLabel("");
        labelnumber.setBounds(220, 410, 150, 20);
        labelnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40, 460, 150, 20);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblphone);

        labelphone = new JLabel("");
        labelphone.setBounds(220, 460, 150, 20);
        labelphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelphone);

        JLabel lblprice = new JLabel("Total Price");
        lblprice.setBounds(40, 510, 150, 20);
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblprice);

        labelprice = new JLabel("");
        labelprice.setBounds(220, 510, 150, 20);
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
        checkprice.setBounds(560, 500, 120, 25);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage = new JButton("Book Hotel");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(710, 500, 120, 25);
        bookpackage.addActionListener(this);
        add(bookpackage);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(860, 500, 120, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 40, 600, 400);
        add(image);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ac) {
        if (ac.getSource() == checkprice) {
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel where name='" + chotel.getSelectedItem() + "'");
                while (rs.next()) {
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                    int food = Integer.parseInt(rs.getString("foodinclude"));
                    int coac = Integer.parseInt(rs.getString("acroom"));

                    int persons = Integer.parseInt(tfpersons.getText());
                    int days = Integer.parseInt(tfdays.getText());

                    String acselected = cac.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();

                    if (persons * days > 0) {
                        int total = 0;
                        total += acselected.equals("AC") ? coac : 0;
                        total += foodselected.equals("Yes") ? food : 0;
                        total += cost;
                        total += total * persons * days;
                        labelprice.setText("Rs." + total);

                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid");

                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ac.getSource() == bookpackage) {

            try {
                Conn c = new Conn();

                c.s.executeUpdate("insert into bookhotel values('" + labelusername.getText() + "','" + chotel.getSelectedItem() + "','" + tfpersons.getText() + "','" + tfdays.getText() + "','" + cac.getSelectedItem() + "','" + cfood.getSelectedItem() + "','" + labelid.getText() + "','" + labelnumber.getText() + "','" + labelphone.getText() + "','" + labelprice.getText() + "')");
                JOptionPane.showMessageDialog(null, "Hotel Booked Succesfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();

            }

        } else {
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new BookHotels("ram");

    }

}
