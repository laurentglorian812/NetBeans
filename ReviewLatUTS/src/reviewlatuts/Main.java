/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewlatuts;

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
        // TODO code application logic here\
        /*DisplayMenu();
        Scanner input = new Scanner(System.in);
        //Scanner p = new Scanner(System.in);
        int x = input.nextInt();
        while (x!=3){
            switch (x){
                case 1:{
                    Order(); break;
                }
                case 2:{
                    Promo(); break;
                }
                default: 
                    System.out.println("------------------------");
                    System.out.println("ANDA SALAH MEMASUKKAN MENU!");
                    System.out.println("---------------------------");
            }  
            DisplayMenu();
            //Scanner q = new Scanner(System.in);
            x = input.nextInt();
        }*/
        
        
        
        TShirt tshirtberwarna = new TShirtBerwarna("XL", 1);
        
        
        
        System.out.println("Harga TShirt Berwarna : " + tshirtberwarna.getHarga());
    }
}
    
    /*public static void DisplayMenu(){
        System.out.println("----------------");
        System.out.println("SELAMAT DATANG!");
        System.out.println("----------------");
        System.out.println("1. Order");
        System.out.println("2. Promo");
        System.out.println("3. Keluar");
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3): ");
    }
    
    public static void Order(){
        System.out.println("--------------------------");
        System.out.println("ORDER");
        System.out.println("------");
        System.out.println("1. TShirt Polos");
        System.out.println("2. TShirt Gambar Hitam Putih");
        System.out.println("3. TShirt Gambar Berwarna ");
        System.out.println("------------------------");
        System.out.print("Pilihan Anda (1/2/3): ");
    }
    
    public static void Promo(){
        System.out.println("--------------------------");
        System.out.println("PROMO");
        System.out.println("------");
        System.out.println("Diskon 20% setiap pembelian minimal 10 kaos!");
        System.out.println("--------------------------------------------");
    }
       
    public static void UkuranPolos(){
        System.out.println("--------------------------");
        System.out.println("UKURAN & HARGA");
        System.out.println("---------------");
        TShirt tshirt1 = new TShirt("S");
        System.out.println(tshirt1.getUkuran() + " : " + tshirt1.getHarga());
        TShirt tshirt2 = new TShirt("M");
        System.out.println(tshirt2.getUkuran() + " : " + tshirt2.getHarga());
        TShirt tshirt3 = new TShirt("L");
        System.out.println(tshirt3.getUkuran() + " : " + tshirt3.getHarga());
        TShirt tshirt4 = new TShirt("XL");
        System.out.println(tshirt4.getUkuran() + " : " + tshirt4.getHarga());
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3/4): ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        //if(y==1){
           //HitungJumlah1(); 
        //}
        //else if(y==2){
           //HitungJumlah2(); 
        //}
        //else if(y==3){
           //HitungJumlah3(); 
        //}
        //else{
           //HitungJumlah4(); 
        //}
    }*/
