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
public class TabelSementara extends AbstractTableModel {
    private List<DataSementara> list = new ArrayList<DataSementara>();

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKODEBRG();
            case 1:
                return list.get(rowIndex).getNAMA();
            case 2:
                return list.get(rowIndex).getQTY();
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
                return "QTY";
            default:
                return null;
        }
    }

    public void add(DataSementara s) {
        list.add(s);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }

    public void delete(int i, int baris) {
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    
}