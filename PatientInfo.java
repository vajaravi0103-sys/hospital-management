import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;

public class PatientInfo extends JFrame {
    JButton back;

     PatientInfo() {


        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,530);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,900,400);
        table.setBackground(new Color(90,156,163));
        panel.add(table);
        
        try {
        Conn c = new Conn();
        String q = "select * from patient_info";
        ResultSet resultSet = c.stm.executeQuery(q);
        table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch(Exception e)
        {
        	e.printStackTrace();
        }

        JLabel id = new JLabel("ID");
        id.setBounds(31,11,100,14);
        id.setFont(new Font("tahoma",Font.BOLD,14));
        panel.add(id);

        JLabel number = new JLabel("Number");
        number.setBounds(130,11,100,14);
        number.setFont(new Font("tahoma",Font.BOLD,14));
        panel.add(number);

        JLabel name = new JLabel("Name");
        name.setBounds(245,11,100,14);
        name.setFont(new Font("tahoma",Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(340,11,100,14);
        gender.setFont(new Font("tahoma",Font.BOLD,14));
        panel.add(gender);

        JLabel disease = new JLabel("Disease");
        disease.setBounds(450,11,100,14);
        disease.setFont(new Font("tahoma",Font.BOLD,14));
        panel.add(disease);

        JLabel room = new JLabel("Room");
        room.setBounds(560,11,100,14);
        room.setFont(new Font("tahoma",Font.BOLD,14));
        panel.add(room);
        
        JLabel time = new JLabel("Time");
        time.setBounds(690,11,100,14);
        time.setFont(new Font("tahoma",Font.BOLD,14));
        panel.add(time);

        JLabel deposit = new JLabel("Deposit");
        deposit.setBounds(790,11,100,20);
        deposit.setFont(new Font("tahoma",Font.BOLD,14));
        panel.add(deposit);

        back = new JButton("Back");
        back.setBounds(400,460,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        setUndecorated(true);
        setLayout(null);
        setSize(900,540);
        setLocation(300,230);
        setVisible(true);
    } 
    public static void main(String[] args) {
        new PatientInfo();
    }
    
}
