package methodpractice;

/**
 *
 * @author iraki
 */
//import java.util.Scanner;
public class calculateDiscount {

    static double discount(double...p)
    {
        if(p.length==0)
            return Integer.MIN_VALUE;
        int sum=0;
        for(double x:p)
        {
            sum+=x;
        }
        if(sum<500)
            return ((sum*10)/100);
        else if(sum>=500&&sum<1000)
            return ((sum*15)/100);
        else
            return ((sum*25)/100);
        
    }
    
    public static void main(String[] args) {
        
        //Scanner s=new Scanner(System.in);
        System.out.println("Discount: "+discount(500));
    }

}
