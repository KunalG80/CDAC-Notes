package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://Dac24.local/sales", "root", "password");
        Statement stmt = con.createStatement();
        if (args.length == 0) {
            // Query to fetch customer data
            ResultSet rs = stmt.executeQuery("SELECT cust_id, pwd, email, credit FROM customers");
            while (rs.next()) {
                // Print the data with appropriate formatting
                System.out.printf("%-8s%-12s%-20s%-8d%n", 
                                  rs.getString(1),        // cust_id
                                  rs.getString(2),        // pwd
                                  rs.getString(3),        // email
                                  rs.getInt(4));          // credit
            }
            rs.close();
        }
        // if (args.length == 0) {
        //     ResultSet rs = stmt.executeQuery("select cust_id,pwd,email,credit from customers");
        //     while (rs.next()){
        //         System.out.printf("-8s%-12s%-20s%-8d%n",  rs.getString(1),  rs.getString(2),  rs.getString(3),  rs.getInt(4)); 
        //     }
        //     rs.close();
        // } else {
            // String id = (args[0]);
            // // int n = stmt.executeUpdate("update customers set credit=credit+100 where cust_id =" + id +"");
            // int n = stmt.executeUpdate(UPDATE customers SET credit = credit + 100 WHERE cust_id = 'CU301');

            // if(n == 0)
            // System.out.println("No such products!");

            String id = args[0];  // Assuming cust_id is a string
           PreparedStatement pstmt = con.prepareStatement("UPDATE customers SET credit = credit + 100 WHERE cust_id = ?");  
           pstmt.setString(1, id);  // Set the value for cust_id as a string
            int n = pstmt.executeUpdate();
          if (n == 0) {
           System.out.println("No such customer!");
        }
            stmt.close();
        con.close();
    }
        }
        
