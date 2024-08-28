package wordcount;

import java.util.Scanner;

/**
 *
 * @author iraki
 */
public class WordCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
        str=str.replaceAll("\\s+"," ").trim();
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }
    
}
