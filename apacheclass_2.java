import java.sql.*;

public class apacheclass_2 {
    public static void main(String[] args) throws Exception {
        String url= "jdbc:mysql://localhost:3306/a";
        String userName = "root";
        String password = "0099";
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection(url,userName,password);
        if(c!=null){
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("select * from t");
            while(r.next()){
                System.out.println(r.getInt(1)+"  "+r.getString(2));

            }
            c.close();
            r.close();
        }
        else{
            System.out.println("Not connected");
        }



    }
}
