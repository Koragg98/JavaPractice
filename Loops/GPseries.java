package loops;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class GPseries {

    
    public static void main(String[] args) {
       
        int a,n,r;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st term:");
        a=s.nextInt();
        System.out.println("Enter the common ratio:");
        r=s.nextInt();
        System.out.println("Enter the no. of terms:");
        n=s.nextInt();
        
        
        System.out.println("The airthmetic progression series is:");
        int term=a;
          for(int i=0;i<n;i++)
          {
              System.out.print(term+",");
              term*=r;
          }
          
    }

}
