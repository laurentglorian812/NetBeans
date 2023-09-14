/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materiuts;

/**
 *
 * @author Acer
 */
public class Kaos {
    private String ukuran;
    private int harga;
    
    public Kaos (String a, int b){
        ukuran = a;
        harga = b;
    }
    
    public String getUkuran(){
        return ukuran;
    }
    
    public void setUkuran(String a){
        ukuran = a;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int b){
        harga = b;
    }
}
