/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukatilu;

/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<2; i++){
            for(int j=1; j<=i; j++)
                System.out.print(j);
            System.out.println();
        }
        /*for(int i=5; i>0; i--){
            for(int j=1; j<=i; j++) //ngatur angka depannya mulai drmn.
                System.out.print(j);
            System.out.println();
        }*/
    }
}
