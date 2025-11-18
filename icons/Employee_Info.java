import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Employee_Info extends JFrame {
    Employee_Info()
    {
        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,530);
        panel.setBackground(new Color(109,164,170));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,34,980,400);
        table.setBackground(new Color(109,164,170));
        panel.add(table);

        try{

        }catch(Exception e)
        {
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("Name");
        label1.setBounds(41,9,70,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Age ");
        label2.setBounds(180,9,70,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JLabel label3 = new JLabel("Phone Number");
        label3.setBounds(350,9,150,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setBounds(550,9,150,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4); 

        JLabel label5 = new JLabel("Gmail");
        label5.setBounds(730,9,150,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);

        JLabel label6 =new JLabel("Aadhar Number");
        label6.setBounds(830,9,150,20);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label6);

        JButton button = new JButton("BACK");
        button.setBounds(350,480,120,30);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
        });
        setUndecorated(true);
        setSize(1000,540);
        setLocation(350,230);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Employee_Info();
    }
}
