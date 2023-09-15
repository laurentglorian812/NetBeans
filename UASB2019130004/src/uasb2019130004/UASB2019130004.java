/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uasb2019130004;
//Nama: Laurent Glorian
//NPM: 2019130004

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UASB2019130004 {
    public static Scanner scn=new Scanner(System.in);
    public static Queue<Integer>dft=new LinkedList<>();
    public static Queue<Integer>wwn=new LinkedList<>();
    public static Queue<Integer>ujn=new LinkedList<>();
    public static Queue<Integer>slk=new LinkedList<>();
    public static LinkedList<Integer>ssw=new LinkedList<>();
    
    public static void pendaftaran(){
        System.out.println("===============================");
        System.out.println("1. Input pendaftaran");
        System.out.println("-------------------------------");
        System.out.println("Isikan tanggal lahir -1 untuk keluar");
        System.out.println("------------------------");
        int tgl=0;
        while(tgl>=0){
            System.out.print("Masukkan tanggal lahir : "); tgl=scn.nextInt();
            if(tgl>=0)
                dft.offer(tgl);
        }
    }
    
    public static void wawancara(){
        System.out.println("===============================");
        System.out.println("2. Proses wawancara");
        System.out.println("-------------------------------");
        if(dft.isEmpty()){
            System.out.println("*kosong*");
        }else{
            wwn.offer(dft.poll());
            System.out.println(wwn+" Memasuki proses wawancara");
        }
    }
    
    public static void ujian(){
        System.out.println("===============================");
        System.out.println("3. Proses ujian");
        System.out.println("-------------------------------");
        if(wwn.isEmpty()){
            System.out.println("*kosong*");
        }else{
            ujn.offer(wwn.poll());
            System.out.println(ujn+" Memasuki proses ujian");
        }
    }
    
    public static void seleksi(){
        System.out.println("===============================");
        System.out.println("4. Proses seleksi");
        System.out.println("-------------------------------");
        if(ujn.isEmpty()){
            System.out.println("*kosong*");
        }else{
            slk.offer(ujn.poll());
            System.out.println(slk+" Memasuki proses seleksi");
        }
    }
    
    public static void siswa(){
        System.out.println("===============================");
        System.out.println("5. Proses menjadi siswa sekolah");
        System.out.println("-------------------------------");
        if(slk.isEmpty()){
            System.out.println("*kosong*");
        }else{
            ssw.add(slk.poll());
            System.out.println(ssw+" Telah menjadi siswa sekolah");
        }
    }
    
    public static void lihatdata(){
        System.out.println("===============================");
        System.out.println("6. Lihat data siswa");
        System.out.println("-------------------------------");
        System.out.println("PENDAFTARAN");
        System.out.println("Isi antrian pendaftaran : "+dft);
        System.out.println("Jumlah antrian pendaftaran : "+dft.size());
        System.out.println("------------------------");
        System.out.println("WAWANCARA");
        System.out.println("Isi antrian wawancara : "+wwn);
        System.out.println("Jumlah antrian wawancara : "+wwn.size());
        System.out.println("------------------------");
        System.out.println("UJIAN");
        System.out.println("Isi antrian ujian : "+ujn);
        System.out.println("Jumlah antrian ujian : "+ujn.size());
        System.out.println("------------------------");
        System.out.println("SELEKSI");
        System.out.println("Isi antrian seleksi : "+slk);
        System.out.println("Jumlah antrian seleksi : "+slk.size());
        System.out.println("------------------------");
        System.out.println("SISWA SEKOLAH");
        System.out.println("Siswa sekolah : "+ssw);
        System.out.println("Jumlah siswa sekolah : "+ssw.size());
    }
    
    public static void main(String[] args) {
        int pilih=0;
        do{
            System.out.println("=====");
            System.out.println("MENU");
            System.out.println("=====");
            System.out.println("1. Input pendaftaran");
            System.out.println("2. Proses wawancara");
            System.out.println("3. Proses ujian");
            System.out.println("4. Proses seleksi");
            System.out.println("5. Proses menjadi siswa sekolah");
            System.out.println("6. Lihat data siswa");
            System.out.println("0. Keluar");
            System.out.printf("Pilihan : "); pilih=scn.nextInt();
            switch(pilih){
                case 1 : pendaftaran(); break;
                case 2 : wawancara(); break;
                case 3 : ujian(); break;
                case 4 : seleksi(); break;
                case 5 : siswa(); break;
                case 6 : lihatdata(); break;
            }
        }while(pilih>0);
    }
}
