/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuas2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LatihanUAS2 {
    public static Scanner scn=new Scanner(System.in);
    public static Queue<Integer>ptg=new LinkedList<>();
    public static Queue<Integer>clp=new LinkedList<>();
    public static Queue<Integer>jht=new LinkedList<>();
    public static LinkedList<Integer>pkn=new LinkedList<>();
    
    public static void inputpotong(){
        System.out.println("========================");
        System.out.println("1. Input antrian potong");
        System.out.println("========================");
        int jml=0;
        while(jml>=0){
            System.out.print("Masukkan jumlah : "); jml=scn.nextInt();
            if(jml>=0)
                ptg.offer(jml);
        }
    }
    
    public static void prosescelup(){
        System.out.println("========================");
        System.out.println("2. Proses masuk ke celup");
        System.out.println("========================");
        if(!ptg.isEmpty()){
            clp.offer(ptg.poll());
            System.out.println("Memasuki proses celup");
        }else{
            System.out.println("Kosong");
        }
    }
    
    public static void prosesjahit(){
        System.out.println("========================");
        System.out.println("3. Proses masuk ke jahit");
        System.out.println("========================");
        if(!clp.isEmpty()){
            jht.offer(clp.poll());
            System.out.println("Memasuki proses jahit");
        }else{
            System.out.println("Kosong");
        }
    }
    
    public static void pakaian(){
        System.out.println("========================");
        System.out.println("4. Menjadi pakaian");
        System.out.println("========================");
        if(!jht.isEmpty()){
            pkn.add(jht.poll());
            System.out.println("Selesai");
        }else{
            System.out.println("Kosong");
        }
    }
    
    public static void lihatdata(){
        System.out.println("========================");
        System.out.println("5. Lihat data");
        System.out.println("========================");
        System.out.println("POTONG");
        System.out.println("Isi antrian : "+ptg);
        System.out.println("Jumlah antrian : "+ptg.size());
        System.out.println("------------------------");
        System.out.println("CELUP");
        System.out.println("Isi antrian : "+clp);
        System.out.println("Jumlah antrian : "+clp.size());
        System.out.println("------------------------");
        System.out.println("JAHIT");
        System.out.println("Isi antrian : "+jht);
        System.out.println("Jumlah antrian : "+jht.size());
        System.out.println("------------------------");
        System.out.println("Pakaian yang sudah jadi : "+pkn);
        System.out.println("Jumlah pakaian yang sudah jadi : "+pkn.size());
    }
    
    public static void main(String[] args) {
        int pilih=0;
        do{
            System.out.println("=====");
            System.out.println("MENU");
            System.out.println("=====");
            System.out.println("1. Input antrian potong");
            System.out.println("2. Proses masuk ke celup");
            System.out.println("3. Proses masuk ke jahit");
            System.out.println("4. Menjadi pakaian");
            System.out.println("5. Lihat data");
            System.out.println("0. Keluar");
            System.out.printf("Pilihan : "); pilih=scn.nextInt();
            switch(pilih){
                case 1 : inputpotong(); break;
                case 2 : prosescelup(); break;
                case 3 : prosesjahit(); break;
                case 4 : pakaian(); break;
                case 5 : lihatdata(); break;
            }
        }while(pilih>0);
    }
}
