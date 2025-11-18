import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Patient_discharge extends JFrame {
	
	JButton Check;

    Patient_discharge(){


        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JLabel cko = new JLabel("Check-Out");
        cko.setBounds(100,20,150,20);
        cko.setFont(new Font("tahoma",Font.BOLD,20));
        cko.setForeground(Color.white);
        panel.add(cko);

        JLabel id = new JLabel("Customer-Id");
        id.setBounds(30,80,150,20);
        id.setFont(new Font("tahoma",Font.BOLD,14));
        id.setForeground(Color.white);
        panel.add(id);

        Choice choice = new Choice();
        choice.setBounds(200,80,150,20);
        panel.add(choice);
        
        try {
        	Conn c = new Conn();
        	ResultSet resultSet = c.stm.executeQuery("select * from patient_info");
        	while (resultSet.next()) {
        		choice.add(resultSet.getString("NUMBER"));
        	}
        }catch(Exception e) {
        	e.printStackTrace();
        }

        JLabel rno = new JLabel("Room Number");
        rno.setBounds(30,130,150,20);
        rno.setFont(new Font("tahoma",Font.BOLD,14));
        rno.setForeground(Color.white);
        panel.add(rno);

        JLabel RNO = new JLabel("");
        RNO.setBounds(200,130,150,20);
        RNO.setFont(new Font("tahoma",Font.BOLD,14));
        RNO.setForeground(Color.white);
        panel.add(RNO);

        JLabel time = new JLabel("In Time");
        time.setBounds(30,180,150,20);
        time.setFont(new Font("tahoma",Font.BOLD,14));
        time.setForeground(Color.white);
        panel.add(time);

        JLabel INTime = new JLabel("");
        INTime.setBounds(200,180,150,20);
        INTime.setFont(new Font("tahoma",Font.BOLD,14));
        INTime.setForeground(Color.white);
        panel.add(INTime);

        JLabel ot = new JLabel("Out Time");
        ot.setBounds(30,230,150,20);
        ot.setFont(new Font("tahoma",Font.BOLD,14));
        ot.setForeground(Color.white);
        panel.add(ot);

        Date date = new Date();

        JLabel ot1 = new JLabel(""+date);
        ot1.setBounds(200,230,250,20);
        ot1.setFont(new Font("tahoma",Font.BOLD,14));
        ot1.setForeground(Color.white);
        panel.add(ot1);

        JButton discharge = new JButton("Discharge");
        discharge.setBounds(30,300,120,30);
        discharge.setForeground(Color.white);
        discharge.setBackground(Color.black);
        panel.add(discharge);
        discharge.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){

                try {
                    Conn p = new Conn();
                    p.stm.executeUpdate("delete from patient_info where NUMBER = '"+choice.getSelectedItem()+"'");
                    p.stm.executeUpdate("Update Room set AVAILABLE = 'AVAILABLE' where NO = '"+rno.getText()+"'");
                    JOptionPane.showInputDialog(null,"done");
                    dispose();
                    
                } catch(Exception E) {
                    E.printStackTrace();
                }

            }
        });

        Check = new JButton("Check");
        Check.setBounds(170,300,120,30);
        Check.setForeground(Color.white);
        Check.setBackground(Color.BLACK);
        panel.add(Check);
        Check.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) {
        		Conn c = new Conn();
        		try {
        			ResultSet resultSet = c.stm.executeQuery("select * from patient_info where NUMBER = '"+choice.getSelectedItem()+"'");
        			while (resultSet.next()) {
        				RNO.setText(resultSet.getString("ROOM_NUMBER"));
        				INTime.setText(resultSet.getString("TIME"));
        				
        			}
        		}catch(Exception E) {
        			E.printStackTrace();
        		}
        		
        	}
        });

        JButton back = new JButton("Back");
        back.setBounds(300,300,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });


        setUndecorated(true);
        setSize(800,400);
        setLocation(400,250);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Patient_discharge();
    }
    
}
