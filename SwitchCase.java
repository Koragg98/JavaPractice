
package switchcase;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("*****Menu*****\n1.Add\n2.Sub\n3.Mul\n4.Div\nEnter two Numbers:");
        float a=s.nextFloat();
        float b=s.nextFloat();
        System.out.println("Enter option in words:");
        String op=s.next();
        op=op.toLowerCase();
        
        switch(op){
            case "add" -> System.out.println("Sum is:"+(a+b));
            case "sub" -> System.out.println("Sub is:"+(a-b));
            case "mul" -> System.out.println("Mul is:"+(a*b));
            case "div" -> System.out.println("Div is"+(a/b));
            default    -> System.out.println("Invalid Option");

        }
        
        
        /*
        Domain Extension Name
        System.out.println("Enter the domain name:");
        String domain=s.next();
        String ext=domain.substring(domain.lastIndexOf('.')+1);
        
        switch(ext){
            case "com" -> System.out.println("Commercial");
            case "org" -> System.out.println("Organization");
            case "net" -> System.out.println("Network");
            case "gov" -> System.out.println("Government");
            default -> System.out.println("Others");
        }
        */
        
        /*
        MOnth Nuumber
        int monthNum;
        System.out.println("Enter the day number");
        monthNum=s.nextInt();
        
        switch(monthNum){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("INVALID MONTH");
        }
        */
        
        
        /*
        Day Number
        int dayNumber;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the day number");
        dayNumber=s.nextInt();
        
        switch(dayNumber){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Satarday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("INVALID DAY");
        }
        */
    }
    
}
