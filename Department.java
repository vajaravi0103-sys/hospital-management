import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;

public class Department extends JFrame{
	
	Department()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,690,490);
		panel.setLayout(null);
		panel.setBackground(new Color(90,156,163));
		add(panel);
		
		JTable table = new JTable();
		table.setBounds(0,40,690,350);
		table.setBackground(new Color(90,156,153));
		panel.add(table);
		
		try {
			Conn c = new Conn();
			
			String q = "select * from Department";
			ResultSet resultSet = c.stm.executeQuery(q);
			table.setModel(DbUtils.resultSetToTableModel(resultSet));
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JLabel depart = new JLabel("Department");
		depart.setBounds(5,8,100,30);
		depart.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(depart);
		
		JLabel no = new JLabel("Phone No");
		no.setBounds(340,8,100,30);
		no.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(no);
		
		JButton b1= new JButton("Back");
		b1.setBounds(400,410,130,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		panel.add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
			
		});
		
		
		setUndecorated(true);
		setSize(700,500);
		setLayout(null);
		setLocation(350,250);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new Department();
	}

}
