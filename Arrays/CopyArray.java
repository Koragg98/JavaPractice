package arrays;

/**
 *
 * @author iraki
 */
public class CopyArray {

    
    public static void main(String[] args) {
        
        int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];
        
        for(int i=0,j=A.length-1;i<A.length;i++,j--)
        {
            B[i]=A[j];
        }
        for(int x:B)
        {
            System.out.print(x+" ");
        }
    }

}
