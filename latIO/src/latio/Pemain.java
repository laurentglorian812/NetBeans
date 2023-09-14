/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latio;

/**
 *
 * @author Acer
 */
public class Pemain {
    private int idpemain;
    private String nama;
    private String posisi;
    private int skill;
    
    public Pemain(int a, String b, String c, int d){
        idpemain = a;
        nama = b;
        posisi = c;
        skill = d;
    }
    
    public int getIdPemain(){
        return idpemain;
    }
    
    public void setIdPemain(int a){
        idpemain = a;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String b){
        nama = b;
    }
    
    public String getPosisi(){
        return posisi;
    }
    
    public void setPosisi(String c){
        posisi = c;
    }
    
    public int getSkill(){
        return skill;
    }
    
    public void setSkill(int d){
        skill = d;
    }
}
