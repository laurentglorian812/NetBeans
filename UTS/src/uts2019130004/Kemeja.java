/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2019130004;

/**
 *
 * @author Acer
 */
public class Kemeja {
    private int kode;
    private String nama;
    private int harga;
    
    public Kemeja (int a, String b, int c){
        kode = a;
        nama = b;
        harga = c;
    }
    
    public int getKode(){
        return kode;
    }
    
    public void setKode(int a){
        kode = a;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String b){
        nama = b;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int c){
        harga = c;
    }
}
