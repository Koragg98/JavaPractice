package databaseprogram;
import java.sql.*;
/**
 * @author iraki
 */
public class DatabaseProgram {

    public static void main(String[] args) throws Exception {
        //To use driver we have to avilable the driver in our java program
        //without creating object we'll make the class available
        //Also have to handle class not found exception
        //This Class.for Name will create an object on fly(anonomous object) wich can be used by jvm or java program
        //This object is used by Driver Manager for establishing connection
        Class.forName("org.sqlite.JDBC");
        
        //Create a connection to data base through driver
        //DriverManager is a class which is used to establish connection from database to java program
        //it utilizes JDBC driver which is already import inside our java prog. using class.forName
        //it provide a connection object
        //Connection is an Interface
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");
        
        //We have to create statement to execute query
        //Statement is an interface
        Statement stm=con.createStatement();
        //We have to store the output into result set
        //ResultSet is also inteface
        ResultSet rs=stm.executeQuery("select * from dept");
        
        int deptno=-1;
        String dname=null;
        while(rs.next())
        {
            deptno=rs.getInt("deptno");
            dname=rs.getString("dname");
            System.out.println(deptno+" "+dname);
        }
        stm.close();
        con.close();
    } 
}
  
