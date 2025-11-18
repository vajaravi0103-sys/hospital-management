import java.sql.*;
public class Conn {
    Statement stm;
    Connection con;

    public Conn() {

        try{

            // Load MySQL JDBC driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to the MySQL database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management","root","ravi123");
            System.out.println("Datebase is Connected Successfully");
            stm = con.createStatement();
        }catch(Exception e){
            System.out.println("Datebese is not connected !");
            e.printStackTrace();
        }



    }

       public Connection getConnection() {
        return con;
    }

    public Statement getStatement() {
        return stm;
    }
    
}
