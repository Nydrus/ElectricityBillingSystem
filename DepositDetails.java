import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;





public class DepositDetails extends JFrame implements ActionListener {
    JTable t1;
    JButton b1, b2;
    JLabel l1, l2;
    Choice c1, c2;
    String x[] = {"Meter Number", "Month", "Units", "Total Bill", "Status"};
    String y[][] = new String[40][8];
    int i = 0, j = 0;

    DepositDetails() {
        super("Deposit Details");
        setSize(700, 750);
        setLocation(600, 150);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        l1 = new JLabel("Sort by meter Number");
        l1.setBounds(20, 20, 150, 20);
        add(l1);

        c1 = new Choice();

        l2 = new JLabel("Sort by Month");
        l2.setBounds(400, 20, 100, 20);
        add(l2);

        c2 = new Choice();

        t1 = new JTable(y, x);

        try{
            Conn c = new Conn();
            String s1 ="SELECT * from bill";
            ResultSet rs = c.s.executeQuery(s1);

            t1.setModel(DbU);
        }
    }
}
