package aplikasikelolabarang;

/**
 * @author
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class DataDBarangMasuk {
    private String KODEBRG, IDBRGMASUK, NAMA;
    int QTY;
    
    public DataDBarangMasuk() {
        
    }

    public String getKODEBRG() {
        return KODEBRG;
    }
    public void setKODEBRG(String a) {
        KODEBRG = a;
    }

    public String getIDBRGMASUK() {
        return IDBRGMASUK;
    }
    public void setIDBRGMASUK(String a) {
        IDBRGMASUK = a;
    }
    
    public String getNAMA() {
        return NAMA;
    }
    public void setNAMA(String a) {
        NAMA = a;
    }

    public int getQTY() {
        return QTY;
    }
    public void setQTY(int a) {
        QTY = a;
    }
}