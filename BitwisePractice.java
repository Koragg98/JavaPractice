/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwisepractice;

/**
 *
 * @author iraki
 */
public class BitwisePractice {

  
    public static void main(String[] args) {
        int x=-0b1010,y=0b110,z;
        //z= x&y;   and
        //z=x|y;    or
        //z=x^y;  xor
        //z=~x;  not
        z=x>>1;
        z=x<<2;
        z=x>>>1;
        //System.out.println(Integer.toBinaryString(z));
        System.out.println(String.format("%s", Integer.toBinaryString(x)));
        System.out.println(String.format("%32s", Integer.toBinaryString(z)));
        System.out.println(z);

    }
    
}
