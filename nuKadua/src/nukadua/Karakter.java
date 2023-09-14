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
public class Karakter {
    private String nama;
    private int health;
    private Senjata senjata;
    
    public Karakter(int y, String k){
        this.health = y;
        this.nama = k;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int a){
        this.health = a;
    }
    
    public String getNamakarakter(){
        return nama;
    }
    
    public void setNamakarakter(String a){
        this.nama = a;
    }
    
    public Senjata getSenjata(){
        return senjata;
    }
    
    public void setSenjata(Senjata x){
        this.senjata = x;
    }
    
    

}
