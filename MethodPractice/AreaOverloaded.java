package methodpractice;

/**
 *
 * @author iraki
 */
import java.util.Scanner;
public class AreaOverloaded {
    
    static double area(double l,double b)
    {
        return l*b;
    }
    
    static double area(double r)
    {
        return (Math.PI*r*r);
    }
    
    static double area(double l,double b, double h)
    {
        return 0.5*(l+b)*h;
    }
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Area of rectangle with 10.5 and 5"+area(10.5d,5d));
        System.out.println("Area of circle with 10"+area(10d));
        System.out.println("Area of trapezium with 10, 5 and 7"+area(10,5,7));
        
    }

}
