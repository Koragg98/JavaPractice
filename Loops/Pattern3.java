package loops;

/**
 *
 * @author iraki
 */
public class Pattern3 {

    
    public static void main(String[] args) {
        
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i+j>5)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");   
            }
            for(int k=2;k<=i;k++)
                {
                    System.out.print("*"+" ");
                }
            System.out.println("");
        }
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j>i)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            for(int k=i+1;k<=4;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        
//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 
//        
        
        
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<5;j++)
//            {
//                
//                 if(i+j>=5-1)
//                    System.out.printf("%c ",'*');
//                else
//                    System.out.print("  ");
//                
////                if(j>=(5-1)-i)
////                    System.out.printf("%c ",'*');
////                if(j<(5-1)-i)
////                    System.out.print("  ");
//            }
//            System.out.println("");
//        }
//                  * 
//                * * 
//              * * * 
//            * * * * 
//          * * * * * 
//        
        
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<5;j++)
//            {
//                if(j>=i)
//                    System.out.printf("%c ",'*');
//                if(j<i)
//                    System.out.print("  ");
//            }
//            System.out.println("");
//        }
//        
//        Output:
//        * * * * * 
//          * * * * 
//            * * * 
//              * * 
//                * 
    }

}
