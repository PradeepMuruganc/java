package org.example;

import java.sql.*;
import java.util.Scanner;
import org.example.*;

public class WriteTask1 {
    public static void main(String[] args)throws Exception {
        Scanner s = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");
        String Url = "jdbc:mysql://localhost:3306/pradeep";
        String UserName = "root";
        String Password = "0099";
        Connection con = DriverManager.getConnection(Url, UserName, Password);
        int qn_continue = 1;
        while (qn_continue == 1) {
        System.out.println("Enter your choice: \n1- Create a new user  \n2 - Remove a user \n3 - Update existing user \n4 - Details of user");
        int choice = s.nextInt();

if(choice<=4) {
    if (choice == 1) {
        System.out.println("Enter the id:");
        int id = s.nextInt();
        System.out.println("Enter the name:");
        String name = s.next();
        System.out.println("Enter the date in yyyy-mm-dd format: ");
        String date = s.next();
        PreparedStatement p = con.prepareStatement("insert into user_table values('" + id + "','" + name + "',+'" + date + "')");
        p.execute();
    } else if (choice == 2) {
        System.out.println("Enter the column name");
        String name = s.next();
        System.out.println("Enter the value");
        String value = s.next();
        PreparedStatement p = con.prepareStatement("delete from user_table where " + name + "='" + value + "'");
        p.execute();
    } else if (choice == 3) {
        System.out.println("Enter the set value");
        String set_value = s.next();
        System.out.println("Enter the condition");
        String value = s.next();
        PreparedStatement p = con.prepareStatement("update user_table set name='" + set_value + "' where name='" + value + "'");
        p.execute();
    } else if (choice == 4) {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from user_table");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDate(3));
        }
    }
}
else{
    System.out.println("Choice not found");
}
            System.out.println("Do you want to continue? If yes press 1 else 0");
            qn_continue = s.nextInt();
        }
    }

    }

