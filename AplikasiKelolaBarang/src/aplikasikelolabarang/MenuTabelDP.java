package aplikasikelolabarang;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;

/**
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class MenuTabelDP extends javax.swing.JFrame {
    public TabelPelanggan ModelPelanggan;
    
    public MenuTabelDP() {
        initComponents();
        
        ModelPelanggan = new TabelPelanggan();
        TabPelanggan.setModel(ModelPelanggan);
        
        tampilPelanggan();
        bersih();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        CbCariPelanggan = new javax.swing.JComboBox<>();
        TxtCariPelanggan = new javax.swing.JTextField();
        BtnCariPelanggan = new javax.swing.JButton();
        BtnHapusPelanggan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabPelanggan = new javax.swing.JTable();
        BtnFirstPelanggan = new javax.swing.JButton();
        BtnPrevPelanggan = new javax.swing.JButton();
        BtnNextPelanggan = new javax.swing.JButton();
        BtnLastPelanggan = new javax.swing.JButton();
        jBtnBatal = new javax.swing.JButton();
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

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setText("Tabel Data Pelanggan");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        CbCariPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        CbCariPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KODEPEL", "NAMA", "ALAMAT_PEL", "KOTA_PEL", "PROV_PEL", "ALAMAT_KIRIM", "KOTA_KIRIM", "PROV_KIRIM", "NO_HP", "NO_WA", "NAMA_PENERIMA" }));
        CbCariPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCariPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(CbCariPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, -1, -1));

        TxtCariPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TxtCariPelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCariPelangganKeyTyped(evt);
            }
        });
        getContentPane().add(TxtCariPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 380, 30));

        BtnCariPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnCariPelanggan.setText("Cari");
        BtnCariPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCariPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        BtnHapusPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnHapusPelanggan.setText("Hapus");
        BtnHapusPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapusPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        TabPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TabPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "KodePel", "Nama", "Alamat Pel", "Kota Pel", "Prov Pel", "Alamat Kirim", "Kota Kirim", "Prov Kirim", "No HP", "No WA", "Nama Penerima"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabPelanggan.setRowHeight(20);
        jScrollPane2.setViewportView(TabPelanggan);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1350, 510));

        BtnFirstPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnFirstPelanggan.setText("I<");
        BtnFirstPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFirstPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFirstPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, -1));

        BtnPrevPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnPrevPelanggan.setText("<");
        BtnPrevPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrevPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPrevPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, -1, -1));

        BtnNextPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnNextPelanggan.setText(">");
        BtnNextPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNextPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, -1, -1));

        BtnLastPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLastPelanggan.setText(">I");
        BtnLastPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLastPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLastPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, -1, -1));

        jBtnBatal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jBtnBatal.setText("Batal");
        jBtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelolabarang/96641.jpg"))); // NOI18N
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

    private void BtnCariPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariPelangganActionPerformed
        cariPelanggan();
    }//GEN-LAST:event_BtnCariPelangganActionPerformed

    private void BtnHapusPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusPelangganActionPerformed
        boolean c = false;
        
        c = Main.mu.hapus(TabPelanggan, "PELANGGAN", "KODEPEL", c);
        
        if(c == true) {
            tampilPelanggan();
            bersih();
        }
    }//GEN-LAST:event_BtnHapusPelangganActionPerformed

    private void BtnFirstPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFirstPelangganActionPerformed
        Main.mu.first(TabPelanggan);
    }//GEN-LAST:event_BtnFirstPelangganActionPerformed

    private void BtnPrevPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrevPelangganActionPerformed
        Main.mu.prev(TabPelanggan);
    }//GEN-LAST:event_BtnPrevPelangganActionPerformed

    private void BtnNextPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextPelangganActionPerformed
        Main.mu.next(TabPelanggan);
    }//GEN-LAST:event_BtnNextPelangganActionPerformed

    private void BtnLastPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLastPelangganActionPerformed
        Main.mu.last(TabPelanggan);
    }//GEN-LAST:event_BtnLastPelangganActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MenuTabelDP.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jBtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBatalActionPerformed
        TxtCariPelanggan.setText("");
        tampilPelanggan();
        bersih();
    }//GEN-LAST:event_jBtnBatalActionPerformed

    private void jMenuTabelDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBActionPerformed
        Main.mtabeldp.setVisible(false);
        Main.mtabeldb.setVisible(true);
    }//GEN-LAST:event_jMenuTabelDBActionPerformed

    private void jMenuTambahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBActionPerformed
        Main.mtabeldp.setVisible(false);
        Main.mtambahdb.setVisible(true);
    }//GEN-LAST:event_jMenuTambahDBActionPerformed

    private void jMenuUbahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDBActionPerformed
        Main.mtabeldp.setVisible(false);
        Main.mubahdb.setVisible(true);
    }//GEN-LAST:event_jMenuUbahDBActionPerformed

    private void jMenuTabelDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDPActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mtabeldp.setVisible(true);
    }//GEN-LAST:event_jMenuTabelDPActionPerformed

    private void jMenuTambahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDPActionPerformed
        Main.mtabeldp.setVisible(false);
        Main.mtambahdp.setVisible(true);
    }//GEN-LAST:event_jMenuTambahDPActionPerformed

    private void jMenuUbahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDPActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mubahdp.setVisible(true);
    }//GEN-LAST:event_jMenuUbahDPActionPerformed

    private void jMenuTabelDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBMActionPerformed
        Main.mtabeldp.setVisible(false);
        Main.mtabeldbm.setVisible(true);
    }//GEN-LAST:event_jMenuTabelDBMActionPerformed

    private void jMenuTambahDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBMActionPerformed
        Main.mtabeldp.setVisible(false);
        Main.mtambahdbm.setVisible(true);
    }//GEN-LAST:event_jMenuTambahDBMActionPerformed

    private void CbCariPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCariPelangganActionPerformed
        if(CbCariPelanggan.getSelectedIndex() == 0) {
            TxtCariPelanggan.setText("P");
            TxtCariPelanggan.grabFocus();
        }
        else {
            TxtCariPelanggan.setText("");
            TxtCariPelanggan.grabFocus();
        }
    }//GEN-LAST:event_CbCariPelangganActionPerformed

    private void TxtCariPelangganKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCariPelangganKeyTyped
        int idx = CbCariPelanggan.getSelectedIndex();
        char test = evt.getKeyChar();
        
        if(TxtCariPelanggan.getText().equals("") && CbCariPelanggan.getSelectedIndex() == 0) TxtCariPelanggan.setText("P");
        
        switch(idx) {
            case 0:
                Main.mu.validasiBatas(TxtCariPelanggan, 9);
                if(!Character.isDigit(test)) evt.consume();
                break;
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                Main.mu.validasiBatas(TxtCariPelanggan, 30);
                break;
            case 2:
            case 5:
                Main.mu.validasiBatas(TxtCariPelanggan, 50);
                break;
        }
    }//GEN-LAST:event_TxtCariPelangganKeyTyped

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
            java.util.logging.Logger.getLogger(MenuTabelDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTabelDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTabelDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTabelDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTabelDP().setVisible(true);
            }
        });
    }
    
    private void bersih() {
        CbCariPelanggan.setSelectedIndex(0);
        TxtCariPelanggan.setText("P");
    }
    
    public void tampilPelanggan() {
        try {
            int baris = TabPelanggan.getRowCount();
            for (int i = 0; i < baris; i++) {
                ModelPelanggan.delete(0, baris);
            }
            
            CallableStatement cs = Main.mu.koneksi.prepareCall("{? = call countPELANGGAN()}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            int count = cs.getInt(1);
            
            for (int i = 0; i < count; i++) {
                DataPelanggan p = new DataPelanggan();
                String kode = "";
                
                cs = Main.mu.koneksi.prepareCall("{? = call get_KODEPEL(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setInt(2, i+1);
                cs.execute();
                kode = cs.getString(1);
                p.setKODEPEL(cs.getString(1));
                
                cs = Main.mu.koneksi.prepareCall("{? = call get_namapel(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setNAMA(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_alamatpel(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setALAMAT_PEL(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_kotapel(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setKOTA_PEL(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_provpel(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setPROV_PEL(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_alamatkirim(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setALAMAT_KIRIM(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_kotakirim(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setKOTA_KIRIM(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_provkirim(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setPROV_KIRIM(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_nohp(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setNO_HP(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_nowa(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setNO_WA(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_namapenerima(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                p.setNAMA_PENERIMA(cs.getString(1));
                
                ModelPelanggan.add(p);
            }
            
            System.out.println("Berhasil menampilkan isi tabel PELANGGAN.");
        } catch(SQLException ex) {
            System.out.println("Kesalahan pada tampilPelanggan():");
            System.err.print(ex);
        }
    }
    
    private void cariPelanggan() {
        String txt = TxtCariPelanggan.getText();
        String ygDicari = CbCariPelanggan.getSelectedItem().toString();
        int idx = CbCariPelanggan.getSelectedIndex();
        String sql;
        
        if(idx != 0 || idx != 8 || idx != 9) txt = Main.mu.kapitalisasi(txt);
        
        if(txt.equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Masukkan data yang dicari.");
            tampilPelanggan();
        }
        else {
            try {
                int baris = TabPelanggan.getRowCount();
                for (int i = 0; i < baris; i++) {
                    ModelPelanggan.delete(0, baris);
                }

                sql = "SELECT * FROM PELANGGAN WHERE " + ygDicari + " like '%" + txt + "%'";
                ResultSet rs = Main.mu.script.executeQuery(sql);
                while (rs.next()) {
                    DataPelanggan p = new DataPelanggan();
                    p.setKODEPEL(rs.getString(1));
                    p.setNAMA(rs.getString(2));
                    p.setALAMAT_PEL(rs.getString(3));
                    p.setKOTA_PEL(rs.getString(4));
                    p.setPROV_PEL(rs.getString(5));
                    p.setALAMAT_KIRIM(rs.getString(6));
                    p.setKOTA_KIRIM(rs.getString(7));
                    p.setPROV_KIRIM(rs.getString(8));
                    p.setNO_HP(rs.getString(9));
                    p.setNO_WA(rs.getString(10));
                    p.setNAMA_PENERIMA(rs.getString(11));
                    ModelPelanggan.add(p);
                }

                System.out.println("Berhasil mengeluarkan PELANGGAN yang dicari.");
                bersih();
            } catch (SQLException ex) {
                System.out.println("Kesalahan pada cariPelanggan():");
                System.err.print(ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCariPelanggan;
    private javax.swing.JButton BtnFirstPelanggan;
    private javax.swing.JButton BtnHapusPelanggan;
    private javax.swing.JButton BtnLastPelanggan;
    private javax.swing.JButton BtnNextPelanggan;
    private javax.swing.JButton BtnPrevPelanggan;
    private javax.swing.JComboBox<String> CbCariPelanggan;
    private javax.swing.JTable TabPelanggan;
    private javax.swing.JTextField TxtCariPelanggan;
    private javax.swing.JButton jBtnBatal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
