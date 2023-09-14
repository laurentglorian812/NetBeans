package fishsomething;

/**
 *@author Kelompok 3
 */
public class Ikan extends Barang{
    private String lingkungan;
    
    public Ikan(String k, String n, double h) {
        super(k, n, h);
    }
    
    public void setLingkungan(String a) {
        lingkungan = a;
    }
    public String getLingkungan() {
        return lingkungan;
    }
}
