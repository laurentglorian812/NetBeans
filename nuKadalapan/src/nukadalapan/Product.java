/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukadalapan;

/**
 *
 * @author Acer
 */
public class Product {
    private int kode;
    private String nama;
    
    public Product(int a, String b) {
        kode = a;
        nama = b;
    }
    
    public int getKode() {
        return kode;
    }
    
    public void setKode(int a) {
        kode = a;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String b) {
        nama = b;
    }
    
}
