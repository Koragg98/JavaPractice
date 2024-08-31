package loops;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class Factorial {

    
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=s.nextInt();
        if(n==0)
            System.out.println(n+"!= "+"1");
        else
        {
            long fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println(n+"!= "+fact);
        }
    }

}
