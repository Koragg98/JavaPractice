package loops;
import java.util.Scanner;
/**
 *
 * @author iraki
 */
public class CountDigit {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=s.nextInt();
        int count=0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        System.out.println("Total "+count+" digits");
      
    }

}
