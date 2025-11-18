
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class Search extends JFrame {

    Search() {

        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JLabel sroom= new JLabel("Search For Room");
        sroom.setBounds(250,11,186,31);
        sroom.setForeground(Color.white);
        sroom.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(sroom);
        
        JLabel status= new JLabel("Status :");
        status.setBounds(70,70,80,20);
        status.setForeground(Color.white);
        status.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(status);

        Choice c1 = new Choice();
        c1.setBounds(170,70,120,20);
        c1.add("Available");
        c1.add("Occupied");
        panel.add(c1);

        
        
        JTable tabel = new JTable();
        tabel.setBounds(0,187,700,210);
        tabel.setBackground(new Color(90,156,163));
        tabel.setForeground(Color.white);
        panel.add(tabel);
        
        try {
            
            Conn c = new Conn();
            String q = "select * from Room";
            ResultSet result = c.stm.executeQuery(q);
            tabel.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JLabel roomn= new JLabel("Room Number");
        roomn.setBounds(23,162,150,20);
        roomn.setForeground(Color.white);
        roomn.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(roomn);

        JLabel availabel= new JLabel("Availability");
        availabel.setBounds(195,162,150,20);
        availabel.setForeground(Color.white);
        availabel.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(availabel);

        JLabel price= new JLabel("Price");
        price.setBounds(400,162,150,20);
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel bed= new JLabel("Bed Type");
        bed.setBounds(580,162,150,20);
        bed.setForeground(Color.white);
        bed.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(bed);

        JButton search = new JButton("Search");
        search.setBounds(200,420,120,30);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.white);
        panel.add(search);
        search.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){ 

               try {
                 Conn co = new Conn();
                 String q = "select * from Room where AVAILABLE = '"+c1.getSelectedItem()+"'";
                 ResultSet result1 = co.stm.executeQuery(q);
                 tabel.setModel(DbUtils.resultSetToTableModel(result1));

               } catch (Exception E) {
                E.printStackTrace();
            }
        }
    });


        JButton back = new JButton("Back");
        back.setBounds(380,420,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });


        setUndecorated(true);
        setSize(700,500);
        setLocation(450,250);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Search();
    }
}