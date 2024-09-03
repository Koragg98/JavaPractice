package arrays;

/**
 *
 * @author iraki
 */
public class StringArraySort {

    
    public static void main(String[] args) {
        
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};
//        String temp;
        
//        for(int i=0;i<arr.length-1;i++)
//        {
//            for(int j=0;j<arr.length-1-i;j++)
//            {
//                if(arr[j].toLowerCase().compareTo(arr[j+1].toLowerCase())>0)
//                {
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }

        java.util.Arrays.sort(arr);     //Can't sort when capital and small both present
        for(String x:arr)
        {
            System.out.print(x+" ");
        }
    }

}
