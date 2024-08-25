package regularexp;


public class RegularExp {

    public static void main(String[] args) {
        /*
        1. (".")    -any single character
        2. ("[abc]") -single a or b or c (a+b+c)
        3. ("[^abc]") -single character except a or b or c
        4. ("[abc][vz]") -two character (a+b+c)(v+z)
        5. ("[a-z0-9]") -single charcter(a+b+c+...+z+0+1+...+9)
        6. ("A|B")      -single character (A+B)
        7. ("XZ")       -exact equal XZ
        8. ("\\d")  -digit
        9. ("\\D")  -not digit
        10. ("\\s") -space
        11. ("\\S") -not space
        12. ("\\w") -alphbet or digit
        13. ("\\W") -not alphabet or digit
        Quantifires: It always be used with some RE, not alone.
        14. ("*")   -0 or more times
        15. ("+")   -1 or more times
        16. ("?")   -0 or 1 times
        17. ("{x}") -x times
        18. ("{x,y}") -between x and y times
        */
        String str1="irakib3698@gmail.com";
        System.out.println(str1.matches("\\w*@gmail.*"));
    }
    
}
