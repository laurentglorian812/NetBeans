/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comboinputjfx;

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
    private ComboInputJFXModel dt=new ComboInputJFXModel();
    
    @FXML
    private Label label;
    @FXML
    private TextField jumlah;
    @FXML
    private ComboBox<String> barang;
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
        barang.setItems(FXCollections.observableArrayList("VGA RTX 1060",
                "VGA RTX 3070","DDR4 4GB"));
        barang.setEditable(true);
    }    

    @FXML
    private void hitungclick(ActionEvent event) {
        DecimalFormat dcf=new DecimalFormat("Rp ##,###,##0");
        int h=0,b=0;
        switch(barang.getSelectionModel().getSelectedIndex()){
            case 0 : h=3000000;break;
            case 1 : h=20000000;break;
            case 2 : h=350000;break;
            default:
                if(harga.getText().isEmpty()){
                    harga.requestFocus();
                }            
        }
        switch(barang.getSelectionModel().getSelectedIndex()){
            case 0 : 
            case 1 : 
            case 2 : 
                dt.setPilih(barang.getSelectionModel().getSelectedIndex());
                dt.setJumlah(Integer.parseInt(jumlah.getText()));
                b=h*dt.getJumlah();
                harga.setText(String.valueOf(dcf.format(h)));
                bayar.setText(String.valueOf(dcf.format(b)));break;
            default:
                if(!harga.getText().isEmpty()){
                    dt.setPilih(barang.getSelectionModel().getSelectedIndex());
                    dt.setJumlah(Integer.parseInt(jumlah.getText()));
                    dt.setHarga(Integer.parseInt(harga.getText()));
                    dt.setBarang(barang.getValue());
                    b=dt.getHarga()*dt.getJumlah();
                    bayar.setText(String.valueOf(dcf.format(b)));
                }
        }       
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        jumlah.setText("");
        barang.setValue(null);
        harga.setText("");
        bayar.setText("");
        jumlah.requestFocus();
    }

    @FXML
    private void keluarclick(ActionEvent event) {
        System.exit(0);
    }
    
}
