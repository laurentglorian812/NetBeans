/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohprimitive;

/**
 *
 * @author Acer
 */
public class ContohPrimitive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bl=false;
        int i=2000000;
        int i2=0144; //octa
        int i3=0x64; //hexa
        int i4=0b1100100; //binary
        byte b=100;
        long l=5_000000000l;
        long l2=5_000_000_000l; //pemisah ribuan menggunakan garis bawah
        float f=72.5f;
        float f2=7.25e1f;
        double d=3.14d;
        double d2=3.14e0;
        char c=76; //simbol ASCII
        char c2='\u0076'; //simbol unicode
        char c3='\114'; //simbol ASCII octa
        boolean bl2=i3==100;
        System.out.println(bl);
        System.out.printf("%d %d %d %d\n", i, i2, i3, i4);
        System.out.println(b);
        System.out.printf("%d %d\n", l, l2);
        System.out.printf("%f %f\n", f, f2);
        System.out.printf("%f %f\n", d, d2);
        System.out.printf("%c %c %c\n", c, c2, c3);
        System.out.println(bl2);
    }
    
}
