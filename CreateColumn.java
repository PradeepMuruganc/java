import java.sql.*;

public class CreateColumn {

        public static void main(String[] args) throws Exception {
            String url= "jdbc:mysql://localhost:3306/a";
            String userName = "root";
            String password = "0099";
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,userName,password);
            if(c!=null){
                String val;
                val = "alter table t add column married varchar(5)";
                PreparedStatement p = c.prepareStatement(val);
                p.execute();


            }
            else{
                System.out.println("Not connected");
            }



        }
    }
