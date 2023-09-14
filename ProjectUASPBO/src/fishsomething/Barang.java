package fishsomething;

/**
 *
 * @author Kelompok 3
 */
public class Barang {
    private String kode;
    private String nama;
    private double harga;
    private int jumlah;
    
    public Barang(String k, String n, double h) {
        kode = k;
        nama = n;
        harga = h;
    }
    
    public String getKode() {
        return kode;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int a) {
        jumlah = a;
    }
}
