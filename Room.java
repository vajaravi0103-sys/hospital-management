import javax.swing.*;
import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame{
	
	JTable table;
	
	Room()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,890,570);
		panel.setBackground(new Color(90,156,163));
		panel.setLayout(null);
		add(panel);
		
		ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/roomm.png"));
		Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon imageIcon1 = new ImageIcon(image);
		JLabel label = new JLabel(imageIcon1);
		label.setBounds(600,200,200,200);
		panel.add(label);
		
		table = new JTable();
		table.setBounds(10,40,500,400);
		table.setBackground(new Color(90,156,163));
		panel.add(table);
		
		try {
		
		Conn c = new Conn();
		
		
		String q = "select * from Room";
		ResultSet result = c.stm.executeQuery(q);
		table.setModel(DbUtils.resultSetToTableModel(result));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		JLabel roomno = new JLabel("Room No");
		roomno.setBounds(10,8,100,30);
		//roomno.setBackground(new Color(90,156,163));
		roomno.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(roomno);
		
		JLabel available = new JLabel("Availability");
		available.setBounds(120, 8, 110, 30);
		available.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(available);
		
		JLabel price = new JLabel("Price");
		price.setBounds(255,8,100,30);
		price.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(price);
		
		JLabel bed = new JLabel("Bed Type");
		bed.setBounds(380,8,100,30);
		bed.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(bed);
		
		JButton b1= new JButton("Back");
		b1.setBounds(250,510,130,30);
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
		setSize(900,580);
		setLayout(null);
		setLocation(300,230);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new Room();
	}

}
