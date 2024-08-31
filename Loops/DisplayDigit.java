package loops;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class DisplayDigit {
    
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=s.nextInt();
        for(;n>0;n/=10)
        {
            System.out.println(n%10);
            
        }
    }

}
