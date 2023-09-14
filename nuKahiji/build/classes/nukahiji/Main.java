/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukahiji;

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
        System.out.println("Pilih MENU");
        System.out.println("------------------------------");
        System.out.println("1. Celcius to Farenheit");
        System.out.println("2. Farenheit to Celcius");
        System.out.println("3. Celcius to Reamur");
        System.out.println("4. Farenheit to Reamur");
        System.out.println("------------------------------");
        System.out.print("Pilihan Anda");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double h = 0;
        if (a==1) {
            System.out.print("Derajat Celcius : ");
            Scanner t = new Scanner(System.in);
            int c = t.nextInt();
            h = c * 9/5 + 32;
            System.out.println("Derajat Farenheit : " + h);
        }
        else if (a==2){
            System.out.print("Derajat Farenheit : ");
            Scanner u = new Scanner(System.in);
            int f = u.nextInt();
            h = (f - 32) * 5/9;
            System.out.println("Derajat Celcius : " + h);
        }
        else if (a==3){
            System.out.print("Derajat Celcius : ");
            Scanner v = new Scanner(System.in);
            int i = v.nextInt();
            h = i * 4/5;
            System.out.println("Derajat Reamur : " + h);
        }
        else {
            System.out.print("Derajat Farenheit : ");
            Scanner w = new Scanner(System.in);
            int r = w.nextInt();
            h = 4/9 * (r - 32);
            System.out.println("Derajat Reamur : " + h);
        }
    }
    
}
