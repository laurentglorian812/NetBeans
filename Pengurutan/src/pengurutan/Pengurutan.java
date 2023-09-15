/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pengurutan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Pengurutan {

    /**
     * @param args the command line arguments
     */
    public static Scanner scn=new Scanner(System.in);
    public static Random ack=new Random();
    public static int data[], j=0, idx[];
    public static String angka[]={"Nol ", "Satu ", "Dua ", "Tiga ", "Empat ", 
            "Lima ", "Enam ", "Tujuh ", "Delapan ", "Sembilan "};
    public static void tukardata(int p1,int p2){
        int temp=data[p1];
        data[p1]=data[p2];
        data[p2]=temp;
    }
    
    public static void inputdata(){
        for(int i=0;i<j;i++){data[i]=i;idx[i]++;}
        for(int i=0;i<j;i++){ //kodingan randomnya
            tukardata(i,ack.nextInt(10));
        }
    }
    
    public static void acakdata(){
        for(int i=0;i<j;i++){data[i]=ack.nextInt(10);idx[data[i]]++;}
    }
    
    public static int cariidx(int dt){
        int h=0;
        if(dt<10){
            if(idx[dt]>0){
                for(int i=0;i<dt;i++) h+=idx[i];
            }
            else h=-1;
        }else h=-1;
        return(h);
    }
    
    public static int posmin(int awal){
        int terkecil=awal;
        for(int i=awal+1;i<j;i++){
            if(data[i]<data[terkecil])
                terkecil=i;
        }
        return(terkecil);
    }
    
    public static void minsort(){
        for(int i=0;i<j-1;i++){
            int kecil=posmin(i);
            if(kecil!=i){
                tukardata(kecil,i);
            }
            tampilkandata();
        }
    }
    
    public static int posmax(int akhir){
        int terbesar=akhir;
        for(int i=0;i<akhir-1;i++){
            if(data[i]>data[terbesar])
                terbesar=i;
        }
        return(terbesar);
    }
    
    public static void maxsort(){
        for(int i=j-1;i>=0;i--){
            int besar=posmax(i);
            if(besar!=i){
                tukardata(besar,i);
            }
            tampilkandata();
        }
    }
    
    public static void tampilkandata(){
        for(int i=0;i<j;i++){
            //System.out.printf("%d %s,",data[i],angka[data[i]]);
            //System.out.printf("%d %s,",i,data[i]);
            System.out.printf("%d ",data[i]);
        }
        System.out.println("");
    }
    
    public static void bubblesort(){
        for(int i=0;i<j-1;i++){
            for(int h=1;h<j;h++){
                if(data[h-1]>data[h]){
                    tukardata(h-1,h);
                }
                tampilkandata();
            }
        }
    }
    
    public static void geser(int awal, int akhir){
        int dt=data[akhir];
        for(int i=akhir;i>awal;i--){
            data[i]=data[i-1];
        }
        data[awal]=dt;
    }
    
    public static void insertsort(){
        for(int i=1;i>j;i++){
            int a=i-1;
            while(data[i]>data[a]&&a>0)a--;
            if(a!=i-1){
                geser(a,i);
            }
        }
    }
    
    public static int caridata(int dt){
        int pos=0;
        while(data[pos]!=dt&&pos<j-1){
            pos++;
        }
        if(data[pos]!=dt) pos=-1;
        return(pos);
    }
    
    public static int caribinary(int dt){
        int atas=j-1;
        int bawah=0;
        int cek=(atas+bawah)/2;
        while(data[cek]!=dt&&bawah<atas){
            if(dt>data[cek]) bawah=cek-1;
            cek=(atas+bawah)/2;
        }
        if(data[cek]!=dt) cek=-1;
        return(cek);
    }
    
    public static void main(String[] args) {
        j=10;
        data=new int[j];
        idx=new int[10];
        //System.out.printf("Jumlah data(max 10):"); j=scn.nextInt();
        acakdata();
        System.out.println("Jumlah data : "+j);
        //System.out.println(data[10]);
        tampilkandata();
        tukardata(0,j-1);
        System.out.println("data sesudah ditukar");
        tampilkandata();
        int min=posmin(0);
        System.out.println("data terkecil : "+data[min]+" posmin "+min);
        int max=posmax(j-1);
        System.out.println("data terbesar: "+data[max]+" posmax "+max);
        System.out.println("data 5 di posisi : "+caridata(5));
        System.out.println("data 10 di posisi : "+caridata(10));
        System.out.println("proses metode min sort");
        minsort();
        System.out.println("data sesudah diurutkan metode min sort");
        tampilkandata();
        System.out.println("data 5 di posisi : "+caribinary(5));
        System.out.println("data 10 di posisi : "+caribinary(10));
        System.out.println("data 5 di posisi : "+cariidx(5));
        System.out.println("data 10 di posisi : "+cariidx(10));
    }
}
