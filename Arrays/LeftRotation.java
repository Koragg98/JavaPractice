package arrays;

/**
 *
 * @author iraki
 */
public class LeftRotation {

    
    public static void main(String[] args) {
        
        int A[]={5,9,6,10,12,7,3,5,4,2};
        
        System.out.println("Initial Array:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        
        int temp=A[0];
        for(int i=0;i<A.length-1;i++)
        {
            A[i]=A[i+1];
        }
        A[A.length-1]=temp;
        
        
        System.out.println("\nLeft Rotation:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
    }

}
