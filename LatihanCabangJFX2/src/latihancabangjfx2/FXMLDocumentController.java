/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihancabangjfx2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class FXMLDocumentController implements Initializable {
    private LatihanCabangJFX2Model dt=new LatihanCabangJFX2Model();
    
    @FXML
    private Label label;
    @FXML
    private TextField pokok;
    @FXML
    private CheckBox tempat;
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
        dt.setPokok(Integer.parseInt(pokok.getText()));
        dt.setTempat(tempat.isSelected());
        if(dt.isTempat()){
            t=dt.getPokok()+200000;
        }else{
            t=dt.getPokok();
        }
        total.setText(String.valueOf(t));
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        pokok.setText("");
        total.setText("");
        tempat.setSelected(false);
        pokok.requestFocus();
    }
    
}
