/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanqueue1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LatihanQueue1 {
    public static Scanner scn=new Scanner(System.in);
    public static Queue<String>a=new LinkedList<>();
    
    public static void inputdata(){
        String nama="";
        while(!nama.equalsIgnoreCase("x")){
            System.out.printf("Nama untuk antrian :"); nama=scn.next();
            if(!nama.equalsIgnoreCase("x"))
                a.offer(nama);
        }
    }
    
    public static void proses(){
        if(!a.isEmpty())
            System.out.println(a.poll()+" diproses");
        else
            System.out.println("antrian kosong");
    }
    
    public static void outputdata(){
        System.out.println(a);
        System.out.println("jumlah data : "+a.size());
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
