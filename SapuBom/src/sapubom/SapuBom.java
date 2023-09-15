/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapubom;

import java.util.Random;

/**
 *
 * @author Acer
 */
public class SapuBom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ack=new Random();
        int jml=ack.nextInt(6)+10;
        int xacak, yacak;
        int peta[][]=new int[9][9];
        for(int i=0;i<9;i++){peta[i]=new int[9];}
        //kode bom = 9
        for(int y=0;y<9;y++){
            for(int x=0;x<9;x++){
                peta[x][y]=0;
            }
        }
        
        for(int j=0;j<jml;j++){
            do{
                xacak=ack.nextInt(9);
                yacak=ack.nextInt(9);
            }while(peta[xacak][yacak]==9);
            peta[xacak][yacak]=9;
        }
        
        for(int y=0;y<9;y++){
            for(int x=0;x<9;x++){
                if(peta[x][y]==9){
                    if(x>0) if(y>0) peta[x-1][y-1]++;
                    if(x>0) peta[x-1][y]++;
                    if(x>0) if(y<8) peta[x-1][y+1]++;
                    if(y>0) peta[x][y-1]++;
                    if(y<8) peta[x][y+1]++;
                    if(x<8) if(y>0) peta[x+1][y-1]++;
                    if(x<8) peta[x+1][y]++;
                    if(x<8) if(y<8) peta[x+1][y+1]++;
                }
            }
        }
        
        for(int y=0;y<9;y++){
            for(int x=0;x<9;x++){
                System.out.printf("%d", peta[x][y]);
            }
            System.out.println();
        } 
        System.out.println("Jumlah bom : " + jml);
    }
    
}
