/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2019130004;

import java.util.Scanner;

/**
 *
 * @author Laurent Glorian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DisplayMenu();
        Scanner input = new Scanner(System.in);
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
        System.out.println("1. Sepatu");
        System.out.println("2. T-Shirt");
        System.out.println("3. Kemeja");
        System.out.println("4. Jaket");
        System.out.println("5. Aksesoris");
        System.out.println("------------------------");
        System.out.print("Pilihan Anda (1/2/3/4/5): ");
        Scanner r = new Scanner(System.in);
        int y = r.nextInt();
        if(y==1){
            Sepatu();
        }
        else if(y==2){
           TShirt(); 
        }
        else if(y==3){
           Kemeja();
        }
        else if(y==4){
           Jaket(); 
        }
        else{
            Aksesoris();
        }
    }
    
    public static void Promo(){
        System.out.println("--------------------------");
        System.out.println("PROMO");
        System.out.println("------");
        System.out.println("Diskon 20% setiap pembelian minimal 5 Sepatu!");
        System.out.println("Diskon 20% setiap pembelian minimal 10 T-Shirt!");
        System.out.println("Diskon 20% setiap pembelian minimal 10 Kemeja!");
        System.out.println("Diskon 20% setiap pembelian minimal 10 Jaket!");
        System.out.println("Diskon 20% setiap pembelian minimal 5 Aksesoris!");
        System.out.println("DISKON TIDAK BERLAKU UNTUK BEDA JENIS DAN BEDA UKURAN!");
        System.out.println("------------------------------------------------------");
    }
    
    public static void Sepatu(){
        System.out.println("--------------------------");
        System.out.println("SEPATU");
        System.out.println("-------");
        Sepatu sepatu1 = new Sepatu (1, "Adidas", 100000);
        System.out.println(sepatu1.getNama() + " : " + sepatu1.getHarga());
        Sepatu sepatu2 = new Sepatu (2, "Nike", 150000);
        System.out.println(sepatu2.getNama() + " : " + sepatu2.getHarga());
        Sepatu sepatu3 = new Sepatu (3, "Fila", 200000);
        System.out.println(sepatu3.getNama() + " : " + sepatu3.getHarga());
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3): ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y==1){
           HitungJumlah1(); 
        }
        else if(y==2){
           HitungJumlah2(); 
        }
        else{
           HitungJumlah3(); 
        }
    }
    
    public static void TShirt(){
        System.out.println("--------------------------");
        System.out.println("T-SHIRT");
        System.out.println("--------");
        TShirt tshirt1 = new TShirt (1, "S", 40000);
        System.out.println(tshirt1.getNama() + " : " + tshirt1.getHarga());
        TShirt tshirt2 = new TShirt (2, "M", 45000);
        System.out.println(tshirt2.getNama() + " : " + tshirt2.getHarga());
        TShirt tshirt3 = new TShirt (3, "L", 50000);
        System.out.println(tshirt3.getNama() + " : " + tshirt3.getHarga());
        TShirt tshirt4 = new TShirt (4, "XL", 55000);
        System.out.println(tshirt4.getNama() + " : " + tshirt4.getHarga());
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3/4): ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y==1){
           HitungJumlah4(); 
        }
        else if(y==2){
           HitungJumlah5(); 
        }
        else if(y==3){
           HitungJumlah6(); 
        }
        else{
           HitungJumlah7(); 
        }
    }
    
    public static void Kemeja(){
        System.out.println("--------------------------");
        System.out.println("KEMEJA");
        System.out.println("-------");
        Kemeja kemeja1 = new Kemeja (1, "S", 50000);
        System.out.println(kemeja1.getNama() + " : " + kemeja1.getHarga());
        Kemeja kemeja2 = new Kemeja (2, "M", 55000);
        System.out.println(kemeja2.getNama() + " : " + kemeja2.getHarga());
        Kemeja kemeja3 = new Kemeja (3, "L", 60000);
        System.out.println(kemeja3.getNama() + " : " + kemeja3.getHarga());
        Kemeja kemeja4 = new Kemeja (4, "XL", 65000);
        System.out.println(kemeja4.getNama() + " : " + kemeja4.getHarga());
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3/4): ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y==1){
           HitungJumlah8(); 
        }
        else if(y==2){
           HitungJumlah9(); 
        }
        else if(y==3){
           HitungJumlah10(); 
        }
        else{
           HitungJumlah11(); 
        }
    }
    
    public static void Jaket(){
        System.out.println("--------------------------");
        System.out.println("JAKET");
        System.out.println("------");
        Jaket jaket1 = new Jaket (1, "S", 60000);
        System.out.println(jaket1.getNama() + " : " + jaket1.getHarga());
        Jaket jaket2 = new Jaket (2, "M", 65000);
        System.out.println(jaket2.getNama() + " : " + jaket2.getHarga());
        Jaket jaket3 = new Jaket (3, "L", 70000);
        System.out.println(jaket3.getNama() + " : " + jaket3.getHarga());
        Jaket jaket4 = new Jaket (4, "XL", 75000);
        System.out.println(jaket4.getNama() + " : " + jaket4.getHarga());
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3/4): ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y==1){
           HitungJumlah12(); 
        }
        else if(y==2){
           HitungJumlah13(); 
        }
        else if(y==3){
           HitungJumlah14(); 
        }
        else{
           HitungJumlah15(); 
        }
    }
    
    public static void Aksesoris(){
        System.out.println("--------------------------");
        System.out.println("AKSESORIS");
        System.out.println("----------");
        Aksesoris aksesoris1 = new Aksesoris (1, "Sabuk", 70000);
        System.out.println(aksesoris1.getNama() + " : " + aksesoris1.getHarga());
        Aksesoris aksesoris2 = new Aksesoris (2, "Dompet", 65000);
        System.out.println(aksesoris2.getNama() + " : " + aksesoris2.getHarga());
        Aksesoris aksesoris3 = new Aksesoris (3, "Topi", 60000);
        System.out.println(aksesoris3.getNama() + " : " + aksesoris3.getHarga());
        System.out.println("--------------------------");
        System.out.print("Pilihan Anda (1/2/3): ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y==1){
           HitungJumlah16(); 
        }
        else if(y==2){
           HitungJumlah17(); 
        }
        else{
           HitungJumlah18(); 
        }
    }
    
    //Hitungan SEPATU
    public static void HitungJumlah1(){
        Sepatu sepatu1 = new Sepatu (1, "Adidas", 100000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * sepatu1.getHarga();
        if(y < 5){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 5){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah2(){
        Sepatu sepatu2 = new Sepatu (2, "Nike", 150000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * sepatu2.getHarga();
        if(y < 5){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 5){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah3(){
        Sepatu sepatu3 = new Sepatu (3, "Fila", 200000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * sepatu3.getHarga();
        if(y < 5){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 5){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    //Hitungan TSHIRT
    public static void HitungJumlah4(){
        TShirt tshirt1 = new TShirt (1, "S", 40000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * tshirt1.getHarga();
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
        TShirt tshirt2 = new TShirt (2, "M", 45000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * tshirt2.getHarga();
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
        TShirt tshirt3 = new TShirt (3, "L", 50000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * tshirt3.getHarga();
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
        TShirt tshirt4 = new TShirt (4, "XL", 55000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * tshirt4.getHarga();
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
    
    //Hitungan KEMEJA
    public static void HitungJumlah8(){
        Kemeja kemeja1 = new Kemeja (1, "S", 50000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kemeja1.getHarga();
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
        Kemeja kemeja2 = new Kemeja (2, "M", 55000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kemeja2.getHarga();
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
        Kemeja kemeja3 = new Kemeja (3, "L", 60000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kemeja3.getHarga();
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
        Kemeja kemeja4 = new Kemeja (4, "XL", 65000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * kemeja4.getHarga();
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
    
    //Hitungan JAKET
    public static void HitungJumlah12(){
        Jaket jaket1 = new Jaket (1, "S", 60000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * jaket1.getHarga();
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
    
    public static void HitungJumlah13(){
        Jaket jaket2 = new Jaket (2, "M", 65000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * jaket2.getHarga();
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
    
    public static void HitungJumlah14(){
        Jaket jaket3 = new Jaket (3, "L", 70000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * jaket3.getHarga();
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
    
    public static void HitungJumlah15(){
        Jaket jaket4 = new Jaket (4, "XL", 75000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * jaket4.getHarga();
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
    
    //Hitungan AKSESORIS
    public static void HitungJumlah16(){
        Aksesoris aksesoris1 = new Aksesoris (1, "Sabuk", 70000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * aksesoris1.getHarga();
        if(y < 5){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 5){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah17(){
        Aksesoris aksesoris2 = new Aksesoris (2, "Dompet", 65000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * aksesoris2.getHarga();
        if(y < 5){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 5){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
    
    public static void HitungJumlah18(){
        Aksesoris aksesoris3 = new Aksesoris (3, "Topi", 60000);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah: ");
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int jumlahharga = y * aksesoris3.getHarga();
        if(y < 5){
            int diskon = jumlahharga;
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
        if(y >= 5){
            int diskon = jumlahharga - (jumlahharga * 20/100);
            System.out.println("--------------------");
            System.out.println("Total: " + diskon);
            System.out.println("-------------");
        }
    }
}
