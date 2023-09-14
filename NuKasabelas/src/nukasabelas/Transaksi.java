/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukasabelas;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Transaksi {
    private int nomor;
    private ArrayList<Ikan> ikans;
    
    public Transaksi(int n){
        nomor = n;
        ikans = new ArrayList();
    }
    
    public int getNomor(){
        return nomor;
    }
    
    public ArrayList<Ikan> getIkans(){
        return ikans;
    }
    
    public double getTagihan(){
        if(ikans.isEmpty())
            return 0;
        else {
            int tot = 0;
            for (int i=0; i < ikans.size(); i++){
                Ikan tmp = ikans.get(i);
                tot += tmp.getHarga();
            }
            return tot;
        }            
    }
    
    public void addIkan(Ikan i){
        ikans.add(i);
    }
}
