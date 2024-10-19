package databaseprogram;
import java.sql.*;
import java.util.Scanner;
/**
 * @author iraki
 */
public class DatabaseProgram2 {

    public static void main(String[] args) throws Exception {
        //3 type of statement: Statement,PreparedStatement and CallableStatement(used for invoking stored procedures)
        Class.forName("org.sqlite.JDBC");
        
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");
        PreparedStatement stm=con.prepareStatement("Select * from students where deptno=?");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Department No: ");
        int deptNo=sc.nextInt();
        stm.setInt(1, deptNo);
        ResultSet rs=stm.executeQuery();
        
        
        while(rs.next())
        {
            //rs moves row by row and in a row we can access column by index staring from 1
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
        }
        stm.close();
        con.close();
    }

}
