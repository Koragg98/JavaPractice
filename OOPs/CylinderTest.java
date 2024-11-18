package oops;

/**
 *
 * @author iraki
 */
//import java.util.Scanner;
class Cylinder
{
    public double radius;
    public double height;
    
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea()
    {
        return circumference()*height+2*lidArea();
    }
    public double volume()
    {
        return lidArea()*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}
public class CylinderTest {

    
    public static void main(String[] args) {
        
        //Scanner s=new Scanner(System.in);
        
        Cylinder c1=new Cylinder();
        c1.radius=5;
        c1.height=20;
        
        System.out.println("lid Area is: "+c1.lidArea());
        System.out.println("Perimeter is: "+c1.circumference());
        System.out.println("Volume is: "+c1.volume());
        System.out.println("Total Surface Area is: "+c1.totalSurfaceArea());
    }

}
