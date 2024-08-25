package stringmethodchallenge;
import java.util.*;

public class StringMethodChallenge {

    
    public static void main(String[] args) {
        String str,domain;
        int index;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your email:");
        str=s.next();
        index=str.indexOf('@');
        System.out.println("Username: "+str.substring(0,index)+"\nDomain: "+str.substring(index+1));
        domain=str.substring(index+1);
        int index2=domain.indexOf('.');
        System.out.println("Domain Provider: "+domain.substring(0,index2));
        
    }
    
}
