/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewlatuts;

/**
 *
 * @author Acer
 */
public class TShirtBerwarna extends TShirt {
    private int warna;
    
    public TShirtBerwarna(String a, int b){
        super(a);
        warna = b;
    }
    
    @Override
    public int getHarga(){
        if(warna==0)
            return (super.getHarga() + 50000);
        else
            return (super.getHarga() + 75000);
    }
    
    public String getWarna(){
        if(warna==0)
            return "Hitam Putih";
        else
            return "Berwana";
    }
}
