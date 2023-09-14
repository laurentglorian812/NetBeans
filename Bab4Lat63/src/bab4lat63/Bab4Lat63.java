/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4lat63;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Acer
 */
public class Bab4Lat63 {
    public static Scanner scn=new Scanner(System.in);
    public static Stack<Integer> dt=new Stack<Integer>();
    public static Stack<Integer> rd=new Stack<Integer>();
    
    public static void tambah(){
        int angka=0;
        char tanya;
        do{
            System.out.println("Pilihan");
            System.out.println("1. Titik");
            System.out.println("2. Garis");
            System.out.println("3. Kotak");
            System.out.println("4. Lingkaran");
            System.out.println("5. Warna");
            System.out.println("6. Tulisan");
            System.out.println("7. Hapus");
            System.out.println("0. Keluar");
            angka=scn.nextInt();
            if(angka>0){
                System.out.printf("Mau masuk tumpukan?");
                tanya=scn.next().charAt(0);
                if(tanya=='y'){
                    dt.push(new Integer(angka));
                }
            }
        }while(angka>0);
    }
    
    public static void tampil(){
        System.out.println("Undo:");
        Iterator<Integer>tmp=dt.iterator();
        if(dt.size()>0){
            int tmpdt;
            do{
                tmpdt=tmp.next();
                switch(tmpdt){
                    case 1 :System.out.println("titik");break;
                    case 2 :System.out.println("garis");break;
                    case 3 :System.out.println("kotak");break;
                    case 4 :System.out.println("lingkaran");break;
                    case 5 :System.out.println("warna");break;
                    case 6 :System.out.println("tulisan");break;
                    case 7 :System.out.println("hapus");break;
                }
            }while(tmp.hasNext());
        }
        System.out.println("Redo:");
        tmp=rd.iterator();
        if(rd.size()>0){
            int tmpdt;
            do{
                tmpdt=tmp.next();
                switch(tmpdt){
                    case 1 :System.out.println("titik");break;
                    case 2 :System.out.println("garis");break;
                    case 3 :System.out.println("kotak");break;
                    case 4 :System.out.println("lingkaran");break;
                    case 5 :System.out.println("warna");break;
                    case 6 :System.out.println("tulisan");break;
                    case 7 :System.out.println("hapus");break;
                }
            }while(tmp.hasNext());
        }
    }
    
    public static void proses_undo(){
        if(dt.size()>0){
            int tmp=dt.pop();
            rd.push(tmp);
            System.out.println(tmp+" sudah diproses");
        }else{
            System.out.println("tidak ada operasi ");
        }
    }
    
    public static void proses_redo(){
        if(rd.size()>0){
            int tmp=rd.pop();
            dt.push(tmp);
            System.out.println(tmp+" sudah diproses");
        }else{
            System.out.println("tidak ada operasi ");
        }
    }
    
    public static void main(String[] args) {
        int pilih=0;
        do{
            System.out.println("Menu");
            System.out.println("1.Tambah operasi");
            System.out.println("2.Tampilkan operasi");
            System.out.println("3.Undo");
            System.out.println("4.Redo");
            System.out.println("0.Keluar");
            System.out.printf("Pilihan : ");pilih=scn.nextInt();
            switch(pilih){
                case 1 : tambah();break;
                case 2 : tampil();break;
                case 3 : proses_undo();break;
                case 4 : proses_redo();break;
            }
        }while(pilih>0);
    }
}
