
package stringpractice;

public class StringPractice {

    public static void main(String[] args) {
        String str="Java Program";
        String str2=new String("Java");
        char c[]={'H','e','l','l','o'};
        //String str3=new String(c);
        String str3=new String(c,1,3);
        byte b[]={21,65,66,98};
        String str4=new String(b);
        
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
    
}
