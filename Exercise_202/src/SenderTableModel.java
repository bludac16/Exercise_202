
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.JTable;
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
    private LinkedList<Sender> senderliste = new LinkedList<>();

    public void addSender(Sender s) {
        senderliste.add(s);
        Collections.sort(senderliste);
        fireTableDataChanged();
    }

    public void updateNumCols(boolean band) {
        if(band == false)
        {
            colNames = new String[2];
            colNames[0] = "Sender";
            colNames[1] = "Frequenz";
        } else{
            colNames = new String[3];
            colNames[0] = "Sender";
            colNames[1] = "Frequenz";
            colNames[2] = "Band";
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
     public void initTable(JTable table, Boolean on)
     {
         if(on == true)
         {
             table.getColumnModel().getColumn(0).setPreferredWidth(150);
             table.getColumnModel().getColumn(1).setPreferredWidth(120);
             table.getColumnModel().getColumn(2).setPreferredWidth(50);
         } else{
             table.getColumnModel().getColumn(0).setPreferredWidth(150);
             table.getColumnModel().getColumn(1).setPreferredWidth(120);
            
         }
     }
}
