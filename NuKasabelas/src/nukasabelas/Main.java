/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukasabelas;

import java.util.ArrayList;
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
        Transaksi t = new Transaksi(12345);
        Ikan ikan1 = new Ikan("Guppy", "Air Tawar dan Payau", "Amerika Selatan", 14000);
        Ikan ikan2 = new Ikan("Komet", "Air Tawar", "China", 15000);
        Ikan ikan3 = new Ikan("Neon Tetra", "Air Tawar", "Amerika Selatan", 5000);
        Ikan ikan4 = new Ikan("Manfish", "Air Tawar", "Amazon", 12000);
        Ikan ikan5 = new Ikan("Lemon", "Air Tawar", "Afrika Timur", 12500);
        t.addIkan(ikan1);
        t.addIkan(ikan2);
        t.addIkan(ikan3);
        t.addIkan(ikan4);
        t.addIkan(ikan5);
        ArrayList<Ikan> list = new ArrayList();
        list = t.getIkans();
        
        DisplayMenu();
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        while (x!=4){
            switch (x){
                case 1:
                    //MenuIkan(a); break;
                case 2:
                    Promo(); break;
                case 3:
                    OrderIkan(); break;
                default: System.out.println("Anda salah memasukkan menu.");
            } 
            DisplayMenu();
            Scanner v = new Scanner(System.in);
            x = v.nextInt();
        }
    }
    
    public static void DisplayMenu(){
        System.out.println("---------------------------------");
        System.out.println("Selamat Datang di IKAN HIAS LIKMI");
        System.out.println("---------------------------------");
        System.out.println("1. Menu Ikan");
        System.out.println("2. Promo");
        System.out.println("3. Order Ikan");
        System.out.println("4. Keluar");
        System.out.println("-------------------------");
        System.out.print("Pilihan Anda (1/2/3/4): ");
    }
    
    public static void MenuIkan(Ikan a){
        System.out.println("-------------------------");
        System.out.println("----------");
        System.out.println("MENU IKAN");
        System.out.println("----------");
        System.out.println("Jenis: " + a.getJenis());
        System.out.println("Lingkungan: " + a.getLingkungan());
        System.out.println("Asal: " + a.getAsal());
        System.out.println("Harga: " + a.getHarga());
        System.out.println("----------------------");
        
    }
    
    public static void Promo(){
        System.out.println("-------------------------");
        System.out.println("------");
        System.out.println("PROMO");
        System.out.println("------");
        System.out.println("Diskon 20% setiap pembelian lebih dari 5 ikan!");
        System.out.println("-----------------------------------------------");
    }
    
    public static void OrderIkan(){
        System.out.println("--------------------------");
        System.out.println("ORDER IKAN");
        System.out.println("-----------");
        System.out.print("Pilih Ikan (1/2): ");
        Scanner t = new Scanner(System.in);
        int y = t.nextInt();
        if(y==1)
            JumlahIkan();
        else
            JumlahIkan();
    }
    
    public static void JumlahIkan(){
        System.out.println("-------------------------");
        System.out.print("Masukkan jumlah yang Anda inginkan: ");
        Scanner u = new Scanner(System.in);
        int y = u.nextInt();
        Transaksi t = new Transaksi(12345);
        System.out.println(t.getTagihan());
    }
    
}
