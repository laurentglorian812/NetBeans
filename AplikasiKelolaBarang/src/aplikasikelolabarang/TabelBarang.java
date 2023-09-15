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
public class TabelBarang extends AbstractTableModel {
    private List<DataBarang> list = new ArrayList<DataBarang>();

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKODEBRG();
            case 1:
                return list.get(rowIndex).getNAMA();
            case 2:
                return list.get(rowIndex).getJENIS();
            case 3:
                return list.get(rowIndex).getHARGA_BELI();
            case 4:
                return list.get(rowIndex).getHARGA_JUAL();
            case 5:
                return list.get(rowIndex).getSTOK();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int kolom) {
        switch (kolom) {
            case 0:
                return "KODEBRG";
            case 1:
                return "NAMA";
            case 2:
                return "JENIS";
            case 3:
                return "HARGA_BELI";
            case 4:
                return "HARGA_JUAL";
            case 5:
                return "STOK";
            default:
                return null;
        }
    }

    public void add(DataBarang b) {
        list.add(b);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }

    public void delete(int i, int baris) {
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    
}