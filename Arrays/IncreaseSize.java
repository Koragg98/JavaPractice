package arrays;

/**
 *
 * @author iraki
 */
public class IncreaseSize {

    
    public static void main(String[] args) {
        
        int A[]={8,6,10,9,2};
        int B[]=new int[2*A.length];
        
        System.out.println("Old Array:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        
        A=B;
        B=null;
        System.out.println("\nNew Array:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
         System.out.print(A);
    }

}
