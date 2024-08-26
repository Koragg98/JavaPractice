package hexornot;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class HexOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the nuber");
        String str=s.next();
        if(str.matches("[0-9A-F]+"))
            System.out.println("Input is hexadecimal number.");
        else
            System.out.println("Input is not hexadecimal number.");
    }
    
}
