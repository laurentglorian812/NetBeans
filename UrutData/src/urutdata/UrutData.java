/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package urutdata;

import java.util.Random;

/**
 *
 * @author Acer
 */
public class UrutData {

    /**
     * @param args the command line arguments
     */
    public static int maxdata=50;
    public static Random ack=new Random();
    public static int[] data=new int[maxdata];
    public static void acakdata(){
        System.out.println("Angka sebelum diurutkan : ");
        for(int i=0;i<maxdata;i++){
            data[i]=ack.nextInt(10);
            System.out.printf("%d",data[i]);
        }
        System.out.println();
    }
    
    public static void tampilkandata(){
        for(int i=0;i<maxdata;i++){
            System.out.printf("%d",data[i]);
        }
        System.out.println();
    }
    
    public static int caridatamin(int m){
        if(m<data.length-1){
            int p=m;
            for(int i=m+1;i<data.length;i++){
                if(data[i]<data[p])
                    p=i;
            }
            return(p);
        }else return(data.length);
    }
    
    public static void tukardata(int p1,int p2){
        int temp=data[p1];
        data[p1]=data[p2];
        data[p2]=temp;
    }
    
    public static void minsort(){
        for(int i=0;i<data.length-1;i++){
            int terkecil=caridatamin(i);
            if(terkecil!=i){
                tukardata(terkecil,i);
            }
        }
    }
    
    public static void main(String[] args) {
        acakdata();
        System.out.println("Angka terlecil (posisi) : "+data[caridatamin(0)]+"("+caridatamin(0)+")");
        tukardata(0,data.length-1);
        System.out.println("Angka sesudah ditukar : ");
        tampilkandata();
        minsort();
        System.out.println("Angka sesudah diurutkan : ");
        tampilkandata();
    }
}
