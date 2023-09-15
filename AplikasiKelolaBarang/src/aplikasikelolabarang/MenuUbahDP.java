package aplikasikelolabarang;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 2019130032 - Fedora Yoshe Juandy
 * 2019130004 - Laurent Glorian
 * 2019130011 - Regina Viola Mauretha
 */
public class MenuUbahDP extends javax.swing.JFrame {
    public Statement script;
    
    public MenuUbahDP() {
        initComponents();
        
        DBtoCB();
        bersih();
        CBtoTxt();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtAlamatKirim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtNama = new javax.swing.JTextField();
        TxtKotaKirim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtAlamatPel = new javax.swing.JTextField();
        TxtProvKirim = new javax.swing.JTextField();
        TxtKotaPel = new javax.swing.JTextField();
        TxtNoHP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtProvPel = new javax.swing.JTextField();
        TxtNoWA = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtNamaPenerima = new javax.swing.JTextField();
        BtnSimpanBrgTambah = new javax.swing.JButton();
        BtnBatalBrgTambah = new javax.swing.JButton();
        CBKodePel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenuBarang2 = new javax.swing.JMenu();
        jMenuDataBarang2 = new javax.swing.JMenu();
        jMenuTabelDB2 = new javax.swing.JMenuItem();
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
        jLabel8.setText("Ubah Data Pelanggan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("KodePel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Alamat Kirim");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        TxtAlamatKirim.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtAlamatKirim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtAlamatKirimKeyReleased(evt);
            }
        });
        getContentPane().add(TxtAlamatKirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 87, 600, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Kota Kirim");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 145, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, -1));

        TxtNama.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNamaKeyReleased(evt);
            }
        });
        getContentPane().add(TxtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 600, 40));

        TxtKotaKirim.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtKotaKirim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtKotaKirimKeyReleased(evt);
            }
        });
        getContentPane().add(TxtKotaKirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 172, 600, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Alamat Pel");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Prov Kirim");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, -1, -1));

        TxtAlamatPel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtAlamatPel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtAlamatPelKeyReleased(evt);
            }
        });
        getContentPane().add(TxtAlamatPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 600, 40));

        TxtProvKirim.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtProvKirim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtProvKirimKeyReleased(evt);
            }
        });
        getContentPane().add(TxtProvKirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 257, 600, 40));

        TxtKotaPel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtKotaPel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtKotaPelKeyReleased(evt);
            }
        });
        getContentPane().add(TxtKotaPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 342, 600, 40));

        TxtNoHP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtNoHP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNoHPKeyReleased(evt);
            }
        });
        getContentPane().add(TxtNoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 342, 600, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel12.setText("No HP");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 315, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel11.setText("Kota Pel");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 315, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setText("Prov Pel");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel13.setText("No WA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, -1, -1));

        TxtProvPel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtProvPel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtProvPelKeyReleased(evt);
            }
        });
        getContentPane().add(TxtProvPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 427, 600, 40));

        TxtNoWA.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtNoWA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNoWAKeyReleased(evt);
            }
        });
        getContentPane().add(TxtNoWA, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 427, 600, 40));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel14.setText("Nama Penerima");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 485, -1, -1));

        TxtNamaPenerima.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtNamaPenerima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNamaPenerimaKeyReleased(evt);
            }
        });
        getContentPane().add(TxtNamaPenerima, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 512, 600, 40));

        BtnSimpanBrgTambah.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnSimpanBrgTambah.setText("Simpan");
        BtnSimpanBrgTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanBrgTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSimpanBrgTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1178, 570, -1, -1));

        BtnBatalBrgTambah.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        BtnBatalBrgTambah.setText("Batal");
        BtnBatalBrgTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalBrgTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBatalBrgTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1287, 570, -1, -1));

        CBKodePel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        CBKodePel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBKodePelActionPerformed(evt);
            }
        });
        getContentPane().add(CBKodePel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelolabarang/96641.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenuBarang2.setText("Barang");
        jMenuBarang2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuDataBarang2.setText("Data Barang");
        jMenuDataBarang2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuTabelDB2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuTabelDB2.setText("Tabel");
        jMenuTabelDB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTabelDB2ActionPerformed(evt);
            }
        });
        jMenuDataBarang2.add(jMenuTabelDB2);

        jMenuTambahDB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuTambahDB.setText("Tambah");
        jMenuTambahDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTambahDBActionPerformed(evt);
            }
        });
        jMenuDataBarang2.add(jMenuTambahDB);

        jMenuUbahDB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuUbahDB.setText("Ubah");
        jMenuUbahDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUbahDBActionPerformed(evt);
            }
        });
        jMenuDataBarang2.add(jMenuUbahDB);

        jMenuBarang2.add(jMenuDataBarang2);

        jMenuBar3.add(jMenuBarang2);

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

        jMenuBar3.add(jMenuPelanggan);

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

        jMenuBar3.add(jMenuTransaksi);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAlamatKirimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAlamatKirimKeyReleased
        Main.mu.validasiBatas(TxtAlamatKirim, 50);
    }//GEN-LAST:event_TxtAlamatKirimKeyReleased

    private void TxtNamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNamaKeyReleased
        Main.mu.validasiBatas(TxtNama, 30);
    }//GEN-LAST:event_TxtNamaKeyReleased

    private void TxtKotaKirimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtKotaKirimKeyReleased
        Main.mu.validasiBatas(TxtKotaKirim, 30);
    }//GEN-LAST:event_TxtKotaKirimKeyReleased

    private void TxtAlamatPelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAlamatPelKeyReleased
        Main.mu.validasiBatas(TxtAlamatPel, 50);
    }//GEN-LAST:event_TxtAlamatPelKeyReleased

    private void TxtProvKirimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtProvKirimKeyReleased
        Main.mu.validasiBatas(TxtProvKirim, 30);
    }//GEN-LAST:event_TxtProvKirimKeyReleased

    private void TxtKotaPelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtKotaPelKeyReleased
        Main.mu.validasiBatas(TxtKotaPel, 30);
    }//GEN-LAST:event_TxtKotaPelKeyReleased

    private void TxtNoHPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNoHPKeyReleased
        Main.mu.validasiBatas(TxtNoHP, 15);
    }//GEN-LAST:event_TxtNoHPKeyReleased

    private void TxtProvPelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtProvPelKeyReleased
        Main.mu.validasiBatas(TxtProvPel, 30);
    }//GEN-LAST:event_TxtProvPelKeyReleased

    private void TxtNoWAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNoWAKeyReleased
        Main.mu.validasiBatas(TxtNoWA, 15);
    }//GEN-LAST:event_TxtNoWAKeyReleased

    private void TxtNamaPenerimaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNamaPenerimaKeyReleased
        Main.mu.validasiBatas(TxtNamaPenerima, 30);
    }//GEN-LAST:event_TxtNamaPenerimaKeyReleased

    private void BtnSimpanBrgTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanBrgTambahActionPerformed
        ubahPelanggan();
    }//GEN-LAST:event_BtnSimpanBrgTambahActionPerformed

    private void BtnBatalBrgTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalBrgTambahActionPerformed
        bersih();
    }//GEN-LAST:event_BtnBatalBrgTambahActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MenuUbahDP.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuTabelDB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDB2ActionPerformed
        Main.mtabeldb.setVisible(true);
        Main.mubahdp.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDB2ActionPerformed

    private void jMenuTambahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBActionPerformed
        Main.mtambahdb.setVisible(true);
        Main.mubahdp.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBActionPerformed

    private void jMenuUbahDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDBActionPerformed
        Main.mubahdb.setVisible(true);
        Main.mubahdp.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDBActionPerformed

    private void jMenuTabelDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDPActionPerformed
        Main.mtabeldp.setVisible(true);
        Main.mubahdp.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDPActionPerformed

    private void jMenuTambahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDPActionPerformed
        Main.mtambahdp.setVisible(true);
        Main.mubahdp.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDPActionPerformed

    private void jMenuUbahDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbahDPActionPerformed
        Main.mubahdp.setVisible(true);
        Main.mubahdp.setVisible(false);
    }//GEN-LAST:event_jMenuUbahDPActionPerformed

    private void jMenuTabelDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelDBMActionPerformed
        Main.mtabeldbm.setVisible(true);
        Main.mubahdp.setVisible(false);
    }//GEN-LAST:event_jMenuTabelDBMActionPerformed

    private void jMenuTambahDBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTambahDBMActionPerformed
        Main.mtambahdbm.setVisible(true);
        Main.mubahdp.setVisible(false);
    }//GEN-LAST:event_jMenuTambahDBMActionPerformed

    private void CBKodePelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBKodePelActionPerformed
        CBtoTxt();
    }//GEN-LAST:event_CBKodePelActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUbahDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUbahDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUbahDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUbahDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUbahDP().setVisible(true);
            }
        });
    }
    
    private void bersih() {
        CBKodePel.setSelectedIndex(0);
        TxtNama.setText("");
        TxtKotaPel.setText("");
        TxtProvPel.setText("");
        TxtAlamatPel.setText("");
        TxtKotaKirim.setText("");
        TxtAlamatKirim.setText("");
        TxtProvKirim.setText("");
        TxtNoWA.setText("");
        TxtNoHP.setText("");
        TxtNamaPenerima.setText("");
    }
    
    private void DBtoCB(){
        try {
            CallableStatement cs = Main.mu.koneksi.prepareCall("{? = call selectKODEPEL()}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.execute();

            String listKODEPEL = cs.getString(1);
            String KODEPEL = "";
            for (int i = 0, c = listKODEPEL.length(); i < c; i++) {
                char huruf = listKODEPEL.charAt(i);
                
                if (huruf == ',') {
                    CBKodePel.addItem(KODEPEL);
                    KODEPEL = "";
                }
                else KODEPEL += huruf;
            }
        } catch (SQLException ex) {
            System.out.println("Kesalahan pada DBtoCB() Tambah Pelanggan:");
            System.err.print(ex);
        }
    }
    
    private void CBtoTxt() {
        String kode = CBKodePel.getSelectedItem().toString();
        
        try {
            CallableStatement cs = Main.mu.koneksi.prepareCall("{? = call get_namapel(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtNama.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_alamatpel(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtAlamatPel.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_kotapel(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtKotaPel.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_provpel(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtProvPel.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_alamatkirim(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtAlamatKirim.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_kotakirim(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtKotaKirim.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_provkirim(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtProvKirim.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_nohp(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtNoHP.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_nowa(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtNoWA.setText(cs.getString(1));
            
            cs = Main.mu.koneksi.prepareCall("{? = call get_namapenerima(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, kode);
            cs.execute();
            TxtNamaPenerima.setText(cs.getString(1));
        } catch (SQLException ex) {
            System.out.println("Kesalahan pada CBtoTxt() ubah pelanggan:");
            System.err.print(ex);
        }
    }
    
    private void ubahPelanggan() {
        int peringatan;
        JTextField[] txtPelanggan = {TxtNama, TxtAlamatPel, TxtKotaPel, TxtProvPel, TxtAlamatKirim, TxtKotaKirim, TxtProvKirim,
            TxtNoHP, TxtNoWA, TxtNamaPenerima};
        
        if ((peringatan = JOptionPane.showConfirmDialog(null, "Data akan diubah. Lanjutkan?\n", "Perhatian!", JOptionPane.YES_NO_OPTION)) == 0) {
            try {
                for(int i = 0; i < Main.mtabeldp.ModelPelanggan.getColumnCount() - 1; i++) {
                    CallableStatement cs = Main.mu.koneksi.prepareCall("{call updatePELANGGAN(?, ?, ?)}");
                    cs.setString(1, CBKodePel.getSelectedItem().toString());
                    cs.setString(2, txtPelanggan[i].getText());
                    cs.setString(3, Main.mtabeldp.ModelPelanggan.getColumnName(i+1));
                    cs.execute();
                }
                
                Main.mtabeldp.tampilPelanggan();
                
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
    private javax.swing.JButton BtnSimpanBrgTambah;
    private javax.swing.JComboBox<String> CBKodePel;
    private javax.swing.JTextField TxtAlamatKirim;
    private javax.swing.JTextField TxtAlamatPel;
    private javax.swing.JTextField TxtKotaKirim;
    private javax.swing.JTextField TxtKotaPel;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtNamaPenerima;
    private javax.swing.JTextField TxtNoHP;
    private javax.swing.JTextField TxtNoWA;
    private javax.swing.JTextField TxtProvKirim;
    private javax.swing.JTextField TxtProvPel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenu jMenuBarang2;
    private javax.swing.JMenu jMenuDataBarang2;
    private javax.swing.JMenu jMenuDataPelanggan;
    private javax.swing.JMenu jMenuDataTransaksi;
    private javax.swing.JMenu jMenuPelanggan;
    private javax.swing.JMenuItem jMenuTabelDB2;
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
