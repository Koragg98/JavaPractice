package conditionalstatement;
import java.util.Scanner;
/**
 *
 * @author iraki
 */
public class ConditionalStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String url=s.next();
        
        String protocol,ext;
        protocol=url.substring(0, url.indexOf(':'));
        ext=url.substring(url.lastIndexOf('.')+1);
        
        if(protocol.equals("http"))
            System.out.println("Hyper Text Transfer Protocol");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        
        if(ext.equals("com"))
            System.out.println("Commercial");
        else if(ext.equals("gov"))
            System.out.println("Government");
        else if(ext.equals("org"))
            System.out.println("Organization");
        else if(ext.equals("net"))
            System.out.println("Network");
        
        /*
        Leap Year
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    System.out.println("It's a leap year.");
                else
                    System.out.println("It's not a leap year.");
            }
            else
                System.out.println("It's a leap year.");
        }
        else
            System.out.println("It's not a leap year.");
        */
        /*
        Number Checking
        String number;
        Scanner s=new Scanner(System.in);
        number=s.next();
        if(number.matches("[01]+"))
            System.out.println("Radix 2");
        else if(number.matches("[0-7]+"))
            System.out.println("Radix 8");
        else if(number.matches("[0-9]+"))
            System.out.println("Radix 10");
        else if(number.matches("[0-9A-Fa-f]+"))
            System.out.println("Radix 16");
        else
            System.out.println("INVALID NUMBER");
        */
        
        /*
        Grade system
        int m1,m2,m3;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks of the subjects:");
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        int avg=(m1+m2+m3)/3;
        if(avg>=70)
            System.out.println("A");
        else if(avg>=60 && avg<70)
            System.out.println("B");
        else if(avg>=50 && avg<60)
            System.out.println("C");
        else if(avg>=40 && avg<50)
            System.out.println("D");
        else
            System.out.println("F");
        */
        
        /*
        Young or not
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age:");
        float n=s.nextFloat();
        if(n>=14 && n<=55)
            System.out.println("You are young");
        else
            System.out.println("You are not young");
        */
        /*
        Even or Odd
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        */

    }
    
}
