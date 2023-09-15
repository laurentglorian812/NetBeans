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
public class TabelMBarangMasuk extends AbstractTableModel {
    private List<DataMBarangMasuk> list = new ArrayList<DataMBarangMasuk>();

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getIDBRGMASUK();
            case 1:
                return list.get(rowIndex).getTANGGAL();
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
                return "TANGGAL";
            default:
                return null;
        }
    }

    public void add(DataMBarangMasuk p) {
        list.add(p);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }

    public void delete(int i, int baris) {
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    
}