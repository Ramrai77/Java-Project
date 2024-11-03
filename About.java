package travel.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {

    About() {

        setBounds(300, 80, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200, 10, 100, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);

        String s = "About Project \n"
                + "\n"
                + "Travel and Tourism management system is used to book a tour from anywhere in the world by a single dynamic website which will help the user to know all about the places and tour details in a single website. The admin can add packages to the website from a certain travel agents and hotels through create a tour page.\n"
                + "\n"
                + "The main objective of the Tourism Management System is to manage the details of Customer, Hotel Booking, Cancellation and Tourism places. It manages all the information about Users, Hotel, Packages etc.\n"
                + "\n"
                + "Tourism management is the oversight of all activities related to the tourism and hospitality industries. It's a multidisciplinary field that prepares people with the interest, experience, and training for management positions in the food, accommodations, and tourism industry.\n"
                + "\n"
                + "Tourism serves as an effective means for economic integration and diversification, and poverty reduction. It can impact on earned income and people's livelihoods, development of local and rural economies, as well as on the natural and cultural environment.\n";
        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);

        JButton back = new JButton("Back");
        back.setBounds(200, 430, 100, 25);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ac) {

        setVisible(false);

    }

    public static void main(String[] args) {
        new About();

    }

}
