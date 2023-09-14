/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bab2lat4;

import java.util.Scanner;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class Bab2Lat4 {
    public static Scanner scn=new Scanner(System.in);
    public static pemain dt[]=new pemain[10];
    public static String dtnama[]=new String[10];
    public static String dtlokasi[]=new String[10];
    public static int j=0;
    /**
     * @param args the command line arguments
     */
    public static void inputdata(){
        String nama,lokasi; 
        int x,y;
        System.out.printf("Jumlah data : "); j=scn.nextInt();
        for(int i=0;i<j;i++){
            System.out.printf("nama     : "); nama=scn.next();
            System.out.printf("lokasi   : "); lokasi=scn.next();
            System.out.printf("posisi x : "); x=scn.nextInt();
            System.out.printf("posisi y : "); y=scn.nextInt();
            dt[i]=new pemain(nama,lokasi,x,y);
        } 
    }
    public static void outputdata(){
        System.out.println("NAMA            LOKASI      X   Y");
        for(int i=0;i<j;i++){
            System.out.printf("%10s %10s %3d %3d\n",dt[i].getNama(),
                    dt[i].getLokasi(),dt[i].getX(),dt[i].getY());
        }
    }
    public static void tukardata(int p1, int p2){
        pemain tmp=dt[p1];
        dt[p1]=dt[p2];
        dt[p2]=tmp;
    }
    public static void urutnama(){
        for(int i=0;i<j-1;i++){
            int min=i;
            for(int h=i+1;h<j;h++){
                if(dt[h].getNama().compareTo(dt[min].getNama())<0){
                    min=h;
                }
                if(min!=i){
                    tukardata(min,i);
                }
            }
        }
    }
    public static void urutx(){
        for(int i=0;i<j-1;i++){
            int min=i;
            for(int h=i+1;h<j;h++){
                if(dt[h].getX()<dt[min].getX()){
                    min=h;
                }
                if(min!=i){
                    tukardata(min,i);
                }
            }
        }
    }
    public static int carinama(String nm){
        int hasil=0;
        int i=0;
        while(i<j&&!dt[i].getNama().equalsIgnoreCase(nm)){
            i++;
        }
        if(dt[i].getNama().equalsIgnoreCase(nm)) hasil=i;
        else hasil=-1;
        return(hasil);
    }
    public static void main(String[] args) {
        int pilih=0;
        do{
            System.out.println("MENU");
            System.out.println("-----");
            System.out.println("0. Keluar");
            System.out.println("1. Input Data");
            System.out.println("2. Output Data");
            System.out.println("3. Tukar Data Awal dan Akhir");
            System.out.println("4. Urut Nama");
            System.out.println("5. Urut X");
            System.out.println("6. Cari Nama");
            System.out.println("Pilihan : "); pilih=scn.nextInt();
            switch(pilih){
                case 1 : inputdata();break;
                case 2 : outputdata();break;
                case 3 : tukardata(0,j-1);break;
                case 4 : urutnama();break;
                case 5 : urutx();break;
                case 6 : String cari;
                    System.out.printf("Input nama yang dicari ");cari=scn.next();
                    int p=carinama(cari);
                    if(p>=0){
                        System.out.println(cari+" ketemu di posisi "+(p+1));
                    }else{
                        System.out.println(cari+" tidak ketemu");
                    }break;
            }
        }while(pilih>0);
    }
    public static class pemain{
        public String nama,lokasi;
        public int x,y;
        public pemain(String n,String l,int px,int py){
            nama=n;
            lokasi=l;
            x=px;
            y=py;
        }
        public String getLokasi() {
            return lokasi;
        }
        public void setLokasi(String lokasi) {
            this.lokasi = lokasi;
        }
        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        public int getX() {
            return x;
        }
        public void setX(int x) {
            this.x = x;
        }
        public int getY() {
            return y;
        }
        public void setY(int y) {
            this.y = y;
        }
    }
}
    
