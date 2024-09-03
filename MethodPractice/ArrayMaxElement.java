package methodpractice;

/**
 *
 * @author iraki
 */
//import java.util.Scanner;
public class ArrayMaxElement {
    
    static int max(int X[])
    {
        int max=X[0];
        for(int i=1;i<X.length;i++)
        {
            if(X[i]>max)
                max=X[i];
        }
        return max;
    }

    
    public static void main(String[] args) {
        
        int A[]={8,3,15,-5,9,25,-3,7};
        System.out.println("The maximum element of the array is: "+max(A));
        
    }

}
