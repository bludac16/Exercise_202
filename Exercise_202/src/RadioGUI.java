

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class RadioGUI extends javax.swing.JFrame {

   private SenderTableModel stm=new SenderTableModel();
   
    public RadioGUI() {
        initComponents();
        tableRadios.setModel(stm);
        tableRadios.setDefaultRenderer(Object.class, new SenderTableRenderer());
        stm.updateNumCols(true);
        stm.addSender(new Sender("Oe3", 89.2, "FM"));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupSenderliste = new javax.swing.JPopupMenu();
        miHinzufügen = new javax.swing.JMenuItem();
        miBandAnzeigen = new javax.swing.JMenuItem();
        miBandAusblenden = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRadios = new javax.swing.JTable();

        miHinzufügen.setText("Hinzufügen");
        miHinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miHinzufügenActionPerformed(evt);
            }
        });
        popupSenderliste.add(miHinzufügen);

        miBandAnzeigen.setText("Band anzeigen");
        miBandAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBandAnzeigenActionPerformed(evt);
            }
        });
        popupSenderliste.add(miBandAnzeigen);

        miBandAusblenden.setText("Band ausblenden");
        miBandAusblenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBandAusblendenActionPerformed(evt);
            }
        });
        popupSenderliste.add(miBandAusblenden);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setComponentPopupMenu(popupSenderliste);

        tableRadios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableRadios);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miHinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHinzufügenActionPerformed
        SenderDlg dlg = new SenderDlg(this, true);
        dlg.setVisible(true);
        
        if( dlg.isOk() ){
            Sender s = dlg.getS();
            stm.addSender(s);
        }
        dlg.setVisible(false);
    }//GEN-LAST:event_miHinzufügenActionPerformed

    private void miBandAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBandAnzeigenActionPerformed
        stm.updateNumCols(true);
    }//GEN-LAST:event_miBandAnzeigenActionPerformed

    private void miBandAusblendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBandAusblendenActionPerformed
        stm.updateNumCols(false);
    }//GEN-LAST:event_miBandAusblendenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miBandAnzeigen;
    private javax.swing.JMenuItem miBandAusblenden;
    private javax.swing.JMenuItem miHinzufügen;
    private javax.swing.JPopupMenu popupSenderliste;
    private javax.swing.JTable tableRadios;
    // End of variables declaration//GEN-END:variables
}
