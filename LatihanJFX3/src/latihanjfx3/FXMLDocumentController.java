/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjfx3;

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
    private LatihanJFX3Model dt=new LatihanJFX3Model();
    
    @FXML
    private TextField bil1;
    @FXML
    private TextField bil2;
    @FXML
    private TextField bil3;
    @FXML
    private Button hapus;
    @FXML
    private Button kali;
    @FXML
    private Button bagi;
    @FXML
    private Button tambah;
    @FXML
    private Button kurang;
    @FXML
    private Button sisa;
    @FXML
    private Label operator;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void kaliclick(ActionEvent event) {
        dt.setBil1(Integer.parseInt(bil1.getText()));
        dt.setBil2(Integer.parseInt(bil2.getText()));
        int b3 = dt.getBil1()*dt.getBil2();
        operator.setText("*");
        bil3.setText(String.valueOf(b3));
    }

    @FXML
    private void bagiclick(ActionEvent event) {
        dt.setBil1(Integer.parseInt(bil1.getText()));
        dt.setBil2(Integer.parseInt(bil2.getText()));
        int b3 = dt.getBil1()/dt.getBil2();
        operator.setText("/");
        bil3.setText(String.valueOf(b3));
    }

    @FXML
    private void tambahclick(ActionEvent event) {
        dt.setBil1(Integer.parseInt(bil1.getText()));
        dt.setBil2(Integer.parseInt(bil2.getText()));
        int b3 = dt.getBil1()+dt.getBil2();
        operator.setText("+");
        bil3.setText(String.valueOf(b3));
    }

    @FXML
    private void kurangclick(ActionEvent event) {
        dt.setBil1(Integer.parseInt(bil1.getText()));
        dt.setBil2(Integer.parseInt(bil2.getText()));
        int b3 = dt.getBil1()-dt.getBil2();
        operator.setText("-");
        bil3.setText(String.valueOf(b3));
    }

    @FXML
    private void sisaclick(ActionEvent event) {
        dt.setBil1(Integer.parseInt(bil1.getText()));
        dt.setBil2(Integer.parseInt(bil2.getText()));
        int b3 = dt.getBil1()%dt.getBil2();
        operator.setText("%");
        bil3.setText(String.valueOf(b3));
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        bil1.setText("");
        bil2.setText("");
        bil3.setText("");
        operator.setText("");
        bil1.requestFocus();
    }

    
}
