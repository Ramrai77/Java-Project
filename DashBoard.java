package travel.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashBoard extends JFrame implements ActionListener {

    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackages, bookpackages;
    JButton viewpackages, viewhotels, destinations, bookhotels, viewbookedhotels, payment, calculator, notepad, about, deletePersonalDetails;

    DashBoard(String username) {
        this.username = username;

//        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();

        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 340, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");

        addPersonalDetails.setBounds(0, 0, 300, 35);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 35, 300, 35);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        updatePersonalDetails.addActionListener(this);

        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 70, 300, 35);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 55));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 105, 300, 35);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

        checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0, 140, 300, 35);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0, 0, 110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);

        bookpackages = new JButton("Book Packages");
        bookpackages.setBounds(0, 175, 300, 35);
        bookpackages.setBackground(new Color(0, 0, 102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.setMargin(new Insets(0, 0, 0, 120));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);

        viewpackages = new JButton("View Packages");
        viewpackages.setBounds(0, 210, 300, 35);
        viewpackages.setBackground(new Color(0, 0, 102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.setMargin(new Insets(0, 0, 0, 120));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);

        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 245, 300, 35);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 140));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

        bookhotels = new JButton("Book Hotels");
        bookhotels.setBounds(0, 280, 300, 35);
        bookhotels.setBackground(new Color(0, 0, 102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotels.setMargin(new Insets(0, 0, 0, 140));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);

        viewbookedhotels = new JButton("View Book Hotels");
        viewbookedhotels.setBounds(0, 315, 300, 35);
        viewbookedhotels.setBackground(new Color(0, 0, 102));
        viewbookedhotels.setForeground(Color.WHITE);
        viewbookedhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotels.setMargin(new Insets(0, 0, 0, 100));
        viewbookedhotels.addActionListener(this);
        p2.add(viewbookedhotels);

        destinations = new JButton("Destinations");
        destinations.setBounds(0, 350, 300, 35);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 140));
        destinations.addActionListener(this);
        p2.add(destinations);

        payment = new JButton("Payments");
        payment.setBounds(0, 385, 300, 35);
        payment.setBackground(new Color(0, 0, 102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payment.setMargin(new Insets(0, 0, 0, 160));
        payment.addActionListener(this);
        p2.add(payment);

        calculator = new JButton("Calculator");
        calculator.setBounds(0, 420, 300, 35);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0, 160));
        calculator.addActionListener(this);
        p2.add(calculator);

        notepad = new JButton("Notepad");
        notepad.setBounds(0, 455, 300, 35);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 160));
        notepad.addActionListener(this);
        p2.add(notepad);

        about = new JButton("About");
        about.setBounds(0, 490, 300, 35);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 180));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(5, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1000, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 30));
        image.add(text);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ac) {
        if (ac.getSource() == addPersonalDetails) {
            new addcustomer(username);

        } else if (ac.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);

        } else if (ac.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);

        } else if (ac.getSource() == checkpackages) {
            new CheckPackage();

        } else if (ac.getSource() == bookpackages) {
            new BookPackage(username);

        } else if (ac.getSource() == viewpackages) {

            new ViewPackage(username);

        } else if (ac.getSource() == viewhotels) {

            new CheckHotels();

        } else if (ac.getSource() == destinations) {

            new Destinations();

        } else if (ac.getSource() == bookhotels) {
            new BookHotels(username);

        } else if (ac.getSource() == viewbookedhotels) {

            new ViewBookedHotel(username);

        } else if (ac.getSource() == payment) {
            new Payments();

        } else if (ac.getSource() == calculator) {
            try {
                Runtime.getRuntime().exec("calc.exe");

            } catch (Exception e) {
                e.printStackTrace();

            }

        } else if (ac.getSource() == notepad) {
            try {
                Runtime.getRuntime().exec("notepad.exe");

            } catch (Exception e) {
                e.printStackTrace();

            }

        } else if (ac.getSource() == about) {
            new About();

        } else if (ac.getSource() == deletePersonalDetails) {

            new DeleteDetails(username);
        }

    }

    public static void main(String[] args) {

        new DashBoard("");

    }

}
