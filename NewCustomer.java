import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewCustomer extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    NewCustomer() {
        setLocation(600,200);
        setSize(700,500);

        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        p.setBackground(new Color(173,216,230));

        JLabel title = new JLabel("New Customer");
        title.setBounds(180,10,200,26);
        title.setFont(new Font("Tahoma", Font.PLAIN,24));
        p.add(title);

        l1 = new JLabel("Customer Name");
        l1.setBounds(100,80,100,20);
        t1 = new JTextField();
        t1.setBounds(240,80,200,20);
        p.add(l1);
        p.add(t1);
        l2 = new JLabel("Meter No");
        l2.setBounds(100,120,100,20);
        l11 = new JLabel();
        l11.setBounds(240,120,1200,20);
        p.add(l2);
        p.add(l11);
        l3 = new JLabel("Address");
        l3.setBounds(100,160,100,20);
        t3 = new JTextField();
        t3.setBounds(240,160,200,20);
        p.add(l3);
        p.add(t3);
        l5 = new JLabel("City");
        l5.setBounds(100,200,100,20);
        t5 = new JTextField();
        t5.setBounds(240,200,200,20);
        p.add(l5);
        p.add(t5);
        l4 = new JLabel("State");
        l4.setBounds(100,240,100,20);
        t4 = new JTextField();
        t4.setBounds(240,240,200,20);
        p.add(t4);
        p.add(l4);

        l6 = new JLabel("Email");
        l6.setBounds(100,280,100,20);
    }
}
