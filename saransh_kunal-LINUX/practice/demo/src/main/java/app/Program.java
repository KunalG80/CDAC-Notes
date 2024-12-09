package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://Dac24.local/sales", "root", "password");
        Statement stmt = con.createStatement();
        if (args.length == 0) {
            ResultSet rs = stmt.executeQuery("select cust_id,pwd,email,credit from customers");
            while (rs.next())
                System.out.printf("%-6d%-12s%-20s%-8dn",
                 rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt("credit"));
            rs.close();
        } else {
            int id = Integer.parseInt(args[0]);
            int n = stmt.executeUpdate("update customers set credit=credit+100 where pno =" + id);
            if(n == 0)
            System.out.println("No such products!");
        }
        stmt.close();
        con.close();
    }
}