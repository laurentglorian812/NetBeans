/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjfx2;

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
    private LatihanJFX2Model dt=new LatihanJFX2Model();
    
    @FXML
    private Label label;
    @FXML
    private TextField umr;
    @FXML
    private TextField jumlah;
    @FXML
    private TextField insentif;
    @FXML
    private Button hitung;
    @FXML
    private Button hapus;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hitungclick(ActionEvent event) {
        dt.setUmr(Integer.parseInt(umr.getText()));
        dt.setJumlah(Integer.parseInt(jumlah.getText()));
        int i = (dt.getUmr()/2)+(dt.getJumlah()*500);
        insentif.setText(String.valueOf(i));
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        umr.setText("");
        jumlah.setText("");
        insentif.setText("");
        umr.requestFocus();
    }
    
}
