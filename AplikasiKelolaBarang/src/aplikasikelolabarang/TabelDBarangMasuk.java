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
public class TabelDBarangMasuk extends AbstractTableModel {
    private List<DataDBarangMasuk> list = new ArrayList<DataDBarangMasuk>();

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getIDBRGMASUK();
            case 1:
                return list.get(rowIndex).getKODEBRG();
            case 2:
                return list.get(rowIndex).getNAMA();
            case 3:
                return list.get(rowIndex).getQTY();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int kolom) {
        switch (kolom) {
            case 0:
                return "IDBRGMASUK";
            case 1:
                return "KODEBRG";
            case 2:
                return "NAMA";
            case 3:
                return "QTY";
            default:
                return null;
        }
    }

    public void add(DataDBarangMasuk p) {
        list.add(p);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }

    public void delete(int i, int baris) {
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    
}