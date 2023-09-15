/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjfx1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class FXMLDocumentController implements Initializable {
    private LatihanJFX1Model dt=new LatihanJFX1Model();
    
    @FXML
    private TextField nilai1;
    @FXML
    private TextField nilai3;
    @FXML
    private TextField nilai2;
    @FXML
    private TextField rata;
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
        dt.setNilai1(Integer.parseInt(nilai1.getText()));
        dt.setNilai2(Integer.parseInt(nilai2.getText()));
        dt.setNilai3(Integer.parseInt(nilai3.getText()));
        int rt = (dt.getNilai1()+dt.getNilai2()+dt.getNilai3())/3;
        rata.setText(String.valueOf(rt));
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        nilai1.setText("");
        nilai2.setText("");
        nilai3.setText("");
        rata.setText("");
        nilai1.requestFocus();
    }
    
}
