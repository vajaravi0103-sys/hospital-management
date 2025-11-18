import javax.swing.*;
import java.awt.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee_Info extends JFrame {
    Employee_Info()
    {
        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,570);
        panel.setBackground(new Color(109,164,170));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,34,980,450);
        table.setBackground(new Color(109,164,170));
        panel.add(table);

        try{
        	Conn c = new Conn();
        	String q = "select * from Emp_Info";
        	ResultSet result = c.stm.executeQuery(q);
        	table.setModel(DbUtils.resultSetToTableModel(result));
        	
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("Name");
        label1.setBounds(26,9,70,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Age ");
        label2.setBounds(166,9,70,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JLabel label3 = new JLabel("Phone Number");
        label3.setBounds(325,9,150,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setBounds(500,9,150,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4); 

        JLabel label5 = new JLabel("Gmail");
        label5.setBounds(685,9,150,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);

        JLabel label6 =new JLabel("Aadhar Number");
        label6.setBounds(810,9,150,20);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label6);

        JButton button = new JButton("BACK");
        button.setBounds(450,500,120,30);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(1000,580);
        setLocation(300,230);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Employee_Info();
    }
}
