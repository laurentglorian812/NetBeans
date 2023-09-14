/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohpengkodean;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class ContohPengkodean {
public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        char kode;
        String kkode="pfm";
        String mobil,kmobil[]={"Panther","Feroza","Mercedes"};
        int idx,tarif,biaya,ktarif[]={2000000,3000000,10000000},
                kbiaya[]={300000,500000,1000000};
        LinkedHashMap<String,cmobil> dtmobil=new LinkedHashMap<String,cmobil>();
        dtmobil.put("Panther", new cmobil("Panther",2000000,300000));
        dtmobil.put("Feroza", new cmobil("Feroza",3000000,500000));
        dtmobil.put("Mercedes", new cmobil("Mercedes",10000000,1000000));
        System.out.printf("Masukkan kode mobil (P/F/M) : ");
        kode=scn.next().charAt(0);
        switch(kode){
            case 'p':
            case 'P': mobil="Panther";tarif=2000000;biaya=300000;break;
            case 'f':
            case 'F': mobil="Feroza";tarif=3000000;biaya=500000;break;
            case 'm':
            case 'M': mobil="Mercedes";tarif=10000000;biaya=1000000;break;
            default : mobil="TIDAK ADA";tarif=0;biaya=0;
        }
        System.out.println(mobil+" "+tarif+" "+biaya);
        idx=kkode.indexOf(kode);
        emobil pilihmobil=emobil.gettypebyordinal(idx);
        System.out.println(kmobil[idx]+" "+ktarif[idx]+" "+kbiaya[idx]);
        System.out.println(pilihmobil.toString()+" "+pilihmobil.tarif+" "+pilihmobil.biaya);
        cmobil ambil=dtmobil.get(kmobil[idx]);
        System.out.println(ambil.getNama()+" "+ambil.getTarif()+" "+ambil.getBiaya());
        ambil=dtmobil.get(new String("Panther"));
        System.out.println(ambil.getNama()+" "+ambil.getTarif()+" "+ambil.getBiaya());
    }
    
    public enum emobil{
        PANTHER(2000000,300000),FEROZA(3000000,500000),MERCEDES(10000000,1000000);
        private int tarif, biaya;
        private emobil(int t,int b){tarif=t;biaya=b;}
        public static emobil gettypebyordinal(int o){
            for(emobil m:emobil.values()){
                if(m.ordinal()==o) return (m);
            }
            return null;
        }
    }
    
    public static class cmobil{
        String nama;
        int tarif;
        int biaya;
        public cmobil(String n,int t,int b){
            nama=n;tarif=t;biaya=b;
        }
        public int getBiaya() {
            return biaya;
        }
        public void setBiaya(int biaya) {
            this.biaya = biaya;
        }
        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        public int getTarif() {
            return tarif;
        }
        public void setTarif(int tarif) {
            this.tarif = tarif;
        }
    }
}
