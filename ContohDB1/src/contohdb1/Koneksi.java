/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohdb1;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class Koneksi {
    public Connection dbKoneksi;
    public Statement statement;
    public PreparedStatement preparedStatement;
    public Koneksi() {this.dbKoneksi = null;}
    public void bukaKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            dbKoneksi = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/siswa2019130004?user=root&password=mysql");
        } catch (Exception e) {e.printStackTrace();}
    }
    public void tutupKoneksi() {
        try {
            if (statement != null) {statement.close();}
            if (preparedStatement != null) {preparedStatement.close();}
            if (dbKoneksi != null) {dbKoneksi.close();}
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
