/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latrekursi2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class LatRekursi2 {

    public static int fibonaci(int i){
        if(i>2) return(fibonaci(i-1)+fibonaci(i-2));
        else return(1);
    }
    public static void main(String[] args) {
        System.out.printf("fibonaci : ");
        for(int i=1;i<=8;i++)
          System.out.printf(" %5d",fibonaci(i));
        System.out.println("");
        System.out.printf("Urutan   : ");
        for(int i=1;i<=8;i++)
          System.out.printf(" %5d",i);
        System.out.println("");
    }
}
