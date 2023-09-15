/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latrekursi1;

/**
 *
 * @author Acer
 */
public class LatRekursi1 {

    public static int pangkat(int x,int y){
        if(y>0) return(x*pangkat(x,y-1));
        else return(1);
    }
    public static void main(String[] args) {
        System.out.printf("5 pangkat 3 = %d\n",pangkat(5,3));
    }
}
