package methodpractice;

/**
 *
 * @author iraki
 */
//import java.util.Scanner;

public class CommandSum {

    
    public static void main(String[] args) {
        
        //Scanner s=new Scanner(System.in);
        double sum=0;
		for(String s:args)
		{
			sum+=Double.parseDouble(s);
		}
		System.out.println(sum);
    }

}
