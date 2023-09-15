package aplikasikelolabarang;

/**
 * @author
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class Main {
    public static MenuUtama mu = new MenuUtama();
    public static MenuTabelDB mtabeldb = new MenuTabelDB();
    public static MenuTambahDB mtambahdb = new MenuTambahDB();
    public static MenuUbahDB mubahdb = new MenuUbahDB();
    public static MenuTabelDP mtabeldp = new MenuTabelDP();
    public static MenuTambahDP mtambahdp = new MenuTambahDP();
    public static MenuUbahDP mubahdp = new MenuUbahDP();
    public static MenuTabelDBM mtabeldbm = new MenuTabelDBM();
    public static MenuTambahDBM mtambahdbm = new MenuTambahDBM();
    
    public static void main(String[] args) {
        mu.setVisible(true);
        mtabeldb.setVisible(false);
        mtambahdb.setVisible(false);
        mubahdb.setVisible(false);
        mtabeldp.setVisible(false);
        mtambahdp.setVisible(false);
        mubahdp.setVisible(false);
        mtabeldbm.setVisible(false);
        mtambahdbm.setVisible(false);
    }
    
}