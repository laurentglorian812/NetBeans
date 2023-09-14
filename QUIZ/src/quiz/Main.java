/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList al = new ArrayList();
        al.add(new Loket ("A", "Customer Service"));
        al.add(new Loket ("B", "Transaksi"));
        al.add(new Loket ("C", "Transaksi"));
        DisplayMenu();
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        while (x!=3){
            switch (x){
                case 1:{
                    System.out.println("CUSTOMER SERVICE"); break;
                }
                case 2:{
                    System.out.println("TRANSAKSI"); break;
                }
                case 3:{
                    System.out.println("BACK-UP DATA"); break;
                }
                default: 
                    System.out.println("------------------------");
                    System.out.println("ANDA SALAH MEMASUKKAN MENU!");
                    System.out.println("---------------------------");
            }  
            DisplayMenu();
            x = input.nextInt();
        }
    }
    
    public static void DisplayMenu(){
        System.out.println("MENU");
        System.out.println("--------------------");
        System.out.println("1. Customer Service");
        System.out.println("2. Transaksi");
        System.out.println("3. Back-Up Data");
        System.out.println("----------------------------------");
        System.out.print("Masukkan Menu yang Anda Pilih (1/2/3):");
        Scanner r = new Scanner(System.in);
        int y = r.nextInt();
        if(y==1){
            ArrayList al = new ArrayList();
            al.add(new Loket ("A", "Customer Service"));
            Loket a = (Loket) al.get(1);
            System.out.println(a.getNama());
            PrintWriter outputStream = null; 
            try {
                outputStream = new PrintWriter(new FileOutputStream("BackUpData.txt"));
            }
            catch(FileNotFoundException e) {
                System.out.println("Error opening the file out.txt. " + e.getMessage());
                System.exit(0);
            }
            outputStream.close();
            System.out.println("... written to out.txt.");
        }
        else if(y==2){
            Transaksi();
        }
        else{
           PrintWriter outputStream = null; 
            try {
                outputStream = new PrintWriter(new FileOutputStream("BackUpData.txt"));
            }
            catch(FileNotFoundException e) {
                System.out.println("Error opening the file out.txt. " + e.getMessage());
                System.exit(0);
            }
            outputStream.close();
            System.out.println("... written to out.txt.");
        }
    }
    
    public static void Transaksi(){
        System.out.println("Loket B");      
    }
    
}
