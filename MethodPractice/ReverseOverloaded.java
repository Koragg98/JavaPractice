package methodpractice;

/**
 *
 * @author iraki
 */
//import java.util.Scanner;
public class ReverseOverloaded {
    
       static int reverse(int n)
       {
            int temp,rev=0;
            while(n>0)
            {
                temp=n%10;
                rev=(rev*10)+temp;
                n/=10;
            }
            return rev;
       }
       
       static void reverse(int n[])
       {
           int a[]=new int[n.length];
           for(int i=0,j=n.length-1;i<n.length;i++,j--)
           {
               a[i]=n[j];
           }
           n=a;
           a=null;
           for(int x:n)
           {
               System.out.print(x+" ");
           }
       }
    
    public static void main(String[] args) {
        
        //Scanner s=new Scanner(System.in);
        System.out.println(reverse(56982));
        
        int arr[]={5,8,1,7,0,9};
        //Error:  reverse({5,8,1,7,0,9});
        reverse(arr);
        
    }

}
