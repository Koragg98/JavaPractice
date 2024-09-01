package arrays;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class DeleteElement {

    
    public static void main(String[] args) {
        
        int A[]=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        
        Scanner s= new Scanner(System.in);
        int index,n=6;
        System.out.println("Index of the element to be deleted:");
        index=s.nextInt();
        
        System.out.println("Initial Array:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        for(int i=index;i<n;i++)
        {
            A[i]=A[i+1];
        }
        
        System.out.println("\nUpdated Array:");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
    }

}
