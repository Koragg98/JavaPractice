package loops;

/**
 *
 * @author iraki
 */
import java.util.Scanner;
public class APseries {

    
    public static void main(String[] args) {
        
        int a,n,d;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st term:");
        a=s.nextInt();
        System.out.println("Enter the common difference:");
        d=s.nextInt();
        System.out.println("Enter the no. of terms:");
        n=s.nextInt();
        //Printiong Result
        System.out.println("The airthmetic progression series is:");
//        System.out.print(a+",");
//        for(int i=1;i<n-1;i++)
//        {
//            System.out.print(a+i*d+",");
//        }
//        System.out.println(a+(n-1)*d);
          
          int term=a;
          for(int i=0;i<n-1;i++)
          {
              System.out.print(term+",");
              term+=d;
          }
          System.out.println(a+(n-1)*d);    
        
    }

}
