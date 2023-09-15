/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihancabangjfx3;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class FXMLDocumentController implements Initializable {
    private LatihanCabangJFX3Model dt=new LatihanCabangJFX3Model();
    
    @FXML
    private Label label;
    @FXML
    private ComboBox<String> shift;
    @FXML
    private TextField lembur;
    @FXML
    private TextField pokok;
    @FXML
    private TextField perjam;
    @FXML
    private TextField total;
    @FXML
    private Button hitung;
    @FXML
    private Button hapus;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        shift.setItems(FXCollections.observableArrayList("Pagi","Siang","Malam"));
    }    

    @FXML
    private void hitungclick(ActionEvent event) {
        DecimalFormat dcf=new DecimalFormat("Rp ##,###,##0");
        dt.setLembur(Integer.parseInt(lembur.getText()));
        int p,j;
        switch(shift.getSelectionModel().getSelectedIndex()){
            case 0 : p=300000;j=5000;break;
            case 1 : p=400000;j=8000;break;
            case 2 : p=700000;j=10000;break;
            default: p=0;j=0;          
        }
        pokok.setText(String.valueOf(dcf.format(p)));
        perjam.setText(String.valueOf(dcf.format(j)));
        int t=p+j*dt.getLembur();
        total.setText(String.valueOf(dcf.format(t)));
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        shift.setValue("");
        lembur.setText("");
        pokok.setText("");
        perjam.setText("");
        total.setText("");
        shift.requestFocus();
    }
    
}
