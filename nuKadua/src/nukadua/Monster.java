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
public class Monster {
    private String nama;
    private int health;
    
    public Monster(int z, String m){
        health = z;
        nama = m;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int a){
        this.health = a;
    }
    
    public String getNamamonster(){
        return nama;
    }
    
    public void setNamamonster(String a){
        this.nama = a;
    }
}
