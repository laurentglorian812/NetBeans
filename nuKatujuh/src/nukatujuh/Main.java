/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukatujuh;

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
        ArrayList al = new ArrayList();
        /*System.out.println("Jumlah Mahasiswa: " + al.size() + " orang");
        al.add(new Mahasiswa(2020940003, "Muhammad Daffa"));
        al.add(new Mahasiswa(2019130018, "Rijal Khalik"));
        al.add(new Mahasiswa(2018110019, "Regina Natalia"));
        System.out.println("Jumlah Mahasiswa: " + al.size() + " orang");
        al.add(0, new Mahasiswa(2019130007, "Carel Elink"));
        //Mahasiswa x = (Mahasiswa) al.get(2);
        //System.out.println("NPM Mahasiswa ke-3: " + x.getNpm());
        //System.out.println("Nama Mahasiswa ke-3: " + x.getNama());
        for (int i=0; i<al.size(); i++) {
            Mahasiswa x = (Mahasiswa) al.get(i);
            System.out.println("NPM Mahasiswa ke-" + (i+1) + ": " + x.getNpm());
            System.out.println("Nama Mahasiswa ke-" + (i+1) + ": " + x.getNama());
        }*/
        
        DisplayMenu();
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        while (x!=3){
            switch (x){
                case 1:{
                    AddProduct(); break;
                }
                case 2:{
                    //Promo(); break;
                }
                default: 
                    System.out.println("------------------------");
                    System.out.println("ANDA SALAH MEMASUKKAN MENU!");
                    System.out.println("---------------------------");
            }  
            DisplayMenu();
            x = input.nextInt();
        }
        
        Product a = new Product(1, "T-Shirt", 75000);
        Product b = new Product(2, "Celana", 90000);
        Product c = new Product(3, "Topi", 120000);
        
        Order o = new Order(1);
        
        o.addProduct(a);
        o.addProduct(b);
        System.out.println("TOTAL Bayar: Rp. " + o.getTotal());
    }
    
    public static void DisplayMenu(){
        System.out.println("----------------------------");
        System.out.println("SELAMAT DATANG di MyDISTROLL");
        System.out.println("----------------------------");
        System.out.println("1. Create Order");
        System.out.println("2. Exit");
        System.out.println("----------------------------");
        System.out.println("Pilihan Anda (1/2/3/4/5) : ");
    }
    
    public static void AddProduct(){
        System.out.println("--------------------------");
        System.out.println("ORDER");
        System.out.println("-----");
        System.out.println("1. T-Shirt");
        System.out.println("2. Celana");
        System.out.println("3. Topi");
        System.out.println("4. Cancel Product");
        System.out.println("5. Check Out");
        System.out.println("------------------------");
        System.out.print("Pilihan Anda (1/2/3/4/5): ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y==1){
            TShirt();
        }
        else if(y==2){
            Celana();
        }
        else if(y==3){
            Topi();
        }
        else if(y==4){
            //CancelProduct();
        }
        else{
            TampilHarga();
        }
    }
    
    public static void TShirt(){
        System.out.println("------------------------");
        System.out.print("Masukkan Jumlah: ");
        AddProduct();
    }
    
    public static void Celana(){
        System.out.println("------------------------");
        System.out.print("Masukkan Jumlah: ");
        AddProduct();
    }
    
    public static void Topi(){
        System.out.println("------------------------");
        System.out.print("Masukkan Jumlah: ");
        AddProduct();
    }
    
    public static void TampilHarga(){
        Product a = new Product(1, "T-Shirt", 75000);
        Scanner jumlah = new Scanner(System.in);
        int y = jumlah.nextInt();
        int harga = y * a.getPrice();
        Product b = new Product(2, "Celana", 90000);
        
        Product c = new Product(3, "Topi", 120000);
        System.out.println("------------------------");
        System.out.print("Total Harga: ");
    }
}
