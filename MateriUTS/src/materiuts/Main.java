/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materiuts;

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
        }
    }
    
    public static void DisplayMenu(){
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
        System.out.println("1. Polos");
        System.out.println("2. Gambar Hitam Putih");
        System.out.println("3. Gambar Berwarna ");
        System.out.println("------------------------");
        System.out.print("Pilihan Anda (1/2/3): ");
        Scanner r = new Scanner(System.in);
        int y = r.nextInt();
        if(y==1){
            UkuranPolos();
        }
        else if(y==2){
            UkuranHitamPutih();
        }
        else{
            UkuranBerwarna();
        }
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
        Kaos kaoss = new Kaos ("S", 40000);
        System.out.println(kaoss.getUkuran() + " : " + kaoss.getHarga());
        Kaos kaosm = new Kaos ("M", 45000);
        System.out.println(kaosm.getUkuran() + " : " + kaosm.getHarga());
        Kaos kaosl = new Kaos ("L", 50000);
        System.out.println(kaosl.getUkuran() + " : " + kaosl.getHarga());
        Kaos kaosxl = new Kaos ("XL", 60000);
        System.out.println(kaosxl.getUkuran() + " : " + kaosxl.getHarga());
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3/4): ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y==1){
           HitungJumlah1(); 
        }
        else if(y==2){
           HitungJumlah2(); 
        }
        else if(y==3){
           HitungJumlah3(); 
        }
        else{
           HitungJumlah4(); 
        }
    }
    
    public static void UkuranHitamPutih(){
        System.out.println("--------------------------");
        System.out.println("UKURAN & HARGA");
        System.out.println("---------------");
        Kaos kaoss = new Kaos ("S", 90000);
        System.out.println(kaoss.getUkuran() + " : " + kaoss.getHarga());
        Kaos kaosm = new Kaos ("M", 95000);
        System.out.println(kaosm.getUkuran() + " : " + kaosm.getHarga());
        Kaos kaosl = new Kaos ("L", 100000);
        System.out.println(kaosl.getUkuran() + " : " + kaosl.getHarga());
        Kaos kaosxl = new Kaos ("XL", 110000);
        System.out.println(kaosxl.getUkuran() + " : " + kaosxl.getHarga());
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3/4): ");
        Scanner t = new Scanner(System.in);
        int y = t.nextInt();
        if(y==1){
           HitungJumlah5(); 
        }
        else if(y==2){
           HitungJumlah6(); 
        }
        else if(y==3){
           HitungJumlah7(); 
        }
        else{
           HitungJumlah8(); 
        }
    }
    
    public static void UkuranBerwarna(){
        System.out.println("--------------------------");
        System.out.println("UKURAN & HARGA");
        System.out.println("---------------");
        Kaos kaoss = new Kaos ("S", 115000);
        System.out.println(kaoss.getUkuran() + " : " + kaoss.getHarga());
        Kaos kaosm = new Kaos ("M", 120000);
        System.out.println(kaosm.getUkuran() + " : " + kaosm.getHarga());
        Kaos kaosl = new Kaos ("L", 125000);
        System.out.println(kaosl.getUkuran() + " : " + kaosl.getHarga());
        Kaos kaosxl = new Kaos ("XL", 135000);
        System.out.println(kaosxl.getUkuran() + " : " + kaosxl.getHarga());
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3/4): ");
        Scanner u = new Scanner(System.in);
        int y = u.nextInt();
        if(y==1){
           HitungJumlah9(); 
        }
        else if(y==2){
           HitungJumlah10(); 
        }
        else if(y==3){
           HitungJumlah11(); 
        }
        else{
           HitungJumlah12(); 
        }
    }
    
    public static void HitungJumlah1(){
        Kaos kaoss = new Kaos ("S", 40000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah2(){
        Kaos kaoss = new Kaos ("M", 45000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah3(){
        Kaos kaoss = new Kaos ("L", 50000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah4(){
        Kaos kaoss = new Kaos ("XL", 60000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah5(){
        Kaos kaoss = new Kaos ("S", 90000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah6(){
        Kaos kaoss = new Kaos ("M", 95000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah7(){
        Kaos kaoss = new Kaos ("L", 100000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah8(){
        Kaos kaoss = new Kaos ("XL", 110000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah9(){
        Kaos kaoss = new Kaos ("S", 115000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah10(){
        Kaos kaoss = new Kaos ("M", 120000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah11(){
        Kaos kaoss = new Kaos ("L", 125000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah12(){
        Kaos kaoss = new Kaos ("XL", 130000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kaoss.getHarga();
        if(y < 10){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 10){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
}
