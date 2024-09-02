package arrays;

/**
 *
 * @author iraki
 */
import java.util.Scanner;
public class SearchElement {

    
    public static void main(String[] args) {
        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int key;
        System.out.println("Enter the element to be searched:");
        Scanner s=new Scanner(System.in);
        key=s.nextInt();
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==key)
            {   System.out.println("Element is found at index: "+i);
                //break;
                System.exit(0);
            }
        }
        System.out.println("Element is not found");
    }

}
