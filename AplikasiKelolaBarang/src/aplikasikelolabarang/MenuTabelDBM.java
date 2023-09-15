package aplikasikelolabarang;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class MenuTabelDBM extends javax.swing.JFrame {
    public TabelMBarangMasuk ModelMMasuk;
    public TabelDBarangMasuk ModelDMasuk;

    public MenuTabelDBM() {
        initComponents();
        
        ModelMMasuk = new TabelMBarangMasuk();
        ModelDMasuk = new TabelDBarangMasuk();
        TabMBarangMasuk.setModel(ModelMMasuk);
        TabDBarangMasuk.setModel(ModelDMasuk);
        
        tampilMMasuk();
        tampilDMasuk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabMBarangMasuk = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabDBarangMasuk = new javax.swing.JTable();
        BtnFirstMMasuk = new javax.swing.JButton();
        BtnPrefMMasuk = new javax.swing.JButton();
        BtnNextMMasuk = new javax.swing.JButton();
        BtnLastMMasuk = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel25.setText("Tabel Barang Masuk");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        TabMBarangMasuk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TabMBarangMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "IDBarangMasuk", "Tanggal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabMBarangMasuk.setRowHeight(20);
        TabMBarangMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabMBarangMasukMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabMBarangMasuk);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 533));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel26.setText("Tabel Detil Barang Masuk");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        TabDBarangMasuk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TabDBarangMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDBarangMasuk", "KodeBrg", "Nama", "Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabDBarangMasuk.setRowHeight(20);
        jScrollPane4.setViewportView(TabDBarangMasuk);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 800, 533));

        BtnFirstMMasuk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnFirstMMasuk.setText("I<");
        BtnFirstMMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFirstMMasukActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFirstMMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, -1, -1));

        BtnPrefMMasuk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnPrefMMasuk.setText("<");
        BtnPrefMMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrefMMasukActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPrefMMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, -1, -1));

        BtnNextMMasuk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnNextMMasuk.setText(">");
        BtnNextMMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextMMasukActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNextMMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, -1, -1));

        BtnLastMMasuk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLastMMasuk.setText(">I");
        BtnLastMMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLastMMasukActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLastMMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, -1, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 610, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelolabarang/96642.jpg"))); // NOI18N
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

    private void BtnFirstMMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFirstMMasukActionPerformed
        Main.mu.first(TabMBarangMasuk);
        filterDMasuk();
    }//GEN-LAST:event_BtnFirstMMasukActionPerformed

    private void BtnPrefMMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrefMMasukActionPerformed
        Main.mu.prev(TabMBarangMasuk);
        filterDMasuk();
    }//GEN-LAST:event_BtnPrefMMasukActionPerformed

    private void BtnNextMMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextMMasukActionPerformed
        Main.mu.next(TabMBarangMasuk);
        filterDMasuk();
    }//GEN-LAST:event_BtnNextMMasukActionPerformed

    private void BtnLastMMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLastMMasukActionPerformed
        Main.mu.last(TabMBarangMasuk);
        filterDMasuk();
    }//GEN-LAST:event_BtnLastMMasukActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MenuTambahDBM.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuTabelDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBActionPerformed
        Main.mtabeldb.setVisible(true);
        Main.mtabeldbm.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDBActionPerformed

    private void jMenuTambahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBActionPerformed
        Main.mtambahdb.setVisible(true);
        Main.mtabeldbm.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBActionPerformed

    private void jMenuUbahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDBActionPerformed
        Main.mubahdb.setVisible(true);
        Main.mtabeldbm.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDBActionPerformed

    private void jMenuTabelDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDPActionPerformed
        Main.mtabeldp.setVisible(true);
        Main.mtabeldbm.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDPActionPerformed

    private void jMenuTambahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDPActionPerformed
        Main.mtambahdp.setVisible(true);
        Main.mtabeldbm.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDPActionPerformed

    private void jMenuUbahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDPActionPerformed
        Main.mubahdp.setVisible(true);
        Main.mtabeldbm.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDPActionPerformed

    private void jMenuTabelDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBMActionPerformed
        Main.mtabeldbm.setVisible(true);
        Main.mtabeldbm.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDBMActionPerformed

    private void jMenuTambahDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBMActionPerformed
        Main.mtambahdbm.setVisible(true);
        Main.mtabeldbm.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBMActionPerformed

    private void TabMBarangMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabMBarangMasukMouseClicked
        filterDMasuk();
    }//GEN-LAST:event_TabMBarangMasukMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampilDMasuk();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuTabelDBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTabelDBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTabelDBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTabelDBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTabelDBM().setVisible(true);
            }
        });
    }
    
    public void tampilMMasuk() {
        try {
            int baris = TabMBarangMasuk.getRowCount();
            for (int i = 0; i < baris; i++) {
                ModelMMasuk.delete(0, baris);
            }
            
            CallableStatement cs = Main.mu.koneksi.prepareCall("{? = call countMBARANGMASUK()}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            int count = cs.getInt(1);
                        
            for (int i = 0; i < count; i++) {
                DataMBarangMasuk m = new DataMBarangMasuk();
                String kode = "";
                
                cs = Main.mu.koneksi.prepareCall("{? = call get_IDBRGMASUK(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setInt(2, i+1);
                cs.execute();
                kode = cs.getString(1);
                m.setIDBRGMASUK(cs.getString(1));
                
                cs = Main.mu.koneksi.prepareCall("{? = call get_Tanggal(?)}");
                cs.registerOutParameter(1, Types.DATE);
                cs.setString(2, kode);
                cs.execute();
                java.sql.Date tanggal = new java.sql.Date(cs.getDate(2).getTime());
                m.setTANGGAL(String.valueOf(tanggal));

                ModelMMasuk.add(m);
            }
                
            System.out.println("Berhasil menampilkan isi tabel MBARANGMASUK.");
        } catch(SQLException ex) {
            System.out.println("Kesalahan pada tampilMMasuk():");
            System.err.print(ex);
        }
    }
    
    public void tampilDMasuk() {
        try {
            int baris = TabDBarangMasuk.getRowCount();
            for (int i = 0; i < baris; i++) {
                ModelDMasuk.delete(0, baris);
            }
            
            String sql = "SELECT * FROM DBARANGMASUK";
            ResultSet rs = Main.mu.script.executeQuery(sql);
            while (rs.next()) {
                DataDBarangMasuk d = new DataDBarangMasuk();
                d.setKODEBRG(rs.getString(1));
                d.setIDBRGMASUK(rs.getString(2));
                
                String sql2 = "SELECT * FROM BARANGDAGANG WHERE KODEBRG = '" + rs.getString(1) + "'";
                ResultSet rs2 = Main.mu.script2.executeQuery(sql2);
                while (rs2.next()) {
                    d.setNAMA(rs2.getString(2));
                    rs2.next();
                }
                
                d.setQTY(rs.getInt(3));
                ModelDMasuk.add(d);
            }
            
            System.out.println("Berhasil menampilkan isi tabel DBARANGMASUK.");
        } catch(SQLException ex) {
            System.out.println("Kesalahan pada tampilDMasuk():");
            System.err.print(ex);
        }
    }
    
    private void filterDMasuk() {
        try {
            int baris = TabDBarangMasuk.getRowCount();
            for (int i = 0; i < baris; i++) {
                ModelDMasuk.delete(0, baris);
            }
            
            String sql = "SELECT * FROM DBARANGMASUK WHERE IDBRGMASUK = '" + (String)TabMBarangMasuk.getValueAt(TabMBarangMasuk.getSelectedRow(), 0) + "'";
            ResultSet rs = Main.mu.script.executeQuery(sql);
            while (rs.next()) {
                DataDBarangMasuk d = new DataDBarangMasuk();
                d.setKODEBRG(rs.getString(1));
                d.setIDBRGMASUK(rs.getString(2));
                
                String sql2 = "SELECT * FROM BARANGDAGANG WHERE KODEBRG = '" + rs.getString(1) + "'";
                ResultSet rs2 = Main.mu.script2.executeQuery(sql2);
                while(rs2.next()){
                    d.setNAMA(rs2.getString(2));
                }
                
                d.setQTY(rs.getInt(3));
                ModelDMasuk.add(d);
            }
            
            System.out.println("Berhasil menampilkan isi tabel DBARANGMASUK.");
        } catch(SQLException ex) {
            System.out.println("Kesalahan pada filterDMasuk():");
            System.err.print(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFirstMMasuk;
    private javax.swing.JButton BtnLastMMasuk;
    private javax.swing.JButton BtnNextMMasuk;
    private javax.swing.JButton BtnPrefMMasuk;
    private javax.swing.JTable TabDBarangMasuk;
    private javax.swing.JTable TabMBarangMasuk;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
