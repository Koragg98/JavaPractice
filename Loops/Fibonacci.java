package loops;

/**
 *
 * @author iraki
 */
import java.util.Scanner;
public class Fibonacci {

    
    public static void main(String[] args) {
        
        int a=0,b=1,n,term;
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. of terms:");
        n=s.nextInt();         
        
        System.out.print(a+","+b+",");
        for(int i=2;i<n;i++)
        {
            term=a+b;
            System.out.print(term+",");
            a=b;
            b=term;
            
        }

    }

}
