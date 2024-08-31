package loops;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class MultiplicationTable {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=s.nextInt();
        System.out.println("Multiplication Table");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+" = "+(n*i));
        }
        
    }

}
