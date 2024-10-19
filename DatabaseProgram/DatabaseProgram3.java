package databaseprogram;
import java.util.*;
import java.sql.*;

/**
 * @author iraki
 */
public class DatabaseProgram3 {

    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");
        
        //Statement stm=con.createStatement();
        //for DML query(insert,delete,update) we have to use updateQuery
        //stm.executeUpdate("insert into dept values(70,'AERO')");
        //stm.executeUpdate("delete from dept where deptno=70");
        //stm.executeUpdate("update dept set dname='ELEC' where deptno=60");
        PreparedStatement stm=con.prepareStatement("insert into students values(?,?,?,?)");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll: ");
        int roll=sc.nextInt();
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter city:");
        String city=sc.next();
        System.out.println("Enter deptno:");
        int deptno=sc.nextInt();
        
        stm.setInt(1, roll);
        stm.setString(2,name);
        stm.setString(3, city);
        stm.setInt(4,deptno);
        
        stm.executeUpdate();
        
        stm.close();
        con.close();
    }

}
