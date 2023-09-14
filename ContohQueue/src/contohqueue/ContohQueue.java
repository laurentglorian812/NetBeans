/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohqueue;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ContohQueue {
    public static Scanner scn=new Scanner(System.in);
    public static LinkedList<Integer> dt=new LinkedList<Integer>();
    
    public static void tambah(){
        int angka=0;
        char tanya;
        do{
            System.out.printf("Masukkan data (keluar-1) : ");
            angka=scn.nextInt();
            if(angka>0){
                System.out.printf("Mau masuk antrian?");
                tanya=scn.next().charAt(0);
                if(tanya=='y'){
                    dt.offer(new Integer(angka));
                }
            }
        }while(angka>0);
    }
    
    public static void tampil(){
        System.out.println(dt);
    }
    
    public static void proses(){
        if(dt.size()>0){
            System.out.println(dt.poll()+"sudah diproses");
        }else{
            System.out.println("tidak ada data ");
        }
    }
    //offer > buat nambah data di antrian
    //poll > datanya diambil trs dihapus, yg diambil pasti yg pling dpn
    public static void main(String[] args) {
        int pilih=0;
        do{
            System.out.println("Menu");
            System.out.println("1.Tambah antrian");
            System.out.println("2.Tampilkan antrian");
            System.out.println("3.Proses antrian");
            System.out.println("0.Keluar");
            System.out.printf("Pilihan : ");pilih=scn.nextInt();
            switch(pilih){
                case 1 : tambah();break;
                case 2 : tampil();break;
                case 3 : proses();break;
            }
        }while(pilih>0);
    }
}
