package loops;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class NumberInWords {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=s.nextInt();
        String str=String.valueOf(n);
        
        for(int i=0;i<str.length();i++)
        {
            switch(str.charAt(i))
            {
                case '0' -> System.out.print("zero ");
                case '1' -> System.out.print("one ");
                case '2' -> System.out.print("two ");
                case '3' -> System.out.print("three ");
                case '4' -> System.out.print("four ");
                case '5' -> System.out.print("five ");
                case '6' -> System.out.print("six ");
                case '7' -> System.out.print("seven ");
                case '8' -> System.out.print("eight ");
                case '9' -> System.out.print("nine ");
                default -> System.out.print("Not a digit ");
                
            }
        }
    }

}
