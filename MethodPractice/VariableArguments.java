package methodpractice;

/**
 *
 * @author iraki
 */
//import java.util.Scanner;
public class VariableArguments {
    
    static void show(int...x)
    {
       for(int a:x)
       {
           System.out.print(a+" ");
       }
       System.out.println("");
    }

    
  //  public static void main(String[] args) {
    public static void main(String...args) {        //it takes variable command line argument
        //Scanner s=new Scanner(System.in);
        show();
        show(2,6,2,85);
        int a[]=new int[]{5,8,9,2,6};
        int b[]={5,8,1,4,3,0};
        show(a);
        show(b);
        show(new int[]{8,5,2,7,1});
    }

}
