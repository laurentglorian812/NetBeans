package fishsomething;

import java.util.ArrayList;

/**
 *
 * @author Kelompok 3
 */
public class Nota {
    private int no = 0;
    private String kasir;
    private ArrayList<Barang> barang;
    static double tot = 0;
    
    public Nota() {
        barang = new ArrayList();
    }
    
    public int getNo() {
        return no;
    }
    public void setNo(int a) {
        no = a;
    }
    
    public String getKasir() {
        return kasir;
    }
    public void setKasir(String a) {
        kasir = a;
    }
    
    public ArrayList getBarang() {
        if(barang.size() > 0) {
            return barang;
        }
        
        return null;
    }
    public void addBarang(Barang a) {
        barang.add(a);
    }
    public void removeBarang() {
        tot = 0;
        barang.clear();
    }
    
    public void getTot() {
        for(int i = 0; i < barang.size(); i++) {
            Barang x = barang.get(i);
            int jum = x.getJumlah();
            double harga = x.getHarga();
            
            tot += (jum * harga);
        }
        
        if(tot > 500000) {
            tot = tot - tot* 5/100;
        }
        else{
            tot = tot;
        }
            
        tot = tot + tot * 10/100;
    }
}
