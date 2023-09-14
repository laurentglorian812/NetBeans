package fishsomething;

/**
 *
 * @author Kelompok 3
 */
public class Kasir {
    private String id;
    private String nama;
    private String gender;
    private String pw;
    
    public Kasir(String i, String p, String n, String jk) {
        id = i;
        pw = p;
        nama = n;
        gender = jk;
    }
    
    public String getId() {
        return id;
    }
    
    public String getPw() {
        return pw;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getGender() {
        return gender;
    }
}
