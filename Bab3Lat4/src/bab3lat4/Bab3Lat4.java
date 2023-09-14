/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3lat4;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Bab3Lat4 {
    public static ArrayList<data>dt=new ArrayList<data>();
    public static Scanner scn=new Scanner(System.in);
    
    public static void inputdata(){
        String namamk;
        int sks;
        double uts,uas,tugas;
        char tanya;
        System.out.printf("Masukkan nama mata kuliah : ");namamk=scn.next();
        while(!namamk.equalsIgnoreCase("X")){
            System.out.printf("Masukkan jumlah SKS       : ");sks=scn.nextInt();
            System.out.printf("Masukkan nilai UTS        : ");uts=scn.nextDouble();
            System.out.printf("Masukkan nilai UAS        : ");uas=scn.nextDouble();
            System.out.printf("Masukkan nilai Tugas      : ");tugas=scn.nextDouble();
            System.out.printf("Apakah akan disimpan(y/t) ? ");tanya=scn.next().charAt(0);
            if(tanya=='y'){
                dt.add(new data(namamk,sks,uts,uas,tugas));
            }
            System.out.printf("Masukkan nama mata kuliah : ");namamk=scn.next();
        }
    }
    
    public static void outputdata(){
        data tmp;
        int jml[]=new int[5];
        int jmlsks[]=new int[5];
        int bobot=0;
        double na;
        char huruf;
        for(int i=0;i<jml.length;i++){
            jml[i]=0;jmlsks[i]=0;
        }
        System.out.printf("%20s %3s %6s %6s %6s %6s %s\n","NamaMK","SKS","UTS","UAS","TUGAS","NA","HURUF");
        System.out.println("---------------------------------------------------------------------");
        for(int i=0;i<dt.size();i++){
            tmp=dt.get(i);
            na=tmp.getUts()*0.3+tmp.getUas()*0.5+tmp.getTugas()*0.2;
            /*if(na>=85) huruf='A';else
                if(na>=75) huruf='B';else
                    if(na>=60) huruf='C';else
                        if(na>=40) huruf='D';else huruf='E';*/
            huruf=na>=85?'A':na>=75?'B':na>=60?'C':na>=40?'D':'E';
            jml[huruf-'A']++;
            jmlsks[huruf-'A']+=tmp.getSks();
            bobot+=(4-(huruf-'A'))*tmp.getSks();
            System.out.printf("%20s %3d %6.2f %6.2f %6.2f %6.2f %c\n",
                    tmp.getNamamk(),tmp.getSks(),tmp.getUts(),tmp.getUas(),tmp.getTugas(),na,huruf);
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("ipk : %6.2f\n",1.0*bobot/(jmlsks[0]+jmlsks[1]+jmlsks[2]+jmlsks[3]+jmlsks[4]));
        System.out.printf("nilai A/B/C/D/E:%d/%d/%d/%d/%d\n",jml[0],jml[1],jml[2],jml[3],jml[4]);
        System.out.printf("total sks lulus : %d SKS\n",jmlsks[0],jmlsks[1],jmlsks[2]);
        //Tampilkan juga IPK dari mahasiswa tersebut, jumlah masing-masing nilai huruf, total SKS lulus (minimal nilai 'C')
    }
    
    public static void main(String[] args) {
        int pil=0;
        do{
            System.out.println("DAFTAR NILAI");
            System.out.println("1. Input nilai ");
            System.out.println("2. Output nilai ");
            System.out.println("0. Keluar ");
            System.out.println("Jumlah data: "+dt.size());
            System.out.println("Masukan pilihan ");pil=scn.nextInt();
        }while(pil>0);
    }
    
    public static class data{
        String namamk;
        int sks;
        double uts,uas,tugas;
        
        public data(String n,int s,double n1,double n2,double n3){
            namamk=n;
            sks=s;
            uts=n1;
            uas=n2;
            tugas=n3;
        }

        public String getNamamk() {
            return namamk;
        }

        public void setNamamk(String namamk) {
            this.namamk = namamk;
        }

        public int getSks() {
            return sks;
        }

        public void setSks(int sks) {
            this.sks = sks;
        }

        public double getTugas() {
            return tugas;
        }

        public void setTugas(double tugas) {
            this.tugas = tugas;
        }

        public double getUas() {
            return uas;
        }

        public void setUas(double uas) {
            this.uas = uas;
        }

        public double getUts() {
            return uts;
        }

        public void setUts(double uts) {
            this.uts = uts;
        }
    }
}
