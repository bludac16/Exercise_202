
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.nio.file.Files;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class SenderTableRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean hasRow, int row, int i) {
        Sender s = (Sender) o;
        JLabel label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 14));
        label.setForeground(Color.LIGHT_GRAY);
        label.setOpaque(true);
        if(s.getBand()=="AM")
        {
            label.setBackground(Color.BLUE);
        } else if(s.getBand()=="FM")
        {
            label.setBackground(Color.RED);
        } else {
            JOptionPane.showMessageDialog(null,"Bitte wähle 'AM' oder 'FM'");
        }
        
        return label;
    }
    
}
