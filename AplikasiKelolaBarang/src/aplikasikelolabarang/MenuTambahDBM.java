package aplikasikelolabarang;

import java.sql.CallableStatement;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class MenuTambahDBM extends javax.swing.JFrame {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
    private TabelSementara ModelSementara;

    public MenuTambahDBM() {
        initComponents();
        
        ModelSementara = new TabelSementara();
        TabSementara.setModel(ModelSementara);
        
        Main.mu.DBtoCB(CBKodeBrg);
        bersih();
        DCBarangMasuk.setDate(new Date());
        DCBarangMasuk.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DCBarangMasuk = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        TxtQty = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        CBKodeBrg = new javax.swing.JComboBox<>();
        BtnTambahMsk = new javax.swing.JButton();
        BtnBatalMsk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabSementara = new javax.swing.JTable();
        BtnFirstPelanggan = new javax.swing.JButton();
        BtnPrevPelanggan = new javax.swing.JButton();
        BtnNextPelanggan = new javax.swing.JButton();
        BtnLastPelanggan = new javax.swing.JButton();
        BtnSimpanBrgTambah = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtNamaBrg = new javax.swing.JTextField();
        TxtIdBrgMasuk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel27.setText("Tambah Barang Masuk");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Tanggal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, -1, -1));

        DCBarangMasuk.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        getContentPane().add(DCBarangMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 90, 250, 30));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel30.setText("Qty");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        TxtQty.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtQtyKeyTyped(evt);
            }
        });
        getContentPane().add(TxtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 150, 40));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel29.setText("KodeBrg");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        CBKodeBrg.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        CBKodeBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBKodeBrgActionPerformed(evt);
            }
        });
        getContentPane().add(CBKodeBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 250, -1));

        BtnTambahMsk.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnTambahMsk.setText("Tambah");
        BtnTambahMsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahMskActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTambahMsk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 220, -1, -1));

        BtnBatalMsk.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnBatalMsk.setText("Batal");
        BtnBatalMsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalMskActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBatalMsk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 220, -1, -1));

        TabSementara.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TabSementara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "KodeBrg", "Nama", "Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabSementara.setRowHeight(20);
        jScrollPane1.setViewportView(TabSementara);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, 1350, 329));

        BtnFirstPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnFirstPelanggan.setText("I<");
        BtnFirstPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFirstPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFirstPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 963, -1, -1));

        BtnPrevPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnPrevPelanggan.setText("<");
        BtnPrevPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrevPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPrevPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 963, -1, -1));

        BtnNextPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnNextPelanggan.setText(">");
        BtnNextPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNextPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 963, -1, -1));

        BtnLastPelanggan.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLastPelanggan.setText(">I");
        BtnLastPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLastPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLastPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 963, -1, -1));

        BtnSimpanBrgTambah.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnSimpanBrgTambah.setText("Simpan");
        BtnSimpanBrgTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanBrgTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSimpanBrgTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1269, 961, -1, -1));

        BtnHapus.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 620, -1, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 620, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        TxtNamaBrg.setEditable(false);
        getContentPane().add(TxtNamaBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 500, 40));

        TxtIdBrgMasuk.setEditable(false);
        TxtIdBrgMasuk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(TxtIdBrgMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 600, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Id Brg Masuk");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelolabarang/96642.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

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

    private void TxtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtQtyKeyReleased
        Main.mu.validasiBatas(TxtQty, 3);
    }//GEN-LAST:event_TxtQtyKeyReleased

    private void BtnTambahMskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahMskActionPerformed
        barangMasuk();
    }//GEN-LAST:event_BtnTambahMskActionPerformed

    private void BtnBatalMskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalMskActionPerformed
        bersih();
    }//GEN-LAST:event_BtnBatalMskActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MenuTambahDBM.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void BtnFirstPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFirstPelangganActionPerformed
        Main.mu.first(TabSementara);
    }//GEN-LAST:event_BtnFirstPelangganActionPerformed

    private void BtnPrevPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrevPelangganActionPerformed
        Main.mu.prev(TabSementara);
    }//GEN-LAST:event_BtnPrevPelangganActionPerformed

    private void BtnNextPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextPelangganActionPerformed
        Main.mu.next(TabSementara);
    }//GEN-LAST:event_BtnNextPelangganActionPerformed

    private void BtnLastPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLastPelangganActionPerformed
        Main.mu.last(TabSementara);
    }//GEN-LAST:event_BtnLastPelangganActionPerformed

    private void BtnSimpanBrgTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanBrgTambahActionPerformed
        simpanBarang();
    }//GEN-LAST:event_BtnSimpanBrgTambahActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        hapus();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void jMenuTabelDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBActionPerformed
        Main.mtabeldb.setVisible(true);
        Main.mtambahdbm.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDBActionPerformed

    private void jMenuTambahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBActionPerformed
        Main.mtambahdb.setVisible(true);
        Main.mtambahdbm.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBActionPerformed

    private void jMenuUbahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDBActionPerformed
        Main.mubahdb.setVisible(true);
        Main.mtambahdbm.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDBActionPerformed

    private void jMenuTabelDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDPActionPerformed
        Main.mtabeldp.setVisible(true);
        Main.mtambahdbm.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDPActionPerformed

    private void jMenuTambahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDPActionPerformed
        Main.mtambahdp.setVisible(true);
        Main.mtambahdbm.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDPActionPerformed

    private void jMenuUbahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDPActionPerformed
        Main.mubahdp.setVisible(true);
        Main.mtambahdbm.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDPActionPerformed

    private void jMenuTabelDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBMActionPerformed
        Main.mtabeldbm.setVisible(true);
        Main.mtambahdbm.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDBMActionPerformed

    private void jMenuTambahDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBMActionPerformed
        Main.mtambahdbm.setVisible(true);
        Main.mtambahdbm.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBMActionPerformed

    private void CBKodeBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBKodeBrgActionPerformed
        try {
            String KODEBRG = (String)CBKodeBrg.getSelectedItem();
            String NAMA = "";
            
            CallableStatement cs = Main.mu.koneksi.prepareCall("{? = call selectNAMABarang(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, KODEBRG);
            cs.execute();
            
            NAMA = cs.getString(1);
            TxtNamaBrg.setText(NAMA);
        } catch (SQLException ex) {
            System.out.println("Kesalahan pada penampilan nama barang dari kode barang:");
            System.err.print(ex);
        }
    }//GEN-LAST:event_CBKodeBrgActionPerformed

    private void TxtQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtQtyKeyTyped
        char test = evt.getKeyChar();
        if(!Character.isDigit(test)) evt.consume();
    }//GEN-LAST:event_TxtQtyKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        simpanBarang();
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
            java.util.logging.Logger.getLogger(MenuTambahDBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTambahDBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTambahDBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTambahDBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTambahDBM().setVisible(true);
            }
        });
    }
    
    private void bersih() {
        TxtQty.setText("");
        CBKodeBrg.setSelectedIndex(0);
        int row = Main.mtabeldbm.ModelMMasuk.getRowCount();
        TxtIdBrgMasuk.setText(String.valueOf("MB" + String.format("%1$" + 8 +  "s", Main.mu.nextSeq(row)).replace(' ', '0')));
    }
    
    private void barangMasuk() {
        try {
            String KODEBRG =(String)CBKodeBrg.getSelectedItem();
            String NAMA = "";
            
            CallableStatement cs = Main.mu.koneksi.prepareCall("{? = call selectNAMABarang(?)}");
            cs.setString(1, NAMA);
            cs.setString(2, KODEBRG);
            cs.execute();

            int QTY = 0;
            if(!TxtQty.getText().equals("")) QTY = Integer.parseInt(TxtQty.getText());

            DataSementara s = new DataSementara();
            s.setKODEBRG(KODEBRG);
            s.setNAMA(NAMA);
            s.setQTY(QTY);
            ModelSementara.add(s);

            DCBarangMasuk.setEnabled(false);
            bersih();
        } catch (SQLException ex) {
            System.out.println("Kesalahan pada barangMasuk():");
            System.err.print(ex);
        }
    }
    
    private void hapus() {
        int barisDipilih = TabSementara.getSelectedRow();
        
        if (barisDipilih >= 0) {
            ModelSementara.delete(barisDipilih, 0);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
        } else {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang dipilih.");
        }
    }
    
    private void simpanBarang() {
        String TANGGAL = String.valueOf(sdf.format(DCBarangMasuk.getDate()));
        
        try {
            CallableStatement cs = Main.mu.koneksi.prepareCall("{call insertMBARANGMASUK(?)}");
            cs.setString(1, TANGGAL);
            cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Kesalahan pada simpanBarang() 1:");
            System.err.print(ex);
        }
        
        String IDBRGMASUK = TxtIdBrgMasuk.getText();
        for(int row = 0, rows = TabSementara.getRowCount(); row<rows; row++)
        {
            String KODEBRG = (String)TabSementara.getValueAt(row, 0);
            int QTY = (int)TabSementara.getValueAt(row, 2);
            try {
                CallableStatement cs = Main.mu.koneksi.prepareCall("{call updateStok(?, ?)}");
                cs.setString(1, KODEBRG);
                cs.setInt(2, QTY);
                cs.executeUpdate();
                
                cs = Main.mu.koneksi.prepareCall("{call insertDBARANGMASUK(?, ?, ?)}");
                cs.setString(1, KODEBRG);
                cs.setString(2, IDBRGMASUK);
                cs.setInt(3, QTY);
                cs.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("Kesalahan pada simpanBarang() 2:");
                System.err.print(ex);
            }
        }
        
        int baris = TabSementara.getRowCount();
        for (int i = 0; i < baris; i++) {
            ModelSementara.delete(0, baris);
        }
                
        DCBarangMasuk.setDate(new Date());
        DCBarangMasuk.setEnabled(true);
        Main.mtabeldb.tampilBarang();
        Main.mtabeldbm.tampilMMasuk();
        Main.mtabeldbm.tampilDMasuk();
        bersih();
        JOptionPane.showMessageDialog(null, "Transaksi barang masuk berhasil disimapn.");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatalMsk;
    private javax.swing.JButton BtnFirstPelanggan;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnLastPelanggan;
    private javax.swing.JButton BtnNextPelanggan;
    private javax.swing.JButton BtnPrevPelanggan;
    private javax.swing.JButton BtnSimpanBrgTambah;
    private javax.swing.JButton BtnTambahMsk;
    private javax.swing.JComboBox<String> CBKodeBrg;
    private com.toedter.calendar.JDateChooser DCBarangMasuk;
    private javax.swing.JTable TabSementara;
    private javax.swing.JTextField TxtIdBrgMasuk;
    private javax.swing.JTextField TxtNamaBrg;
    private javax.swing.JTextField TxtQty;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
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
