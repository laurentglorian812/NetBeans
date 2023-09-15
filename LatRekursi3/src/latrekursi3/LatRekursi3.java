/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latrekursi3;
import java.util.Random;

public class LatRekursi3 {
    public static Random ack=new Random();
    public static int labirin[]=new int[15];
    //arah 0=atas, 1=bawah, 2=kiri, 3=kanan
    public static int balik[]={1,0,3,2};
    public static String arah[]={"atas","bawah","kiri","kanan"};
    public static int langkah=0;
    public static void acaklabirin(int a,int l){
        if(l<15){
            int arah=ack.nextInt(4);
            if(l>0){
                while(arah==balik[a]){
                    arah=ack.nextInt(4);
                }
            }
            labirin[l]=arah;
            acaklabirin(arah,l+1);
        }
        
    }
    
    public static void main(String[] args) {
        acaklabirin(0,0);
        System.out.println("START");
        for(int i=0;i<15;i++){
            System.out.println((i+1)+" "+arah[labirin[i]]);
        }
        System.out.println("FINISH");
    }
}
