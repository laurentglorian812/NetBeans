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
public class Senjata {
    private int damage;
    private String nama;
    
    public Senjata(int x, String s){
        damage = x;
        nama = s;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public void setDamage(int a){
        this.damage = a;
    }
    
    public String getNamasenjata(){
        return nama;
    }
    
    public void setNamasenjata(String a){
        nama = a;
    }
}
