package stringmethod;


public class StringMethod {

    
    public static void main(String[] args) {
       String str="Cosmos";
       System.out.println(str.length());
       System.out.println(str.toLowerCase());
       System.out.println(str.toUpperCase());
       System.out.println(str.substring(2));
       System.out.println(str.substring(1,5));
       System.out.println(str.replace('s','t'));
       System.out.println(str); //String immmutable,doesn't change the original one
       String str2="   Space  ";
       System.out.println(str2.trim());
       String str3="Java Program";
       System.out.println(str3.startsWith("Java"));
       System.out.println(str3.startsWith("Java",4));
       System.out.println(str3.startsWith("am",10));
       System.out.println(str3.endsWith("ram"));
       System.out.println(str.charAt(3));
       System.out.println(str.indexOf('m'));
       System.out.println(str.indexOf("os"));
       System.out.println(str.indexOf("os",2));
       System.out.println(str.lastIndexOf("os"));
       
       for(int i=0;i<str.length();i++)
           System.out.print(str.charAt(i));
       
       String str4="java";
       String str5="java";
       String str6=new String("java");
       
       System.out.println("\n"+(str4==str5));
       System.out.println((str4==str6));
       System.out.println(str4.equals(str5));
       System.out.println(str4.equals(str6));
       System.out.println(str4.compareTo(str5));
       System.out.println(str4.compareTo(str3));
       System.out.println(str3.compareTo(str4));
       
       String str7="China Wall";
       String str8="China Tall";
       System.out.println(str7.compareTo(str8));
       str7="China Wall";
       str8="China wall";
       System.out.println(str7.compareTo(str8));
       System.out.println(str7.compareToIgnoreCase(str8));
       
       String str9="The great wall of";
       String str10=" china";
       System.out.println(str9.contains("of"));
       System.out.println(str10.concat(str9));
       System.out.println(str9+str10);
       
       String str11;
       str11=String.valueOf(954);
       System.out.println(str11);
       str11=String.valueOf('%');
       System.out.println(str11);
       char c[]={'A','b','x'};
       str11=String.valueOf(c);
       System.out.println(str11);
    }
    
}
