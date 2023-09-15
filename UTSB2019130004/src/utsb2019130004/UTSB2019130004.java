/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utsb2019130004;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class UTSB2019130004 {
    public static Scanner scn=new Scanner(System.in);
    public static LinkedList<Integer> msk=new LinkedList<Integer>();
    public static Integer ant[][]=new Integer[15][3];
    public static int jml[]=new int[3];
    public static Random ack=new Random();
    
    public static void masukantrian(){
        int tmp=0;
        do{
            System.out.println("Isikan 0 untuk lanjut");
            System.out.printf("Nomor antrian : ");tmp=scn.nextInt();
            msk.offer(tmp);
        }while(tmp>0);
    }
    
    public static void prosesantrian(){
        if(msk.size()>0){
            int a=0;
            do{
                a=ack.nextInt(3);
            }while(jml[a]>=15);
            if(jml[a]<15){
                int b=0;
                if(b>0){
                    b=ack.nextInt(15);
                }
                ant[b][a]=msk.poll();
                jml[a]++;
            }
        }
    }
    
    public static void tampilantrian(){
        System.out.println("Antrian : "+msk);
        for(int i=0;i<3;i++){
            for(int j=0;j<15;j++){
                System.out.printf("%8s",ant[j][i]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int pilih=0;
        do{
            System.out.println("MENU");
            System.out.println("--------------------");
            System.out.println("1. Masuk Antrian");
            System.out.println("2. Proses Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("0. Close");
            System.out.printf("Pilihan : ");pilih=scn.nextInt();
            switch(pilih){
                case 1 : masukantrian();break;
                case 2 : prosesantrian();break;
                case 3 : tampilantrian();break; 
            }
        }while(pilih>0);
    }
}
