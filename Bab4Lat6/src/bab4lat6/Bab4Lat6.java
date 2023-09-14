/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4lat6;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Bab4Lat6 {
    public static Scanner scn=new Scanner(System.in);
    public static LinkedList<data> dt=new LinkedList<data>();
    
    
    public static void tambah(){
        String nomor,brg;
        int jml,hrg;
        char tanya;
        do{
            System.out.printf("Masukkan no bayar (keluar 0) : ");
            nomor=scn.next();
            if(!nomor.equals("0")){
                System.out.printf("Masukkan nama barang : ");
                brg=scn.next();
                System.out.printf("Masukkan jumlah      : ");
                jml=scn.nextInt();
                System.out.printf("Masukkan harga       : ");
                hrg=scn.nextInt();
                System.out.printf("Mau masuk antrian?");
                tanya=scn.next().charAt(0);
                if(tanya=='y'){
                    dt.offer(new data(nomor,brg,jml,hrg));
                }
            }
        }while(!nomor.equals("0"));
    }
    
    public static void tampil(){
        int i=0;
        data tmp;
        System.out.println("No bayar    Barang    Jumlah    Harga    Bayar");
        do{
            if(dt.size()>0){
                tmp=dt.get(i);
                System.out.printf("%10s %10s %8d %7d %8d\n",
                        tmp.getNobayar(),tmp.getBarang(),tmp.getJumlah(),
                        tmp.getHarga(),tmp.hitungbayar());
                i++;
            }
        }while(i<dt.size());
    }
    
    public static void proses(){
        data tmp;
        if(dt.size()>0){
            tmp=dt.poll();
            System.out.println(tmp.getNobayar()+" sudah diproses");
        }else{
            System.out.println("tidak ada data ");
        }
    }
    
    public static void main(String[] args) {
        int pilih=0;
        do{
            System.out.println("Menu");
            System.out.println("1.Tambah antrian");
            System.out.println("2.Tampilkan antrian");
            System.out.println("3.Proses antrian");
            System.out.println("0.Keluar");
            System.out.printf("Pilihan : ");pilih=scn.nextInt();
            switch(pilih){
                case 1 : tambah();break;
                case 2 : tampil();break;
                case 3 : proses();break;
            }
        }while(pilih>0);
    }
    
    public static class data{
        String nobayar, barang;
        int jumlah,harga;
        
        public int hitungbayar(){
            return(jumlah*harga);
        }
        
        public data(String nomor,String brg,int jml,int hrg){
            nobayar=nomor;
            barang=brg;
            jumlah=jml;
            harga=hrg;
        }

        public String getBarang() {
            return barang;
        }

        public void setBarang(String barang) {
            this.barang = barang;
        }

        public int getHarga() {
            return harga;
        }

        public void setHarga(int harga) {
            this.harga = harga;
        }

        public int getJumlah() {
            return jumlah;
        }

        public void setJumlah(int jumlah) {
            this.jumlah = jumlah;
        }

        public String getNobayar() {
            return nobayar;
        }

        public void setNobayar(String nobayar) {
            this.nobayar = nobayar;
        }
    }
}
