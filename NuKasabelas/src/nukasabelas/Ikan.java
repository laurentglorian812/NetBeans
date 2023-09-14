/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukasabelas;

/**
 *
 * @author Acer
 */
public class Ikan {
    private String jenis, lingkungan, asal;
    private int harga;
    
    public Ikan(String j, String l, String a, int h){
        jenis = j;
        lingkungan = l; 
        asal = a;
        harga = h;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public String getLingkungan(){
        return lingkungan;
    }
    
    public String getAsal(){
        return asal;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int h){
        harga = h;
    }
}
