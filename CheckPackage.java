package travel.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckPackage extends JFrame implements ActionListener {

    JButton close;

    CheckPackage() {

        setBounds(300, 70, 900, 600);
        close = new JButton("Close Pack");
        close.setBackground(Color.BLACK);
        close.setForeground(Color.WHITE);
        close.setBounds(520, 460, 100, 25);
        close.addActionListener(this);
        add(close);

        String[] package1 = {"GOLD PACKAGE", "6Days and 7Nights", "Airport Assistance", "Half Day City Tour", "Daily and Byufet", "Full Day 3 Island Cruise and Soft Drink Free", "English Speaking Guide", "BOOKED PACKAGE", "Summer Specail", "Rs. 12000/-", "package1.jpg"};
        String[] package2 = {"SILVER PACKAGE", "5 Days and 6 Nights", "Toll Free", " Enterance Free Ticket", "Meet and Greet Airport", "Welcome Drink Arrival", "Night Sufari with Dinner", "BOOKED PACKAGE", "Winter Specail", "Rs.24,000/-", "package2.jpg"};
        String[] package3 = {"BRONZE PACKAGE", "6 Days and 5 Nights", "Winter Specail", "Return Airfare", "Free Clubing, Hourse Riding& and Other Games ", "Hard Drink Free ", "Daily Bufet", "BBQ Dinner", "BOOKED PACKAGE", "Rs. 32000/-", "package3.jpg"};

        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tab.addTab("Package1", null, p1);

        JPanel p2 = createPackage(package2);
        tab.addTab("Package2", null, p2);

        JPanel p3 = createPackage(package3);
        tab.addTab("Package3", null, p3);

        add(tab);

        setVisible(true);

    }

    public JPanel createPackage(String[] pack) {

        JPanel p1 = new JPanel();

        p1.setLayout(null);

        p1.setBackground(Color.WHITE);

        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50, 5, 300, 40);
        l1.setForeground(Color.YELLOW);
        l1.setFont(new Font("TahomaT", Font.BOLD, 30));
        p1.add(l1);

        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30, 60, 300, 40);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("TahomaT", Font.BOLD, 20));
        p1.add(l2);

        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30, 110, 300, 40);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("TahomaT", Font.BOLD, 20));
        p1.add(l3);

        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30, 160, 300, 40);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("TahomaT", Font.BOLD, 20));
        p1.add(l4);

        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30, 210, 300, 40);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("TahomaT", Font.BOLD, 20));
        p1.add(l5);

        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30, 260, 300, 40);
        l6.setForeground(Color.BLUE);
        l6.setFont(new Font("TahomaT", Font.BOLD, 20));
        p1.add(l6);

        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30, 310, 300, 40);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("TahomaT", Font.BOLD, 20));
        p1.add(l7);

        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30, 360, 300, 40);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("TahomaT", Font.BOLD, 20));
        p1.add(l8);

        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(60, 430, 300, 40);
        l9.setForeground(Color.RED);
        l9.setFont(new Font("TahomaT", Font.BOLD, 25));
        p1.add(l9);

        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(80, 480, 300, 40);
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("TahomaT", Font.BOLD, 25));
        p1.add(l10);

        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(500, 480, 300, 40);
        l11.setForeground(Color.darkGray);
        l11.setFont(new Font("TahomaT", Font.BOLD, 25));
        p1.add(l11);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/" + pack[10]));

        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);

        JLabel l12 = new JLabel(i3);
        l12.setBounds(350, 20, 400, 400);
        p1.add(l12);

        return p1;

    }

    public void actionPerformed(ActionEvent ac) {
        setVisible(false);

    }

    public static void main(String[] args) {

        new CheckPackage();

    }

}
