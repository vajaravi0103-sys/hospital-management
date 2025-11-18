import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reception extends JFrame {

    public Reception() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 160, 1525, 670);
        panel.setBackground(new Color(109, 164, 170));
        panel.setLayout(null);
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBounds(5, 5, 1525, 150);
        panel1.setLayout(null);
        panel1.setBackground(new Color(109, 164, 170));
        add(panel1);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/dr.png"));
        Image img1 = img.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(img1);
        JLabel label = new JLabel(img2);
        label.setBounds(1300, 0, 250, 250);
        panel1.add(label);

        ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("icons/amb.png"));
        Image img4 = img3.getImage().getScaledInstance(300, 100, Image.SCALE_DEFAULT);
        ImageIcon img5 = new ImageIcon(img4);
        JLabel l1 = new JLabel(img5);
        l1.setBounds(1000, 50, 300, 100);
        panel1.add(l1);

        JButton bt1 = new JButton("Add New Patient");
        bt1.setBounds(30, 15, 200, 30);
        bt1.setBackground(new Color(246, 215, 118));
        panel1.add(bt1);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    new NewPatientAdd();

                } catch (Exception E) {
                    E.printStackTrace();
                }

            }

        });

        JButton bt2 = new JButton("Room");
        bt2.setBounds(30, 58, 200, 30);
        bt2.setBackground(new Color(246, 215, 118));
        panel1.add(bt2);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();
            }
        });

        JButton bt3 = new JButton("Department");
        bt3.setBounds(30, 100, 200, 30);
        bt3.setBackground(new Color(246, 215, 118));
        panel1.add(bt3);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();
            }
        });

        JButton bt4 = new JButton("All Employee Info");
        bt4.setBounds(270, 15, 200, 30);
        bt4.setBackground(new Color(246, 215, 118));
        panel1.add(bt4);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_Info();
            }
        });

        JButton bt5 = new JButton("Patient Info");
        bt5.setBounds(270, 58, 200, 30);
        bt5.setBackground(new Color(246, 215, 118));
        panel1.add(bt5);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PatientInfo();
            }
        });

        JButton bt6 = new JButton("Patient Discharge");
        bt6.setBounds(270, 100, 200, 30);
        bt6.setBackground(new Color(246, 215, 118));
        panel1.add(bt6);
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Patient_discharge();
            }
        });

        JButton bt7 = new JButton("Update Patient Details");
        bt7.setBounds(510, 15, 200, 30);
        bt7.setBackground(new Color(246, 215, 118));
        panel1.add(bt7);
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Update_patient();
            }
        });

        JButton bt8 = new JButton("Hospital Ambulance");
        bt8.setBounds(510, 58, 200, 30);
        bt8.setBackground(new Color(246, 215, 118));
        panel1.add(bt8);
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ambulance();
            }
        });

        JButton bt9 = new JButton("Search Room");
        bt9.setBounds(510, 100, 200, 30);
        bt9.setBackground(new Color(246, 215, 118));
        panel1.add(bt9);
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Search_Room();
            }
        });

        JButton bt10 = new JButton("Logout");
        bt10.setBounds(750, 15, 200, 30);
        bt10.setBackground(new Color(255, 100, 100));
        panel1.add(bt10);
        bt10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setSize(1730, 825);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}