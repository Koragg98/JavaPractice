package dateformat;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class DateFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the date[dd/mm/yyyy]:");
        String str=s.next();
        if(str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"))
            System.out.println("Date is in proper format");
        else
            System.out.println("Date is not in proper format");
    }
    
}
