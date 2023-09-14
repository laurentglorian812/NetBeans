/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukatujuh;

/**
 *
 * @author Acer
 */
public class Mahasiswa {
    private int npm;
    private String nama;
    
    public Mahasiswa(int a, String b){
        npm = a;
        nama = b;
    }
    
    public int getNpm(){
        return npm;
    }
    
    public void setNpm(int a){
        npm = a;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String a){
        nama = a;
    }
}
