package aplikasikelolabarang;

import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class MenuTambahDB extends javax.swing.JFrame {
    
    public MenuTambahDB() {
        initComponents();
        
        bersih();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtNamaBrgTambah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtJenisTambah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtHBeliTambah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtHJualTambah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtStokTambah = new javax.swing.JTextField();
        BtnSimpanBrgTambah = new javax.swing.JButton();
        BtnBatalBrgTambah = new javax.swing.JButton();
        TxtKodeBrg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
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
        jLabel8.setText("Tambah Data Barang");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, -1, -1));

        TxtNamaBrgTambah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtNamaBrgTambah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNamaBrgTambahKeyReleased(evt);
            }
        });
        getContentPane().add(TxtNamaBrgTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 600, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Jenis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 304, -1, -1));

        TxtJenisTambah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtJenisTambah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtJenisTambahKeyReleased(evt);
            }
        });
        getContentPane().add(TxtJenisTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 331, 600, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Harga Beli");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        TxtHBeliTambah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtHBeliTambah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtHBeliTambahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtHBeliTambahKeyTyped(evt);
            }
        });
        getContentPane().add(TxtHBeliTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 87, 600, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Harga Jual");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 182, -1, -1));

        TxtHJualTambah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtHJualTambah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtHJualTambahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtHJualTambahKeyTyped(evt);
            }
        });
        getContentPane().add(TxtHJualTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 209, 600, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Stok");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 304, -1, -1));

        TxtStokTambah.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtStokTambah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtStokTambahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtStokTambahKeyTyped(evt);
            }
        });
        getContentPane().add(TxtStokTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 331, 600, 40));

        BtnSimpanBrgTambah.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnSimpanBrgTambah.setText("Simpan");
        BtnSimpanBrgTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanBrgTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSimpanBrgTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1178, 431, -1, -1));

        BtnBatalBrgTambah.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnBatalBrgTambah.setText("Batal");
        BtnBatalBrgTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalBrgTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBatalBrgTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1287, 431, -1, -1));

        TxtKodeBrg.setEditable(false);
        TxtKodeBrg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(TxtKodeBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 600, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setText("Kode Brg");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

    private void TxtNamaBrgTambahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNamaBrgTambahKeyReleased
        Main.mu.validasiBatas(TxtNamaBrgTambah, 50);
    }//GEN-LAST:event_TxtNamaBrgTambahKeyReleased

    private void TxtJenisTambahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtJenisTambahKeyReleased
        Main.mu.validasiBatas(TxtJenisTambah, 30);
    }//GEN-LAST:event_TxtJenisTambahKeyReleased

    private void TxtHBeliTambahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHBeliTambahKeyReleased
        Main.mu.validasiBatas(TxtHBeliTambah, 15);
        int HargaBeli = Integer.parseInt(TxtHBeliTambah.getText());
        int HargaJual = HargaBeli + (20 * HargaBeli / 100);
        TxtHJualTambah.setText(String.valueOf(HargaJual));
    }//GEN-LAST:event_TxtHBeliTambahKeyReleased

    private void TxtHJualTambahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHJualTambahKeyReleased
        Main.mu.validasiBatas(TxtHJualTambah, 15);
    }//GEN-LAST:event_TxtHJualTambahKeyReleased

    private void TxtStokTambahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtStokTambahKeyReleased
        Main.mu.validasiBatas(TxtStokTambah, 3);
    }//GEN-LAST:event_TxtStokTambahKeyReleased

    private void BtnSimpanBrgTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanBrgTambahActionPerformed
        simpanBarang();
    }//GEN-LAST:event_BtnSimpanBrgTambahActionPerformed

    private void BtnBatalBrgTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalBrgTambahActionPerformed
        bersih();
    }//GEN-LAST:event_BtnBatalBrgTambahActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MenuTambahDB.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuTabelDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBActionPerformed
        Main.mtabeldb.setVisible(true);
        Main.mtambahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDBActionPerformed

    private void jMenuTambahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBActionPerformed
        Main.mtambahdb.setVisible(true);
        Main.mtambahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBActionPerformed

    private void jMenuUbahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDBActionPerformed
        Main.mubahdb.setVisible(true);
        Main.mtambahdb.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDBActionPerformed

    private void jMenuTabelDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDPActionPerformed
        Main.mtabeldp.setVisible(true);
        Main.mtambahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDPActionPerformed

    private void jMenuTambahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDPActionPerformed
        Main.mtambahdp.setVisible(true);
        Main.mtambahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDPActionPerformed

    private void jMenuUbahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDPActionPerformed
        Main.mubahdp.setVisible(true);
        Main.mtambahdb.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDPActionPerformed

    private void jMenuTabelDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBMActionPerformed
        Main.mtabeldbm.setVisible(true);
        Main.mtambahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDBMActionPerformed

    private void jMenuTambahDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBMActionPerformed
        Main.mtambahdbm.setVisible(true);
        Main.mtambahdb.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBMActionPerformed

    private void TxtHBeliTambahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHBeliTambahKeyTyped
        char test = evt.getKeyChar();
        if(!Character.isDigit(test)) evt.consume();
    }//GEN-LAST:event_TxtHBeliTambahKeyTyped

    private void TxtHJualTambahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHJualTambahKeyTyped
        char test = evt.getKeyChar();
        if(!Character.isDigit(test)) evt.consume();
    }//GEN-LAST:event_TxtHJualTambahKeyTyped

    private void TxtStokTambahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtStokTambahKeyTyped
        char test = evt.getKeyChar();
        if(!Character.isDigit(test)) evt.consume();
    }//GEN-LAST:event_TxtStokTambahKeyTyped

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
            java.util.logging.Logger.getLogger(MenuTambahDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTambahDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTambahDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTambahDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTambahDB().setVisible(true);
            }
        });
    }
    
    private void bersih() {
        TxtNamaBrgTambah.setText("");
        TxtJenisTambah.setText("");
        TxtHBeliTambah.setText("");
        TxtHJualTambah.setText("");
        TxtStokTambah.setText("");
        int row = Main.mtabeldb.ModelBarang.getRowCount();
        TxtKodeBrg.setText(String.valueOf("B" + String.format("%1$" + 9 +  "s", Main.mu.nextSeq(row)).replace(' ', '0')));
    }
    
    private void simpanBarang() {
        try {
            String NAMA = TxtNamaBrgTambah.getText().toLowerCase();
            String JENIS = TxtJenisTambah.getText().toLowerCase();
            int HARGA_BELI = 0;
            if(!TxtHBeliTambah.getText().equals("")) HARGA_BELI = Integer.parseInt(TxtHBeliTambah.getText());
            int HARGA_JUAL = 0;
            if(!TxtHJualTambah.getText().equals("")) HARGA_JUAL = Integer.parseInt(TxtHJualTambah.getText());
            int STOK = 0;
            if(!TxtHJualTambah.getText().equals("")) STOK = Integer.parseInt(TxtStokTambah.getText());
            
            CallableStatement cs = Main.mu.koneksi.prepareCall("{call insertBARANGDAGANG(?, ?, ?, ?, ?)}");
            cs.setString(1, NAMA);
            cs.setString(2, JENIS);
            cs.setInt(3, HARGA_BELI);
            cs.setInt(4, HARGA_JUAL);
            cs.setInt(5, STOK);
            cs.executeUpdate();
            
            Main.mtabeldb.tampilBarang();
            JOptionPane.showMessageDialog(null, "Barang berhasil disimpan.");
            
            bersih();
        } catch (SQLException ex) {
            System.out.println("Kesalahan pada simpanBarang():");
            System.err.print(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatalBrgTambah;
    private javax.swing.JButton BtnSimpanBrgTambah;
    private javax.swing.JTextField TxtHBeliTambah;
    private javax.swing.JTextField TxtHJualTambah;
    private javax.swing.JTextField TxtJenisTambah;
    private javax.swing.JTextField TxtKodeBrg;
    private javax.swing.JTextField TxtNamaBrgTambah;
    private javax.swing.JTextField TxtStokTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
