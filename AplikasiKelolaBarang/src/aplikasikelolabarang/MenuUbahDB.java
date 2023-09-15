package aplikasikelolabarang;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class MenuUbahDB extends javax.swing.JFrame {
    
    public MenuUbahDB() {
        initComponents();
        
        Main.mu.DBtoCB(CBKodeBrg);
        bersih();
        CBtoTxt();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtNamaBrgUbah = new javax.swing.JTextField();
        TxtHJualUbah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtHBeliUbah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtJenisUbah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtStokUbah = new javax.swing.JTextField();
        BtnSimpanBrgUbah = new javax.swing.JButton();
        BtnBatalBrgTambah = new javax.swing.JButton();
        CBKodeBrg = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuBarang = new javax.swing.JMenu();
        jMenuDataBarang = new javax.swing.JMenu();
        jMenuTabelDB = new javax.swing.JMenuItem();
        jMenuTambahDB = new javax.swing.JMenuItem();
        jMenuUbahDB = new javax.swing.JMenuItem();
        jMenuPelanggan = new javax.swing.JMenu();
        jMenuDataPelanggan = new javax.swing.JMenu();
        jMenuTabelDP = new javax.swing.JMenuItem();
        jMenuTambahDP = new javax.swing.JMenuItem();
        jMenuUbahDP = new javax.swing.JMenuItem();
        jMenuTransaksi = new javax.swing.JMenu();
        jMenuDataTransaksi = new javax.swing.JMenu();
        jMenuTabelDBM = new javax.swing.JMenuItem();
        jMenuTambahDBM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Ubah Data Barang");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel2.setText("KodeBrg");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, -1, -1));

        TxtNamaBrgUbah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtNamaBrgUbah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNamaBrgUbahKeyReleased(evt);
            }
        });
        getContentPane().add(TxtNamaBrgUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 600, 40));

        TxtHJualUbah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtHJualUbah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtHJualUbahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtHJualUbahKeyTyped(evt);
            }
        });
        getContentPane().add(TxtHJualUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 209, 600, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Harga Jual");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 182, -1, -1));

        TxtHBeliUbah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtHBeliUbah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtHBeliUbahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtHBeliUbahKeyTyped(evt);
            }
        });
        getContentPane().add(TxtHBeliUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 87, 600, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Harga Beli");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Jenis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 304, -1, -1));

        TxtJenisUbah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtJenisUbah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtJenisUbahKeyReleased(evt);
            }
        });
        getContentPane().add(TxtJenisUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 331, 600, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Stok");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 304, -1, -1));

        TxtStokUbah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtStokUbah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtStokUbahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtStokUbahKeyTyped(evt);
            }
        });
        getContentPane().add(TxtStokUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 331, 600, 40));

        BtnSimpanBrgUbah.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnSimpanBrgUbah.setText("Simpan");
        BtnSimpanBrgUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanBrgUbahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSimpanBrgUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1178, 422, -1, -1));

        BtnBatalBrgTambah.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnBatalBrgTambah.setText("Batal");
        BtnBatalBrgTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalBrgTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBatalBrgTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1287, 422, -1, -1));

        CBKodeBrg.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        CBKodeBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBKodeBrgActionPerformed(evt);
            }
        });
        getContentPane().add(CBKodeBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelolabarang/96644.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenuBarang.setText("Barang");
        jMenuBarang.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuDataBarang.setText("Data Barang");
        jMenuDataBarang.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuTabelDB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuTabelDB.setText("Tabel");
        jMenuTabelDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTabelDBActionPerformed(evt);
            }
        });
        jMenuDataBarang.add(jMenuTabelDB);

        jMenuTambahDB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuTambahDB.setText("Tambah");
        jMenuTambahDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTambahDBActionPerformed(evt);
            }
        });
        jMenuDataBarang.add(jMenuTambahDB);

        jMenuUbahDB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuUbahDB.setText("Ubah");
        jMenuUbahDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUbahDBActionPerformed(evt);
            }
        });
        jMenuDataBarang.add(jMenuUbahDB);

        jMenuBarang.add(jMenuDataBarang);

        jMenuBar1.add(jMenuBarang);

        jMenuPelanggan.setText("Pelanggan");
        jMenuPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuDataPelanggan.setText("Data Pelanggan");
        jMenuDataPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuTabelDP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuTabelDP.setText("Tabel");
        jMenuTabelDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTabelDPActionPerformed(evt);
            }
        });
        jMenuDataPelanggan.add(jMenuTabelDP);

        jMenuTambahDP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuTambahDP.setText("Tambah");
        jMenuTambahDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTambahDPActionPerformed(evt);
            }
        });
        jMenuDataPelanggan.add(jMenuTambahDP);

        jMenuUbahDP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuUbahDP.setText("Ubah");
        jMenuUbahDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUbahDPActionPerformed(evt);
            }
        });
        jMenuDataPelanggan.add(jMenuUbahDP);

        jMenuPelanggan.add(jMenuDataPelanggan);

        jMenuBar1.add(jMenuPelanggan);

        jMenuTransaksi.setText("Transaksi");
        jMenuTransaksi.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuDataTransaksi.setText("Data Barang Masuk");
        jMenuDataTransaksi.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuTabelDBM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuTabelDBM.setText("Tabel");
        jMenuTabelDBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTabelDBMActionPerformed(evt);
            }
        });
        jMenuDataTransaksi.add(jMenuTabelDBM);

        jMenuTambahDBM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuTambahDBM.setText("Tambah");
        jMenuTambahDBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTambahDBMActionPerformed(evt);
            }
        });
        jMenuDataTransaksi.add(jMenuTambahDBM);

        jMenuTransaksi.add(jMenuDataTransaksi);

        jMenuBar1.add(jMenuTransaksi);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MenuUbahDB.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void TxtNamaBrgUbahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNamaBrgUbahKeyReleased
        Main.mu.validasiBatas(TxtNamaBrgUbah, 50);
    }//GEN-LAST:event_TxtNamaBrgUbahKeyReleased

    private void TxtHJualUbahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHJualUbahKeyReleased
        Main.mu.validasiBatas(TxtHJualUbah, 15);
    }//GEN-LAST:event_TxtHJualUbahKeyReleased

    private void TxtHBeliUbahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHBeliUbahKeyReleased
        Main.mu.validasiBatas(TxtHBeliUbah, 15);
    }//GEN-LAST:event_TxtHBeliUbahKeyReleased

    private void TxtJenisUbahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtJenisUbahKeyReleased
        Main.mu.validasiBatas(TxtJenisUbah, 30);
    }//GEN-LAST:event_TxtJenisUbahKeyReleased

    private void TxtStokUbahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtStokUbahKeyReleased
        Main.mu.validasiBatas(TxtStokUbah, 3);
    }//GEN-LAST:event_TxtStokUbahKeyReleased

    private void BtnSimpanBrgUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanBrgUbahActionPerformed
        ubahBarang();
    }//GEN-LAST:event_BtnSimpanBrgUbahActionPerformed

    private void BtnBatalBrgTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalBrgTambahActionPerformed
        bersih();
    }//GEN-LAST:event_BtnBatalBrgTambahActionPerformed

    private void jMenuTabelDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBActionPerformed
        Main.mtabeldb.setVisible(true);
        Main.mubahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDBActionPerformed

    private void jMenuTambahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBActionPerformed
        Main.mtambahdb.setVisible(true);
        Main.mubahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBActionPerformed

    private void jMenuUbahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDBActionPerformed
        Main.mubahdb.setVisible(true);
        Main.mubahdb.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDBActionPerformed

    private void jMenuTabelDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDPActionPerformed
        Main.mtabeldp.setVisible(true);
        Main.mubahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDPActionPerformed

    private void jMenuTambahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDPActionPerformed
        Main.mtambahdp.setVisible(true);
        Main.mubahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDPActionPerformed

    private void jMenuUbahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDPActionPerformed
        Main.mubahdp.setVisible(true);
        Main.mubahdb.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDPActionPerformed

    private void jMenuTabelDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBMActionPerformed
        Main.mtabeldbm.setVisible(true);
        Main.mubahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDBMActionPerformed

    private void jMenuTambahDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBMActionPerformed
        Main.mtambahdbm.setVisible(true);
        Main.mubahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBMActionPerformed

    private void TxtHJualUbahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHJualUbahKeyTyped
        char test = evt.getKeyChar();
        if(!Character.isDigit(test)) evt.consume();
    }//GEN-LAST:event_TxtHJualUbahKeyTyped

    private void TxtHBeliUbahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHBeliUbahKeyTyped
        char test = evt.getKeyChar();
        if(!Character.isDigit(test)) evt.consume();
    }//GEN-LAST:event_TxtHBeliUbahKeyTyped

    private void TxtStokUbahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtStokUbahKeyTyped
        char test = evt.getKeyChar();
        if(!Character.isDigit(test)) evt.consume();
    }//GEN-LAST:event_TxtStokUbahKeyTyped

    private void CBKodeBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBKodeBrgActionPerformed
        CBtoTxt();
    }//GEN-LAST:event_CBKodeBrgActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUbahDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUbahDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUbahDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUbahDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUbahDB().setVisible(true);
            }
        });
    }
    
    private void bersih() {
        CBKodeBrg.setSelectedIndex(0);
        TxtNamaBrgUbah.setText("");
        TxtJenisUbah.setText("");
        TxtHBeliUbah.setText("");
        TxtHJualUbah.setText("");
        TxtStokUbah.setText("");
    }
    
    private void CBtoTxt() {
        String kode = CBKodeBrg.getSelectedItem().toString();
        
        try {
            CallableStatement cs = Main.mu.koneksi.prepareCall("{? = call get_nama(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtNamaBrgUbah.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_jenis(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtJenisUbah.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_hb(?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, kode);
            cs.execute();
            TxtHBeliUbah.setText(String.valueOf(cs.getInt(1)));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_hj(?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, kode);
            cs.execute();
            TxtHJualUbah.setText(String.valueOf(cs.getInt(1)));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_stok(?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, kode);
            cs.execute();
            TxtStokUbah.setText(String.valueOf(cs.getInt(1)));
        } catch (SQLException ex) {
            System.out.println("Kesalahan pada CBtoTxt() ubah barang:");
            System.err.print(ex);
        }
    }
    
    private void ubahBarang() {
        int peringatan;
        JTextField[] txtBarang = {TxtNamaBrgUbah, TxtJenisUbah, TxtHBeliUbah, TxtHJualUbah, TxtStokUbah};

        if ((peringatan = JOptionPane.showConfirmDialog(null, "Data akan diubah. Lanjutkan?\n", "Perhatian!", JOptionPane.YES_NO_OPTION)) == 0) {
            try {
                for(int i = 0; i < Main.mtabeldb.ModelBarang.getColumnCount() - 1; i++) {
                    if(!txtBarang[i].getText().equals("")) {
                        CallableStatement cs = Main.mu.koneksi.prepareCall("{call updateBARANGDAGANG(?, ?, ?)}");
                        cs.setString(1, CBKodeBrg.getSelectedItem().toString());
                        cs.setString(2, txtBarang[i].getText());
                        cs.setString(3, Main.mtabeldb.ModelBarang.getColumnName(i+1));
                        cs.execute();
                    }
                }
                Main.mtabeldb.tampilBarang();
                
                JOptionPane.showMessageDialog(null, "Data berhasil diubah.");
                bersih();
            } catch (SQLException ex) {
                System.out.println("Kesalahan pada ubahBarang():");
                System.err.print(ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatalBrgTambah;
    private javax.swing.JButton BtnSimpanBrgUbah;
    private javax.swing.JComboBox<String> CBKodeBrg;
    private javax.swing.JTextField TxtHBeliUbah;
    private javax.swing.JTextField TxtHJualUbah;
    private javax.swing.JTextField TxtJenisUbah;
    private javax.swing.JTextField TxtNamaBrgUbah;
    private javax.swing.JTextField TxtStokUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBarang;
    private javax.swing.JMenu jMenuDataBarang;
    private javax.swing.JMenu jMenuDataPelanggan;
    private javax.swing.JMenu jMenuDataTransaksi;
    private javax.swing.JMenu jMenuPelanggan;
    private javax.swing.JMenuItem jMenuTabelDB;
    private javax.swing.JMenuItem jMenuTabelDBM;
    private javax.swing.JMenuItem jMenuTabelDP;
    private javax.swing.JMenuItem jMenuTambahDB;
    private javax.swing.JMenuItem jMenuTambahDBM;
    private javax.swing.JMenuItem jMenuTambahDP;
    private javax.swing.JMenu jMenuTransaksi;
    private javax.swing.JMenuItem jMenuUbahDB;
    private javax.swing.JMenuItem jMenuUbahDP;
    // End of variables declaration//GEN-END:variables
}
