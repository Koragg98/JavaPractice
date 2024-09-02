package arrays;

/**
 *
 * @author iraki
 */
public class RightRotation {

    
    public static void main(String[] args) {
        
        int A[]={5,9,6,10,12,7,3,5,4,2};
        
        System.out.println("Initial Array:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        
        int temp=A[A.length-1  ];
        for(int i=A.length-2;i>=0;i--)
        {
            A[i+1]=A[i];
        }
        A[0]=temp;
        
        
        System.out.println("\nRight Rotation:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
    }

}
