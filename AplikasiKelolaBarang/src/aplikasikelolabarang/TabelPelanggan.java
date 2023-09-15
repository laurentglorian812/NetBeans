package aplikasikelolabarang;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class TabelPelanggan extends AbstractTableModel {
    private List<DataPelanggan> list = new ArrayList<DataPelanggan>();

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKODEPEL();
            case 1:
                return list.get(rowIndex).getNAMA();
            case 2:
                return list.get(rowIndex).getALAMAT_PEL();
            case 3:
                return list.get(rowIndex).getKOTA_PEL();
            case 4:
                return list.get(rowIndex).getPROV_PEL();
            case 5:
                return list.get(rowIndex).getALAMAT_KIRIM();
            case 6:
                return list.get(rowIndex).getKOTA_KIRIM();
            case 7:
                return list.get(rowIndex).getPROV_KIRIM();
            case 8:
                return list.get(rowIndex).getNO_HP();
            case 9:
                return list.get(rowIndex).getNO_WA();
            case 10:
                return list.get(rowIndex).getNAMA_PENERIMA();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int kolom) {
        switch (kolom) {
            case 0:
                return "KODEPEL";
            case 1:
                return "NAMA";
            case 2:
                return "ALAMAT_PEL";
            case 3:
                return "KOTA_PEL";
            case 4:
                return "PROV_PEL";
            case 5:
                return "ALAMAT_KIRIM";
            case 6:
                return "KOTA_KIRIM";
            case 7:
                return "PROV_KIRIM";
            case 8:
                return "NO_HP";
            case 9:
                return "NO_WA";
            case 10:
                return "NAMA_PENERIMA";
            default:
                return null;
        }
    }

    public void add(DataPelanggan p) {
        list.add(p);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }

    public void delete(int i, int baris) {
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    
}