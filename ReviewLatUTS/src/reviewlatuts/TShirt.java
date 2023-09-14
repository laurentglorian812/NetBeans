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
public class TShirt {
    private String ukuran;
    
    public TShirt(String a){
        ukuran = a;
    }
    
    public String getUkuran(){
        return ukuran;
    }
    
    public int getHarga(){
        switch(ukuran){
            case "S": return 40000;
            case "M": return 45000;
            case "L": return 50000;
            default: return 60000;
        }
    }
}
