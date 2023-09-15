package aplikasikelolabarang;

/**
 * @author
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class DataSementara {
    private String KODEBRG, NAMA;
    int QTY;

    public DataSementara() {
        
    }

    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getKODEBRG() {
        return KODEBRG;
    }

    public void setKODEBRG(String KODEBRG) {
        this.KODEBRG = KODEBRG;
    }

    public int getQTY() {
        return QTY;
    }

    public void setQTY(int QTY) {
        this.QTY = QTY;
    }
}