/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuissatu;

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
        DisplayMenu();
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        while (x!=4){
            switch (x){
                case 1:{
                    MenuIkan(); break;
                }
                case 2:{
                    Promo(); break;
                }
                case 3:{
                    OrderIkan(); break;
                }
                default: System.out.println("Anda salah memasukkan menu.");
            }  
            DisplayMenu();
            Scanner t = new Scanner(System.in);
            x = t.nextInt();
        }
    }
    
    public static void DisplayMenu(){
        System.out.println("-----------------------------------");
        System.out.println("Selamat Datang di IKAN HIAS LIKMI");
        System.out.println("-----------------------------------");
        System.out.println("1. Menu Ikan");
        System.out.println("2. Promo");
        System.out.println("3. Order Ikan");
        System.out.println("4. Keluar");
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3/4): ");
    }
    
    public static void MenuIkan(){
        System.out.println("--------------------------");
        System.out.println("MENU IKAN");
        System.out.println("----------");
        Jenis jenis1 = new Jenis("Guppy");
        System.out.println("1. Jenis : " + jenis1.getJenis());
        Lingkungan lingkungan1 = new Lingkungan("Tawar dan Payau");
        System.out.println("   Lingkungan : " + lingkungan1.getLingkungan());
        Harga harga1 = new Harga(14000);
        System.out.println("   Harga : " + harga1.getHarga());
        Asal asal1 = new Asal("Amerika Selatan");
        System.out.println("   Asal : " + asal1.getAsal());
        System.out.println("--------------------------------");
        Jenis jenis2 = new Jenis("Komet");
        System.out.println("2. Jenis : " + jenis2.getJenis());
        Lingkungan lingkungan2 = new Lingkungan("Tawar");
        System.out.println("   Lingkungan : " + lingkungan2.getLingkungan());
        Harga harga2 = new Harga(15000);
        System.out.println("   Harga : " + harga2.getHarga());
        Asal asal2 = new Asal("China");
        System.out.println("   Asal : " + asal2.getAsal());
        System.out.println("--------------------------------");
        Jenis jenis3 = new Jenis("Neon Tetra");
        System.out.println("3. Jenis : " + jenis3.getJenis());
        Lingkungan lingkungan3 = new Lingkungan("Tawar");
        System.out.println("   Lingkungan : " + lingkungan3.getLingkungan());
        Harga harga3 = new Harga(5000);
        System.out.println("   Harga : " + harga3.getHarga());
        Asal asal3 = new Asal("Amerika Selatan");
        System.out.println("   Asal : " + asal3.getAsal());
        System.out.println("--------------------------------");
        Jenis jenis4 = new Jenis("Manfish");
        System.out.println("4. Jenis : " + jenis4.getJenis());
        Lingkungan lingkungan4 = new Lingkungan("Tawar");
        System.out.println("   Lingkungan : " + lingkungan4.getLingkungan());
        Harga harga4 = new Harga(12000);
        System.out.println("   Harga : " + harga4.getHarga());
        Asal asal4 = new Asal("Amazon");
        System.out.println("   Asal : " + asal4.getAsal());
        System.out.println("--------------------------------");
        Jenis jenis5 = new Jenis("Lemon");
        System.out.println("5. Jenis : " + jenis5.getJenis());
        Lingkungan lingkungan5 = new Lingkungan("Tawar");
        System.out.println("   Lingkungan : " + lingkungan5.getLingkungan());
        Harga harga5 = new Harga(12500);
        System.out.println("   Harga : " + harga5.getHarga());
        Asal asal5 = new Asal("Afrika Timur");
        System.out.println("   Asal : " + asal5.getAsal());
        System.out.println("--------------------------------");
    }
    
    public static void Promo(){
        System.out.println("--------------------------");
        System.out.println("PROMO");
        System.out.println("------");
        System.out.println("Diskon 20% setiap pembelian lebih dari 5 ikan!");
        System.out.println("-----------------------------------------------");
    }
    
    public static void OrderIkan(){
        System.out.println("--------------------------");
        System.out.println("ORDER IKAN");
        System.out.println("-----------");
        System.out.print("Pilih Ikan (1/2/3/4/5): ");
        Scanner u = new Scanner(System.in);
        int y = u.nextInt();
        switch (y){
            case 1:{
                Jenis jenis1 = new Jenis("Guppy");
                System.out.println("Jenis : " + jenis1.getJenis()); 
                Harga harga1 = new Harga(14000);
                System.out.println("Harga : " + harga1.getHarga());
                break;
            }
            case 2:{
                Jenis jenis2 = new Jenis("Komet");
                System.out.println("Jenis : " + jenis2.getJenis());
                Harga harga2 = new Harga(15000);
                System.out.println("Harga : " + harga2.getHarga()); 
                break;
            }
            case 3:{
                Jenis jenis3 = new Jenis("Neon Tetra");
                System.out.println("Jenis : " + jenis3.getJenis());
                Harga harga3 = new Harga(5000);
                System.out.println("Harga : " + harga3.getHarga()); 
                break;
            }
            case 4:{
                Jenis jenis4 = new Jenis("Manfish");
                System.out.println("Jenis : " + jenis4.getJenis());
                Harga harga4 = new Harga(12000);
                System.out.println("Harga : " + harga4.getHarga()); 
                break;
            }
            default: 
                Jenis jenis5 = new Jenis("Lemon");
                System.out.println("Jenis : " + jenis5.getJenis());
                Harga harga5 = new Harga(12500);
                System.out.println("Harga : " + harga5.getHarga());
        }
    }  
    
    public static void HitungIkan(){
        System.out.print("Masukkan jumlah yang Anda inginkan: ");
        Scanner v = new Scanner(System.in);
        int z = v.nextInt();
    }
}
