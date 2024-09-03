package arrays;

/**
 *
 * @author iraki
 */
public class SecondLargest {

    
    public static void main(String[] args) {
        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max=0,max2=0;
        for(int x:A){
            if(x>max)
            {
                max2=max;
                max=x;
            }
            else if(x>max2)
                max2=x;
        }
        System.out.println("Second largest element is: "+max2);
    }

}
