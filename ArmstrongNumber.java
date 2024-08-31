package loops;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class ArmstrongNumber {

    
    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=s.nextInt();
        int m=n;
        int sumOfCube=0;
        while(n>0)
        {
           sumOfCube+=((n%10)*(n%10)*(n%10));
           n/=10;
        }
        if(m==sumOfCube)
            System.out.println("It's aarmstrong number");
        else
            System.out.println("It's not a aarmstrong number");
    }

}
