/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohdb1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Laurent Glorian - 2019130004
 */
public class FXML_inputmatkulController implements Initializable {

    @FXML
    private TextField kodemk;
    @FXML
    private TextField namamk;
    @FXML
    private TextField sks;
    @FXML
    private Button simpan;
    @FXML
    private Button batal;
    @FXML
    private Button keluar;
    @FXML
    private TextField praktek;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    boolean editdata=false;
    
    public void execute(MatkulModel d){
        if(!d.getKodeMK().isEmpty()){
          editdata=true;
          kodemk.setText(d.getKodeMK());
          namamk.setText(d.getNamaMK());
          sks.setText(String.valueOf(d.getSKS()));
          praktek.setText(String.valueOf(d.getPraktek()));
          kodemk.setEditable(false);
          namamk.requestFocus();
        }
    }
    
    @FXML
    private void simpanclick(ActionEvent event) {
        MatkulModel s=new MatkulModel();
        s.setKodeMK(kodemk.getText());
        s.setNamaMK(namamk.getText());
        s.setSKS(Integer.parseInt(sks.getText()));
        s.setPraktek(Integer.parseInt(praktek.getText()));
        FXMLDocumentController.dtmatkul.setMatkulModel(s);
        if(editdata){
            if(FXMLDocumentController.dtmatkul.update()){
                Alert a=new Alert(Alert.AlertType.INFORMATION,"Data berhasil diubah",ButtonType.OK);
                a.showAndWait();
                kodemk.setEditable(true);
                batalclick(event);                
            } else {
                Alert a=new Alert(Alert.AlertType.ERROR,"Data gagal diubah",ButtonType.OK);
                a.showAndWait();                    
            }
        }else if(FXMLDocumentController.dtmatkul.validasi(s.getKodeMK())<=0){
            if(FXMLDocumentController.dtmatkul.insert()){
                Alert a=new Alert(Alert.AlertType.INFORMATION,"Data berhasil disimpan",ButtonType.OK);
                a.showAndWait();
                batalclick(event);
            }else {
                Alert a=new Alert(Alert.AlertType.ERROR,"Data gagal disimpan",ButtonType.OK);
                a.showAndWait();            
            }
        }else{
            Alert a=new Alert(Alert.AlertType.ERROR,"Data sudah ada",ButtonType.OK);
            a.showAndWait();
            kodemk.requestFocus();
        }
    }

    @FXML
    private void batalclick(ActionEvent event) {
        kodemk.setText("");
        namamk.setText("");
        sks.setText("");
        praktek.setText("");
        kodemk.requestFocus();
    }

    @FXML
    private void keluarclick(ActionEvent event) {
        keluar.getScene().getWindow().hide();
    }
    
}
