/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihancabangjfx1;

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
    private LatihanCabangJFX1Model dt=new LatihanCabangJFX1Model();
    
    @FXML
    private Label label;
    @FXML
    private TextField denda;
    @FXML
    private TextField lama;
    @FXML
    private TextField total;
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
        int t=0;
        dt.setDenda(Integer.parseInt(denda.getText()));
        dt.setLama(Integer.parseInt(lama.getText()));
        if(dt.getLama()>3){
            t=(dt.getLama()-3)*dt.getDenda();
        }else{
            t=0;
        }
        total.setText(String.valueOf(t));
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        denda.setText("");
        lama.setText("");
        total.setText("");
        denda.requestFocus();
    }
    
}
