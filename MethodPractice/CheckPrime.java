package methodpractice;

/**
 *
 * @author iraki
 */
import java.util.Scanner;
public class CheckPrime {
    
    static boolean isPrime(int n)
    {
            
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                    return false;
            }
            return true;
    }
    
    public static void main(String[] args) {
        
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        n=s.nextInt();
        
        
        if(n==0|n==1)
            System.out.println(n+" is neither prime nor composite");
        else if(isPrime(n))
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is composite");
    }

}
