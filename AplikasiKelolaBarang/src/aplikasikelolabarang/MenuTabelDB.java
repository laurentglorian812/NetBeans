package aplikasikelolabarang;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;

/**
 * @author
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class MenuTabelDB extends javax.swing.JFrame {
    public TabelBarang ModelBarang;
    
    public MenuTabelDB() {
        initComponents();

        ModelBarang = new TabelBarang();
        TabBrg.setModel(ModelBarang);

        tampilBarang();
        bersih();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        CbCariBrg = new javax.swing.JComboBox<>();
        TxtCariBrg = new javax.swing.JTextField();
        BtnCariBrg = new javax.swing.JButton();
        BtnHapusBrg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabBrg = new javax.swing.JTable();
        BtnFirstBrg = new javax.swing.JButton();
        BtnPrevBrg = new javax.swing.JButton();
        BtnNextBrg = new javax.swing.JButton();
        BtnLastBrg = new javax.swing.JButton();
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

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setText("Tabel Data Barang");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        CbCariBrg.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        CbCariBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KODEBRG", "NAMA", "JENIS", "HARGA_BELI", "HARGA_JUAL", "STOK" }));
        CbCariBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCariBrgActionPerformed(evt);
            }
        });
        getContentPane().add(CbCariBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, -1, -1));

        TxtCariBrg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtCariBrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCariBrgKeyTyped(evt);
            }
        });
        getContentPane().add(TxtCariBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 60, 380, 29));

        BtnCariBrg.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnCariBrg.setText("Cari");
        BtnCariBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariBrgActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCariBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 61, -1, -1));

        BtnHapusBrg.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnHapusBrg.setText("Hapus");
        BtnHapusBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusBrgActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapusBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 61, -1, -1));

        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        TabBrg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TabBrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "KodeBrg", "Nama", "Jenis", "Harga Beli", "Harga Jual", "Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabBrg.setRowHeight(20);
        jScrollPane1.setViewportView(TabBrg);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 1350, 520));

        BtnFirstBrg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnFirstBrg.setText("I<");
        BtnFirstBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFirstBrgActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFirstBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, -1, -1));

        BtnPrevBrg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnPrevBrg.setText("<");
        BtnPrevBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrevBrgActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPrevBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, -1, -1));

        BtnNextBrg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnNextBrg.setText(">");
        BtnNextBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextBrgActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNextBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 650, -1, -1));

        BtnLastBrg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLastBrg.setText(">I");
        BtnLastBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLastBrgActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLastBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        jBtnBatal.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jBtnBatal.setText("Batal");
        jBtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, -1));

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
        setExtendedState(MenuTabelDB.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void BtnCariBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariBrgActionPerformed
        cariBarang();
    }//GEN-LAST:event_BtnCariBrgActionPerformed

    private void BtnHapusBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusBrgActionPerformed
        boolean c = false;
        
        c = Main.mu.hapus(TabBrg, "BARANGDAGANG", "KODEBRG", c);
        
        if(c == true) {
            tampilBarang();
            bersih();
        }
    }//GEN-LAST:event_BtnHapusBrgActionPerformed

    private void BtnFirstBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFirstBrgActionPerformed
        Main.mu.first(TabBrg);
    }//GEN-LAST:event_BtnFirstBrgActionPerformed

    private void BtnPrevBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrevBrgActionPerformed
        Main.mu.prev(TabBrg);
    }//GEN-LAST:event_BtnPrevBrgActionPerformed

    private void BtnNextBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextBrgActionPerformed
        Main.mu.next(TabBrg);
    }//GEN-LAST:event_BtnNextBrgActionPerformed

    private void BtnLastBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLastBrgActionPerformed
        Main.mu.last(TabBrg);
    }//GEN-LAST:event_BtnLastBrgActionPerformed

    private void jBtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBatalActionPerformed
        TxtCariBrg.setText("");
        tampilBarang();
        bersih();
    }//GEN-LAST:event_jBtnBatalActionPerformed

    private void jMenuTambahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mtambahdb.setVisible(true);
    }//GEN-LAST:event_jMenuTambahDBActionPerformed

    private void jMenuUbahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDBActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mubahdb.setVisible(true);
    }//GEN-LAST:event_jMenuUbahDBActionPerformed

    private void jMenuTabelDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDPActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mtabeldp.setVisible(true);
    }//GEN-LAST:event_jMenuTabelDPActionPerformed

    private void jMenuTambahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDPActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mtambahdp.setVisible(true);
    }//GEN-LAST:event_jMenuTambahDPActionPerformed

    private void jMenuUbahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDPActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mubahdp.setVisible(true);
    }//GEN-LAST:event_jMenuUbahDPActionPerformed

    private void jMenuTabelDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBMActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mtabeldbm.setVisible(true);
    }//GEN-LAST:event_jMenuTabelDBMActionPerformed

    private void jMenuTambahDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBMActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mtambahdbm.setVisible(true);
    }//GEN-LAST:event_jMenuTambahDBMActionPerformed

    private void CbCariBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCariBrgActionPerformed
        if(CbCariBrg.getSelectedIndex() == 0) {
            TxtCariBrg.setText("B");
            TxtCariBrg.grabFocus();
        }
        else {
            TxtCariBrg.setText("");
            TxtCariBrg.grabFocus();
        }
    }//GEN-LAST:event_CbCariBrgActionPerformed

    private void TxtCariBrgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCariBrgKeyTyped
        int idx = CbCariBrg.getSelectedIndex();
        char test = evt.getKeyChar();
        
        if(TxtCariBrg.getText().equals("") && CbCariBrg.getSelectedIndex() == 0) TxtCariBrg.setText("B");
        
        switch(idx) {
            case 0:
                Main.mu.validasiBatas(TxtCariBrg, 9);
                if(!Character.isDigit(test)) evt.consume();
                break;
            case 1:
                Main.mu.validasiBatas(TxtCariBrg, 50);
                if(!Character.isAlphabetic(test) && test != ' ') evt.consume();
                break;
            case 2:
                Main.mu.validasiBatas(TxtCariBrg, 30);
                if(!Character.isAlphabetic(test) && test != ' ') evt.consume();
                break;
            case 3:
            case 4:
                Main.mu.validasiBatas(TxtCariBrg, 15);
                if(!Character.isDigit(test)) evt.consume();
                break;
            case 5:
                Main.mu.validasiBatas(TxtCariBrg, 3);
                if(!Character.isDigit(test)) evt.consume();
                break;
        }
    }//GEN-LAST:event_TxtCariBrgKeyTyped

    private void jMenuTabelDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBActionPerformed
        Main.mtabeldb.setVisible(false);
        Main.mtabeldb.setVisible(true);
    }//GEN-LAST:event_jMenuTabelDBActionPerformed

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
            java.util.logging.Logger.getLogger(MenuTabelDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTabelDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTabelDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTabelDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTabelDB().setVisible(true);
            }
        });
    }
    
    private void bersih() {
        CbCariBrg.setSelectedIndex(0);
        TxtCariBrg.setText("B");
    }
    
    public void tampilBarang() {
        try {
            int baris = TabBrg.getRowCount();
            for (int i = 0; i < baris; i++) {
                ModelBarang.delete(0, baris);
            }
            
            CallableStatement cs = Main.mu.koneksi.prepareCall("{? = call countBARANGDAGANG()}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            int count = cs.getInt(1);
            
            for (int i = 0; i < count; i++) {
                DataBarang b = new DataBarang();
                String kode = "";
                
                cs = Main.mu.koneksi.prepareCall("{? = call get_KODEBRG(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setInt(2, i+1);
                cs.execute();
                kode = cs.getString(1);
                b.setKODEBRG(cs.getString(1));
                
                cs = Main.mu.koneksi.prepareCall("{? = call get_nama(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                b.setNAMA(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_jenis(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, kode);
                cs.execute();
                b.setJENIS(cs.getString(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_hb(?)}");
                cs.registerOutParameter(1, Types.INTEGER);
                cs.setString(2, kode);
                cs.execute();
                b.setHARGA_BELI(cs.getInt(1));

                cs = Main.mu.koneksi.prepareCall("{? = call get_hj(?)}");
                cs.registerOutParameter(1, Types.INTEGER);
                cs.setString(2, kode);
                cs.execute();
                b.setHARGA_JUAL(cs.getInt(1));
                

                cs = Main.mu.koneksi.prepareCall("{? = call get_stok(?)}");
                cs.registerOutParameter(1, Types.INTEGER);
                cs.setString(2, kode);
                cs.execute();
                b.setSTOK(cs.getInt(1));
                
                ModelBarang.add(b);
            }
            
            System.out.println("Berhasil menampilkan isi tabel BARANGDAGANG.");
        } catch(SQLException ex) {
            System.out.println("Kesalahan pada tampilBarang():");
            System.err.print(ex);
        }
    }
    
    private void cariBarang() {
        String txt = TxtCariBrg.getText();
        String ygDicari = CbCariBrg.getSelectedItem().toString();
        int idx = CbCariBrg.getSelectedIndex();
        String sql;
        
        if(idx == 1 || idx == 2) txt = txt.toLowerCase();
        
        if(txt.equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Masukkan data yang dicari.");
            tampilBarang();
        }
        else {
            try {
                int baris = TabBrg.getRowCount();
                for (int i = 0; i < baris; i++) {
                    ModelBarang.delete(0, baris);
                }

                sql = "SELECT * FROM BARANGDAGANG WHERE " + ygDicari + " like '%" + txt + "%'";
                ResultSet rs = Main.mu.script.executeQuery(sql);
                while (rs.next()) {
                    DataBarang b = new DataBarang();
                    b.setKODEBRG(rs.getString(1));
                    b.setNAMA(rs.getString(2));
                    b.setJENIS(rs.getString(3));
                    b.setHARGA_BELI(rs.getInt(4));
                    b.setHARGA_JUAL(rs.getInt(5));
                    b.setSTOK(rs.getInt(6));
                    ModelBarang.add(b);
                }
                
                if(TabBrg.getRowCount() == 0) JOptionPane.showMessageDialog(rootPane,"Tidak ada data.");
                else System.out.println("Berhasil mengeluarkan BARANG yang dicari.");
                bersih();
            } catch (SQLException ex) {
                System.out.println("Kesalahan pada cariBarang():");
                System.err.print(ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCariBrg;
    private javax.swing.JButton BtnFirstBrg;
    private javax.swing.JButton BtnHapusBrg;
    private javax.swing.JButton BtnLastBrg;
    private javax.swing.JButton BtnNextBrg;
    private javax.swing.JButton BtnPrevBrg;
    private javax.swing.JComboBox<String> CbCariBrg;
    private javax.swing.JTable TabBrg;
    private javax.swing.JTextField TxtCariBrg;
    private javax.swing.JButton jBtnBatal;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
