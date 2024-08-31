package loops;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class SumOfNumber {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=s.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            count+=i;
        }
        System.out.println("The sum of 1st "+n+" natural number: "+count);
    }

}
