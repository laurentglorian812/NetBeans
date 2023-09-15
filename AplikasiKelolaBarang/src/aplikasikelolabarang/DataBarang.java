package aplikasikelolabarang;

/**
 * @author
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class DataBarang {
    private String KODEBRG, NAMA, JENIS;
    private int HARGA_BELI, HARGA_JUAL, STOK;

    public DataBarang() {
        
    }

    public String getKODEBRG() {
        return KODEBRG;
    }
    public void setKODEBRG(String a) {
        KODEBRG = a;
    }

    public String getNAMA() {
        return NAMA;
    }
    public void setNAMA(String a) {
        NAMA = a;
    }

    public String getJENIS() {
        return JENIS;
    }
    public void setJENIS(String a) {
        JENIS = a;
    }
    
    public int getHARGA_BELI() {
        return HARGA_BELI;
    }
    public void setHARGA_BELI(int a) {
        HARGA_BELI = a;
    }
    
    public int getHARGA_JUAL() {
        return HARGA_JUAL;
    }
    public void setHARGA_JUAL(int a) {
        HARGA_JUAL = a;
    }
    
    public int getSTOK() {
        return STOK;
    }
    public void setSTOK(int a) {
        STOK = a;
    }
    
}