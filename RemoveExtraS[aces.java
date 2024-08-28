package removeextraspace;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class RemoveExtraSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
        //str=str.trim();
        System.out.println(str.replaceAll("\\s+"," ").trim());
    }
    
}
