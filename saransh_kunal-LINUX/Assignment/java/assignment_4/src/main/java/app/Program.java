package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {
    
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//iitdac.met.edu/xe", "dac4", "dac4");
        Statement stmt = con.createStatement();
        if(args.length == 0){
            ResultSet rs = stmt.executeQuery("select EMPNO, ENAME, JOB from EMP");
            while(rs.next())
                System.out.printf("%-6d%s%s%n", rs.getInt(1), rs.getString(2), rs.getString(3));
            rs.close();
        }else{
            int id = Integer.parseInt(args[0]);
            ResultSet n = stmt.executeQuery("select EMPNO, ENAME, JOB from EMP where deptno" + id);
            while(n.next())
                System.out.printf("%-6d%s%s%n", n.getInt(1), n.getString(2), n.getString(3));
            n.close();
        }
        stmt.close();
        con.close();
    }

}

