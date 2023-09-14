/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohrekursi;

/**
 *
 * @author Acer
 */
public class ContohRekursi {

    public static int faktorial(int i){
        System.out.printf("%d ",i);
        if(i>1) return(i*faktorial(i-1));
        else return(1);
    }
    public static void main(String[] args) {
        System.out.printf("=%d\n",faktorial(5));
    }
}
