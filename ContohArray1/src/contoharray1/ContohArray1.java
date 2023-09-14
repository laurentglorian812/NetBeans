/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ContohArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        String nama[]=new String[5];
        for(int i=0;i<5;i++){
            System.out.printf("Nama : ");nama[i]=scn.next();
        }
        System.out.printf("Daftar Nama : ");
        for(int i=0;i<5;i++){
            System.out.printf("%s\n", nama[i]);
        }
    }
    
}
