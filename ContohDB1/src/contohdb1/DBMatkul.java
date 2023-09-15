/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohdb1;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class DBMatkul {
    private MatkulModel dt=new MatkulModel();    
    public MatkulModel getMatkulModel(){ return(dt);}
    public void setMatkulModel(MatkulModel s){ dt=s;}   

    public ObservableList<MatkulModel>  Load() {
        try {
            ObservableList<MatkulModel>	tableData=FXCollections.observableArrayList();
            Koneksi con = new Koneksi(); 
            con.bukaKoneksi();
            con.statement = (Statement) con.dbKoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery(
                "Select kodemk, namamk, sks, praktek from matakuliah");
            int i=1;
            while (rs.next()) {
                MatkulModel d=new MatkulModel();
                d.setKodeMK(rs.getString("KodeMK")); 
                d.setNamaMK(rs.getString("NamaMK"));
                d.setSKS(rs.getInt("SKS"));
                d.setPraktek(rs.getInt("Praktek"));
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
                ("select count(*) as jml from matakuliah where KodeMK = '" + nomor + "'");
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
                ("insert into matakuliah (KodeMK, NamaMK, SKS, Praktek) values (?,?,?,?)");
            con.preparedStatement.setString(1, getMatkulModel().getKodeMK());
            con.preparedStatement.setString(2, getMatkulModel().getNamaMK());
            con.preparedStatement.setInt(3, getMatkulModel().getSKS());
            con.preparedStatement.setInt(4, getMatkulModel().getPraktek());
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
                ("delete from matakuliah where KodeMK  = ? ");
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
                    "update matakuliah set NamaMK = ?, SKS = ?, Praktek = ? where  KodeMK = ? ; ");
            con.preparedStatement.setString(1, getMatkulModel().getNamaMK());
            con.preparedStatement.setInt(2, getMatkulModel().getSKS());
            con.preparedStatement.setInt(3, getMatkulModel().getPraktek());
            con.preparedStatement.setString(4, getMatkulModel().getKodeMK());
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
