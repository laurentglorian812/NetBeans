/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Acer
 */
public class Loket {
    private String nama;
    private String posisi;
    
    public Loket(String a, String b){
        nama = a;
        posisi = b;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String a){
        nama = a;
    }
    
    public String getPosisi(){
        return posisi;
    }
    
    public void setPosisi(String b){
        posisi = b;
    }

}
