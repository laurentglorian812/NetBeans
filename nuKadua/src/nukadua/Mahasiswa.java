/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukadua;

/**
 *
 * @author Acer
 */
public class Mahasiswa {
    private int npm;
    private String nama;
    private String jurusan;
    
    public Mahasiswa(int x, String y){
        npm = x;
        nama = y;
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
    
    public String getJurusan(){
        return jurusan;
    }
    
    public void setJurusan(String a){
        jurusan = a;
    }
    
}
