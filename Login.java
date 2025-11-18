import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
        JButton login, signup;
        JTextField userTextField;
        JPasswordField passwordTextField; 

           public Login()
            {
                setTitle("HOSPITAL MANAGEMENT SYSTEM");
                setLayout(null);

                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/22.jpg"));
                Image i2 = i1.getImage().getScaledInstance(850, 500, Image.SCALE_SMOOTH);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel label = new JLabel(i3);
                label.setBounds(300,-20,425,300);
                add(label);

                JLabel name = new JLabel("Login");
                name.setFont(new Font("tahoma", Font.BOLD, 30));
                name.setBounds(460, 10, 300, 35);
                add(name);

                JLabel username = new JLabel("USERNAME :");
                username.setFont(new Font("tahoma", Font.BOLD, 16));
                username.setBounds(40, 30, 150, 30);
                username.setForeground(Color.black);
                add(username);

                userTextField = new JTextField();
                userTextField.setBounds(150, 30, 150, 30);
                userTextField.setFont(new Font("Arial", Font.PLAIN, 15));
                userTextField.setBackground(new Color(255,179,0));
                add(userTextField);

                JLabel password = new JLabel("PASSWORD :");
                password.setFont(new Font("tahoma", Font.BOLD, 16));
                password.setBounds(40, 80, 150, 30);
                password.setForeground(Color.black);
                add(password);

                passwordTextField = new JPasswordField();
                passwordTextField.setBounds(150, 80, 150, 30);
                passwordTextField.setFont(new Font("Arial", Font.PLAIN, 16));
                passwordTextField.setBackground(new Color(255,179,0));
                add(passwordTextField);

                login = new JButton("LOGIN");
                login.setBounds(40, 140, 120, 30);
                login.setFont(new Font("serif",Font.BOLD,15));
                login.setBackground(Color.BLACK);
                login.setForeground(Color.WHITE);
                login.addActionListener(this);
                add(login);

                signup = new JButton("CANCEL");
                signup.setBounds(180, 140, 120, 30);
                signup.setFont(new Font("serif",Font.BOLD,15));
                signup.setBackground(Color.BLACK);
                signup.setForeground(Color.WHITE);
                signup.addActionListener(this);
                add(signup);

                getContentPane().setBackground(new Color(245, 247, 248));
                setSize(750,300);
                setVisible(true);
                setLocation(370,220);
            }
            @Override
            public void actionPerformed(ActionEvent e){
            if(e.getSource() == login){
            try{
            Conn c = new Conn();
            String user = userTextField.getText();
            String p = new String(passwordTextField.getPassword());
            String Q = "SELECT * FROM Login1 WHERE ID ='"+user+"' AND PASSWORD = '"+p+"'";
            ResultSet result = c.stm.executeQuery(Q);
            if(result.next())
            {
                new Reception();
                dispose();
            }else
            {
                JOptionPane.showMessageDialog(null, "UserName or Password is Wrong");
            }

        }catch(Exception E)
        {
            E.printStackTrace();
        }
    }else
    {
       dispose();
    }
}
    public static void main(String args[])
    {
        new Login();
    }
}