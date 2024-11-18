package oops;

/**
 *
 * @author iraki
 */
//import java.util.Scanner;
class Cylinder
{
    private double radius;
    private double height;
    
    public Cylinder()
    {
        radius=1;
        height=1;
    }
    public Cylinder(double r)
    {
        setRadius(r);
        height=1;
    }
    public Cylinder(double r,double h)
    {
        setRadius(r);
        setHeight(h);
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
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
public class CylinderConstructor {

    
    public static void main(String[] args) {
        
        //Scanner s=new Scanner(System.in);
        Cylinder c1=new Cylinder();
        
        
        System.out.println("lid Area is: "+c1.lidArea());
    }

}
