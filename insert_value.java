import java.sql.*;

public class insert_value {

        public static void main(String[] args) throws Exception {
            String url= "jdbc:mysql://localhost:3306/a";
            String userName = "root";
            String password = "0099";
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,userName,password);
            if(c!=null){
                String val;
                val = "insert into t value(3,'Ram','1997-05-24')";
                PreparedStatement p = c.prepareStatement(val);
                p.execute();


            }
            else{
                System.out.println("Not connected");
            }



        }
    }