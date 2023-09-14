/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohlist;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ContohList {
    //public static LinkedList<Integer>dt=new LinkedList<Integer>();
    public static Vector<Integer>dt=new Vector<Integer>();
    //public static ArrayList<Integer>dt=new ArrayList<Integer>();
    public static Random ack=new Random();
    public static Scanner scn=new Scanner(System.in);
    public static int jml=30;
    /**
     * @param args the command line arguments
     */
    public static void acakdata(){
        for(int i=0;i<jml;i++){
            dt.add(new Integer(ack.nextInt(10)));
        }
    }
    public static void tampildata(){
        System.out.println(dt);
    }
    public static void hapusdata(Integer h){
        dt.remove(dt.indexOf(h));
    }
    public static void caridata(Integer h){
        System.out.println("data "+h+" ada di "+dt.indexOf(h));
    }
    public static void ubahdata(Integer o,Integer n){
        dt.set(dt.indexOf(o), n);
    }
    public static void tambahdata(int j){
        for(int i=0;i<j;i++){
            dt.add(new Integer(ack.nextInt(10)));
        }
        jml+=j;
    }
    public static void sisipdata(Integer o,Integer n){
        int p=dt.indexOf(o);
        if(p<jml-1){
            dt.add(p+1,n);
        }else{
            dt.add(n);
        }
    }
    public static void main(String[] args) {
        int pil=0;
        int d=0;
        int o=0;
        do{
            System.out.println("Menu ");
            System.out.println("1. Input data ");
            System.out.println("2. Output data ");
            System.out.println("3. Hapus data ");
            System.out.println("4. Cari data ");
            System.out.println("5. Ubah data ");
            System.out.println("6. Tambah data ");
            System.out.println("7. Sisip data ");
            System.out.println("8. Hilang data ");
            System.out.println("9. Periksa data ");
            System.out.println("0. Keluar ");
            System.out.println("Jumlah data: "+dt.size());
            System.out.println("Masukan pilihan ");pil=scn.nextInt();
            switch(pil){
                case 1 :acakdata();break;
                case 2 :System.out.println("Isi data: ");
                        tampildata();break;
                case 3 :System.out.printf("Data yang akan dihapus : ");
                        d=scn.nextInt();
                        hapusdata(d);break;
                case 4 :System.out.printf("Data yang akan dicari : ");
                        d=scn.nextInt();
                        caridata(d);break;
                case 5 :System.out.printf("Data yang akan diubah : ");
                        d=scn.nextInt();
                        if(dt.contains(d)){
                            System.out.printf("Data yang baru : ");
                            o=scn.nextInt();
                            ubahdata(d,0);
                        }break;
                case 6 :System.out.printf("Jumlah data : ");
                        d=scn.nextInt();
                        tambahdata(d);break;
                case 7 :System.out.printf("Data yang akan disisip : ");
                        d=scn.nextInt();
                        if(dt.contains(d)){
                            System.out.printf("Data yang baru : ");
                            o=scn.nextInt();
                            sisipdata(d,o);
                        }break;
                case 8 :dt.clear();break;
                case 9 :System.out.printf("Posisi data yang akan diperiksa : ");
                        d=scn.nextInt();
                        if(d<jml){
                            System.out.println(dt.get(d));
                        }else{
                            System.out.println("melebihi jumlah");
                        }break;
            }
        }while(pil>0);
    }
}
