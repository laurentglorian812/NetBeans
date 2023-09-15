/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Random;

public class LatihanUAS {
    static class Nasabah{
        String norek;
        char jenis;
        int jml;
        public Nasabah(String nom,char jns,int j){
            norek=nom; jenis=jns; jml=j;
        }
        public char getJenis() {
            return jenis;
        }
        public void setJenis(char jenis) {
            this.jenis = jenis;
        }
        public int getJml() {
            return jml;
        }
        public void setJml(int jml) {
            this.jml = jml;
        }
        public String getNorek() {
            return norek;
        }
        public void setNorek(String norek) {
            this.norek = norek;
        }
    }
    
    public static final int maxantri=10;
    
    public static Queue<Nasabah> a1=new LinkedList<>();
    public static Queue<Nasabah> a2=new LinkedList<>();
    public static Queue<Nasabah> a3=new LinkedList<>();
    public static Nasabah t1;
    public static Nasabah t2;
    public static LinkedList<Nasabah> dt=new LinkedList<>();
    public static Scanner scn=new Scanner(System.in);
    public static Random ack=new Random();
    
    public static void inputdata(){
        String nom="";
        char tran,bawa;
        int jum;
        while(!nom.equalsIgnoreCase("x")&&a3.size()<maxantri){
            System.out.println("Isi nomor rekening x untuk keluar");
            System.out.print("Nomor rekening : "); nom=scn.next();
            if(!nom.equalsIgnoreCase("x")){
                System.out.print("Jenis transaksi (Ambil/Setor/Transfer) : ");
                tran=scn.next().charAt(0);
                System.out.print("Jumlah uang transaksi : "); jum=scn.nextInt();
                System.out.printf("Bawa buku rekening (y/t) : ");
                bawa=scn.next().charAt(0);
                if(bawa=='y'){
                    if(a1.size()<maxantri)
                        a1.offer(new Nasabah(nom,tran,jum));
                    else if(a2.size()<maxantri)
                        a2.offer(new Nasabah(nom,tran,jum));
                    else if(a3.size()<maxantri)
                        a3.offer(new Nasabah(nom,tran,jum));
                }
            }
        }
        if(a3.size()>=maxantri)
            System.out.println("Semua antrian sudah penuh");
    }
    
    public static void proses(){
        if(a1.isEmpty())
            System.out.println("Semua antrian kosong");
        else{
            int pil=ack.nextInt(2);
            switch(pil){
                case 0 : t1=a1.poll();dt.add(t1); break;
                case 1 : t2=a1.poll();dt.add(t2); break;
            }
            if(!a2.isEmpty()){
                a1.offer(a2.poll());
                if(!a3.isEmpty())
                    a2.offer(a3.poll());
            }
        } 
    }
    
    public static void outputdata(){
        System.out.println("Isi antrian");
        if(a1.isEmpty())
            System.out.println("Antrian 1 kosong");
        else{
            Queue<Nasabah> smt=new LinkedList<>();
            smt.addAll(a1);
            while(!smt.isEmpty()){
                Nasabah smt2=smt.poll();
                System.out.println(smt2.getNorek()+" "+smt2.getJenis()+" "+smt2.getJml());
            }
        }
        if(a2.isEmpty())
            System.out.println("Antrian 2 kosong");
        else{
            Queue<Nasabah> smt=new LinkedList<>();
            smt.addAll(a2);
            while(!smt.isEmpty()){
                Nasabah smt2=smt.poll();
                System.out.println(smt2.getNorek()+" "+smt2.getJenis()+" "+smt2.getJml());
            }
        }
        if(a3.isEmpty())
            System.out.println("Antrian 3 kosong");
        else{
            Queue<Nasabah> smt=new LinkedList<>();
            smt.addAll(a3);
            while(!smt.isEmpty()){
                Nasabah smt2=smt.poll();
                System.out.println(smt2.getNorek()+" "+smt2.getJenis()+" "+smt2.getJml());
            }
        }
        System.out.println("Teller 1");
        if(t1!=null)
            System.out.println(t1.getNorek()+" "+t1.getJenis()+" "+t1.getJml());
        System.out.println("Teller 2");
        if(t2!=null)
            System.out.println(t2.getNorek()+" "+t2.getJenis()+" "+t2.getJml());
        if(dt.isEmpty())
            System.out.println("Data kosong");
        else{
            System.out.println("Data yang sudah diproses");
            System.out.println("NoRekening      Jenis       Jumlah");
            for(int i=0;i<dt.size();i++){
                System.out.println(dt.get(i).getNorek()+" "+dt.get(i).getJenis()+" "+dt.get(i).getJml());
            }
        }
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
