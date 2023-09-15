/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjfx1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class FXMLDocumentController implements Initializable {
    private ContohJFX1Model dt=new ContohJFX1Model();
    
    @FXML
    private Label label;
    @FXML
    private TextField jumlah;
    @FXML
    private TextField harga;
    @FXML
    private TextField bayar;
    @FXML
    private Button hitung;
    @FXML
    private Button hapus;
    @FXML
    private Button keluar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hitungclick(ActionEvent event) {
        dt.setJumlah(Integer.parseInt(jumlah.getText()));
        dt.setHarga(Integer.parseInt(harga.getText()));
        int b=dt.getJumlah()*dt.getHarga();
        bayar.setText(String.valueOf(b));
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        jumlah.setText("");
        harga.setText("");
        bayar.setText("");
        jumlah.requestFocus();
    }

    @FXML
    private void keluarclick(ActionEvent event) {
        System.exit(0);
    }
    
}
