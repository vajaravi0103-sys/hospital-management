
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {  

    JButton b1,b2;
    JTextField username;
    JPasswordField pass;
     public Login() {


        JLabel name = new JLabel("UserName :");
        name.setBounds(100,110,200,30);
        name.setForeground(Color.black);
        name.setFont(new Font("tahoma",Font.BOLD,30));  
        add(name);
        username = new JTextField();
        username.setBounds(300,110,200,30);
        add(username);

        JLabel ps = new JLabel("Password :");
        ps.setBounds(100,200,200,30);
        ps.setForeground(Color.black);
        ps.setFont(new Font("tahoma",Font.BOLD,30));  
        add(ps);
        pass = new JPasswordField();
        pass.setBounds(300,200,200,30);
        add(pass);

        b1 = new JButton("Login");
        b1.setBounds(120,300,80,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(250,300,80,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);


        setSize(800,600);
        setLocation(500,100);
        setLayout(null);
        setVisible(true);

    }
     @Override
    public void actionPerformed(ActionEvent e) {
         
        if(e.getSource()== b1){

        
         try{
            Conn c = new Conn();
            String user = username.getText();
            String p = new String(pass.getPassword());
            String Q = "SELECT * FROM login WHERE name ='"+user+"' AND password = '"+p+"'";
            ResultSet result = c.stm.executeQuery(Q);
            if(result.next()){
                new Reception();
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "UserName or Password is Wrong");
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    

    }else{
       setVisible(false);
    }
}
    
    public static void main(String[] args) {
        new Login();
    }

   
}
