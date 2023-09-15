/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuts1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class LatihanUTS1 {
    public static Scanner scn=new Scanner(System.in);
    public static LinkedList<String> masuk=new LinkedList<String>();
    public static LinkedList<String> keluar=new LinkedList<String>();
    public static String lantai[][]=new String[35][3];
    public static int jml[]=new int[3];
    public static Random ack=new Random();
    
    public static void antrimasuk(){
        String tmp="";
        do{
            System.out.printf("Isikan 0 untuk keluar");
            System.out.printf("Nomor kendaraan : ");tmp=scn.next();
            masuk.offer(tmp);
        }while(!tmp.equals("0"));
    }
    
    public static void prosesmasuk(){
        if(masuk.size()>0){
            int l=0;
            do{
                l=ack.nextInt(3);
            }while(jml[l]>=35);
            if(jml[l]<35){
                int a=0;
                do{
                    a=ack.nextInt(35);
                }while(!lantai[a][l].equals("0"));
                lantai[a][l]=masuk.poll();
                jml[l]++;
            }
        }
    }
    
    public static void antrikeluar(){
        if(jml[0]+jml[1]+jml[2]>0){
            int l=0;
            do{
                l=ack.nextInt(3);
            }while(jml[l]<=0);
            if(jml[l]>0){
                int a=0;
                do{
                    a=ack.nextInt(35);
                }while(lantai[a][l].equals("0"));
                keluar.offer(lantai[a][l]);
                jml[l]--;
            }
        }
    }
   
    public static void proseskeluar(){
        System.out.println(keluar.poll()+" sudah keluar mall");
    }
    
    public static void tampil(){
        System.out.println("Antrian masuk : "+masuk);
        for(int i=0;i<3;i++){
            for(int j=0;j<35;j++){
                System.out.printf("%10s",lantai[j][i]);
            }
            System.out.println("");
        }
        System.out.println("Antrian keluar : "+keluar);
    }
    
    public static void main(String[] args) {
        int pilih=0;
        for(int i=0;i<3;i++) jml[i]=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<35;j++){
                lantai[j][i]="0";
            }
        }
        do{
            System.out.println("MENU");
            System.out.println("1. Antrian Masuk");
            System.out.println("2. Antrian Keluar");
            System.out.println("3. Proses Masuk");
            System.out.println("4. Proses Keluar");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Close");
            System.out.printf("Pilihan : ");pilih=scn.nextInt();
            switch(pilih){
                case 1 : antrimasuk();break;
                case 2 : antrikeluar();break;
                case 3 : prosesmasuk();break;
                case 4 : proseskeluar();break;
                case 5 : tampil();break; 
            }
        }while(pilih>0);
    }
}
