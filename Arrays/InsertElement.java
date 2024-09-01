package arrays;

/**
 *
 * @author iraki
 */
import java.util.Scanner;
public class InsertElement {

    
    public static void main(String[] args) {
        
        int A[]=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        
        Scanner s= new Scanner(System.in);
        int key,index,n=6;
        System.out.println("Element to be inserted:");
        key=s.nextInt();
        System.out.println("Index of the element:");
        index=s.nextInt();
        
        System.out.println("Initial Array:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        for(int i=n-1;i>=index;i--)
        {
            A[i+1]=A[i];
        }
        A[index]=key;
        
        System.out.println("\nUpdated Array:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        
    }

}
