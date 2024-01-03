
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class apachePoi {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pword="0099";
        String a="select * from stu";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,uname,pword);

//        if(con != null){
//            System.out.println("Connected .. !");
//        }
//        else{
//            System.out.println("Not connected .. !");
//        }

        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(a);
        while(rs.next()){
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" " + rs.getString(3));
        }
        st.close();
        con.close();
    }
}
