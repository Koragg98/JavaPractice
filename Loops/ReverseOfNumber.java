package loops;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class ReverseOfNumber {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        int n,rev=0,temp=0;
        System.out.println("Enter the number:");
        n=s.nextInt();
        while(n>0)
        {
            temp=n%10;
            rev=(rev*10)+temp;
            n/=10;
        }
        System.out.println("Reverse of the number is: "+rev);
    }

}
