
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class SenderTableModel extends AbstractTableModel{
    private static String[] colNames = {};
    private ArrayList<Sender> senderliste = new ArrayList<>();

    public void addSender(Sender s) {
        senderliste.add(s);
        fireTableDataChanged();
    }

    public void updateNumCols(boolean band) {
        if(band == false)
        {
            colNames = new String[2];
        } else{
            colNames = new String[3];
        }

        fireTableStructureChanged();
    }

    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }

    @Override
    public int getRowCount() {
        return senderliste.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Sender s = senderliste.get(row);
        return s;
    }
    
}
