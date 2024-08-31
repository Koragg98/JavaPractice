package loops;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class CheckPalindrome {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n,rev=0,temp;
        System.out.println("Enter the number:");
        n=s.nextInt();
        int m=n;
        while(n>0)
        {
            temp=n%10;
            rev=(rev*10)+temp;
            n/=10;
        }
        if(m==rev)
            System.out.println("It's a palindrome number");
        else
            System.out.println("It's not a palindrome number");
    }

}
