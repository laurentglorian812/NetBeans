/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohdb1;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class DBSiswa {
    private SiswaModel dt=new SiswaModel();    
    public SiswaModel getSiswaModel(){ return(dt);}
    public void setSiswaModel(SiswaModel s){ dt=s;}   

    public ObservableList<SiswaModel>  Load() {
        try {
            ObservableList<SiswaModel>	tableData=FXCollections.observableArrayList();
            Koneksi con = new Koneksi(); 
            con.bukaKoneksi();
            con.statement = (Statement) con.dbKoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery(
                "Select npm, nama, alamat from siswa");
            int i=1;
            while (rs.next()) {
                SiswaModel d=new SiswaModel();
                d.setNPM(rs.getString("NPM")); 
                d.setNama(rs.getString("Nama"));
                d.setAlamat(rs.getString("Alamat"));
                tableData.add(d);
                i++;
            }
            con.tutupKoneksi();
            return tableData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int validasi(String nomor) {
        int val = 0;
        try {
            Koneksi con = new Koneksi();
            con.bukaKoneksi();
            con.statement = (Statement) con.dbKoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery
                ("select count(*) as jml from siswa where NPM = '" + nomor + "'");
            while (rs.next()) {
                val = rs.getInt("jml");
            }
            con.tutupKoneksi();
        } catch (SQLException e) {e.printStackTrace();}
        return val;
    }
    
    public boolean insert() {
        boolean berhasil = false;    Koneksi con = new Koneksi();
        try {
            con.bukaKoneksi();
            con.preparedStatement = (PreparedStatement) con.dbKoneksi.prepareStatement
                ("insert into siswa (NPM, Nama, Alamat) values (?,?,?)");
            con.preparedStatement.setString(1, getSiswaModel().getNPM());
            con.preparedStatement.setString(2, getSiswaModel().getNama());
            con.preparedStatement.setString(3, getSiswaModel().getAlamat());
            con.preparedStatement.executeUpdate();
            berhasil = true;
        } catch (Exception e) {
            e.printStackTrace();
            berhasil = false;
        } finally {
            con.tutupKoneksi();
            return berhasil;
        }
    }
    
    public boolean delete(String nomor) {
        boolean berhasil = false;
        Koneksi con = new Koneksi();
        try {
            con.bukaKoneksi();;
            con.preparedStatement = (PreparedStatement) con.dbKoneksi.prepareStatement
                ("delete from siswa where NPM  = ? ");
            con.preparedStatement.setString(1, nomor);
            con.preparedStatement.executeUpdate();
            berhasil = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.tutupKoneksi();
            return berhasil;
        }
    }

    public boolean update() {
        boolean berhasil = false;
        Koneksi con = new Koneksi();
        try {
            con.bukaKoneksi();
            con.preparedStatement = (PreparedStatement) con.dbKoneksi.prepareStatement(
                    "update siswa set Nama = ?, Alamat = ?  where  NPM = ? ; ");
            con.preparedStatement.setString(1, getSiswaModel().getNama());
            con.preparedStatement.setString(2, getSiswaModel().getAlamat());
            con.preparedStatement.setString(3, getSiswaModel().getNPM());
            con.preparedStatement.executeUpdate();
            berhasil = true;
        } catch (Exception e) {
            e.printStackTrace();
            berhasil = false;
        } finally {
            con.tutupKoneksi();
            return berhasil;
        }
    }
}
