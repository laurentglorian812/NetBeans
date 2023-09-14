/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukaopat;

import java.util.Scanner;

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
        System.out.print("Apakah Anda akan lanjut (Y/T)?");
        Scanner s = new Scanner(System.in);
        
        String x = s.next();
        
        while (x.equalsIgnoreCase("Y")){
            System.out.print("Apakah Anda akan lanjut (Y/T)?");
            Scanner t = new Scanner(System.in);
            
            x = t.next();
        }
    }
    
}
