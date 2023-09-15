/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanqueue2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LatihanQueue2 {
    public static Scanner scn=new Scanner(System.in);
    public static Queue<Integer>a1=new LinkedList<>();
    public static Queue<Integer>a2=new LinkedList<>();
    
    public static void inputdata(){
        int bayar=0;
        while(bayar>=0&&a2.size()<15){
            System.out.println("Isikan -1 untuk keluar");
            System.out.print("Masukkan bayar : "); bayar=scn.nextInt();
            if(bayar>=0){
                if(a1.size()<15)
                    a1.offer(bayar);
                else if(a2.size()<15)
                    a2.offer(bayar);
            }
        }
        if(a2.size()>=15)
            System.out.println("Semua antrian penuh");
    }
    
    public static void proses(){
        if(a1.isEmpty()){
            System.out.println("Antrian kosong");
        }else{
            System.out.println(a1.poll()+" diproses");
            if(!a2.isEmpty())
                a1.offer(a2.poll());
        }
    }
    
    public static void outputdata(){
        System.out.println("Isi antrian 1 : "+a1);
        System.out.println("Jumlah data antrian 1 : "+a1.size());
        System.out.println("Isi antrian 2 : "+a2);
        System.out.println("Jumlah data antrian 2 : "+a2.size());
    }
    
    public static void main(String[] args) {
        int pilih=1;
        while(pilih>0){
            System.out.println("ANTRIAN NAMA");
            System.out.println("-------------");
            System.out.println("1. Memasukkan data ke antrian");
            System.out.println("2. Proses data di antrian 1x");
            System.out.println("3. Menampilkan data di antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : "); pilih=scn.nextInt();
            switch(pilih){
                case 1 : inputdata();break;
                case 2 : proses();break;
                case 3 : outputdata();break;
            }
        }
    }
}
