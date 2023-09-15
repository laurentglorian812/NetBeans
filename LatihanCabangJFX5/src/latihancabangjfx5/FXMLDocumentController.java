/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihancabangjfx5;

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
    private LatihanCabangJFX5Model dt=new LatihanCabangJFX5Model();
    
    @FXML
    private Label label;
    @FXML
    private TextField tugas;
    @FXML
    private TextField uts;
    @FXML
    private TextField uas;
    @FXML
    private TextField na;
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
        dt.setTugas(Integer.parseInt(tugas.getText()));
        dt.setUts(Integer.parseInt(uts.getText()));
        dt.setUas(Integer.parseInt(uas.getText()));
        int a=dt.getTugas()/5+dt.getUts()*3/10+dt.getUas()/2;
        if(a>=85){na.setText("A");}
        else if(a>=75){na.setText("B");}
        else if(a>=60){na.setText("C");}
        else if(a>=40){na.setText("D");}
        else {na.setText("E");}
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        tugas.setText("");
        uts.setText("");
        uas.setText("");
        na.setText("");
        tugas.requestFocus();
    }
    
}
