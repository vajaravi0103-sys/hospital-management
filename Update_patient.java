
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Update_patient extends JFrame{

    Update_patient(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setLayout(null);
        panel.setBackground(new Color(90,156,163));
        add(panel);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/updated.png"));
        Image img1 = img.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(img1);
        JLabel label = new JLabel(img2);
        label.setBounds(500,60,250,250);
        panel.add(label);

        JLabel upd = new JLabel("Update Patient Details");
        upd.setBounds(124,11,260,25);
        upd.setFont(new Font("tahoma",Font.BOLD,20));
        upd.setForeground(Color.white);
        panel.add(upd);

        JLabel name = new JLabel("Name :");
        name.setBounds(25,88,100,14);
        name.setFont(new Font("tahoma",Font.BOLD,14));
        name.setForeground(Color.white);
        panel.add(name);

        Choice c1 = new Choice();
        try {
            
            Conn c = new Conn();
            ResultSet result = c.stm.executeQuery("select * from patient_info");
            while(result.next()){
                c1.add(result.getString("NAME"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        c1.setBounds(248,85,140,25);
        panel.add(c1);

        JLabel rn = new JLabel("Room Number :");
        rn.setBounds(25,129,150,14);
        rn.setFont(new Font("tahoma",Font.BOLD,14));
        rn.setForeground(Color.white);
        panel.add(rn);

        JTextField roomn = new JTextField();
        roomn.setBounds(248,129,140,20);
        panel.add(roomn);


        JLabel intime = new JLabel("In Time :");
        intime.setBounds(25,174,100,14);
        intime.setFont(new Font("tahoma",Font.BOLD,14));
        intime.setForeground(Color.white);
        panel.add(intime);

        JTextField intm = new JTextField();
        intm.setBounds(248,174,140,20);
        panel.add(intm);

        JLabel amount = new JLabel("Amount Paid (Rs) :");
        amount.setBounds(25,216,150,14);
        amount.setFont(new Font("tahoma",Font.BOLD,14));
        amount.setForeground(Color.white);
        panel.add(amount);

        JTextField amt = new JTextField();
        amt.setBounds(248,216,140,20);
        panel.add(amt);

        JLabel pamount = new JLabel("Panding Amount (Rs) :");
        pamount.setBounds(25,261,180,20);
        pamount.setFont(new Font("tahoma",Font.BOLD,14));
        pamount.setForeground(Color.white);
        panel.add(pamount);
 
        JTextField pamt = new JTextField();
        pamt.setBounds(248,261,140,20);
        panel.add(pamt);

        JButton check = new JButton("Check");
        check.setBounds(281,378,89,23);
        check.setForeground(Color.white);
        check.setBackground(Color.BLACK);
        panel.add(check);
        check.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){

                try {
                    
                    Conn cp = new Conn();
                    String id = c1.getSelectedItem();
                    String q = "select * from patient_info where NAME = '"+id+"'";
                    ResultSet result1 = cp.stm.executeQuery(q);
                    while(result1.next()){
                        roomn.setText(result1.getString("ROOM_NUMBER"));
                        intm.setText(result1.getString("TIME"));
                        amt.setText(result1.getString("DEPOSITE"));

                        
                    }
                    ResultSet result2 = cp.stm.executeQuery("select *from Room where NO = '"+roomn.getText()+"'");
                    while(result2.next()){
                        String price = result2.getString("PRICE");
                        int amountpaid = Integer.parseInt(price) - Integer.parseInt(amt.getText());
                        pamt.setText(""+amountpaid);
                    }

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton update = new JButton("Update");
        update.setBounds(56,378,89,23);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.white);
        panel.add(update);
        update.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){ 
 
             try{
                Conn sk = new Conn();
                String q = c1.getSelectedItem();
                String room = roomn.getText();
                String time = intm.getText();
                String amount1 =  amt.getText();
                sk.stm.executeUpdate("update paitent_info set ROOM_NUMBER = '"+room+"',TIME = '"+time+"',DEPOSITE = '"+amount1+"' where NAME = '"+q+"'");
                JOptionPane.showMessageDialog(null, "Updated Successfully  ");
                dispose();

             }catch(Exception E){
                E.printStackTrace();
             }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(168,378,89,23);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){ 
                dispose();
            }
        });
        
        setUndecorated(true);
        setSize(950,500);
        setLocation(400,250);
        setLayout(null);
        setVisible(true);
    }
}
