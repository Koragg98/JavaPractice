package methodpractice;

/**
 *
 * @author iraki
 */
import java.util.Scanner;
public class gcd {

    int gcd(int x,int y)
    {
        while(x!=y)
        {
            if(x>y)
                x=x-y;
            else
                y=y-x;
        }
        return x;
    }
    
    public static void main(String[] args) {
        
        int a,b;
        System.out.println("Enter the two numbers:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        gcd num=new gcd();
        System.out.println("The gcd of "+a+" and "+b+" is: "+num.gcd(a,b));
    }

}
