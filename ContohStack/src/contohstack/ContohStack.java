/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohstack;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Acer
 */
public class ContohStack {
    public static Scanner scn=new Scanner(System.in);
    public static Stack<Integer> dt=new Stack<Integer>();
    
    public static void tambah(){
        int angka=0;
        char tanya;
        do{
            System.out.printf("Masukkan data (keluar-1) : ");
            angka=scn.nextInt();
            if(angka>=0){
                System.out.printf("Mau masuk tumpukan?");
                tanya=scn.next().charAt(0);
                if(tanya=='y'){
                    dt.push(new Integer(angka));
                }
            }
        }while(angka>=0);
    }
    
    public static void tampil(){
        System.out.println(dt);
    }
    
    public static void proses(){
        if(dt.size()>0){
            System.out.println(dt.pop()+"sudah diproses");
        }else{
            System.out.println("tidak ada data ");
        }
    }
    
    public static void main(String[] args) {
        int pilih=0;
        do{
            System.out.println("Menu");
            System.out.println("1.Tambah tumpukan");
            System.out.println("2.Tampilkan tumpukan");
            System.out.println("3.Proses tumpukan");
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
