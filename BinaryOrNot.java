package binaryornot;
import java.util.*;

/**
 *
 * @author iraki
 */
public class BinaryOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the nuber");
        int b=s.nextInt();
        //String str=String.valueOf(b);
        String str=b+"";
        if(str.matches("[01]+"))
            System.out.println("Input is binary number.");
        else
            System.out.println("Input is not binary number.");

    }
    
}
