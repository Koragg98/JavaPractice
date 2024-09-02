package arrays;

/**
 *
 * @author iraki
 */
public class MaxElement {

    
    public static void main(String[] args) {
        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max=0;
        for(int x:A){
            if(x>max)
            {
                max=x;
            }
        }
        System.out.println("Maximum element is: "+max);
    }

}
