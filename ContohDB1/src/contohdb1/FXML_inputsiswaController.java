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
public class FXML_inputsiswaController implements Initializable {

    @FXML
    private TextField npm;
    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private Button simpan;
    @FXML
    private Button batal;
    @FXML
    private Button keluar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    boolean editdata=false;
    
    public void execute(SiswaModel d){
        if(!d.getNPM().isEmpty()){
          editdata=true;
          npm.setText(d.getNPM());
          nama.setText(d.getNama());
          alamat.setText(d.getAlamat());
          npm.setEditable(false);
          nama.requestFocus();
        }
    }
    
    @FXML
    private void simpanclick(ActionEvent event) {
        SiswaModel s=new SiswaModel();
        s.setNPM(npm.getText());
        s.setNama(nama.getText());
        s.setAlamat(alamat.getText());
        FXMLDocumentController.dtsiswa.setSiswaModel(s);
        if(editdata){
            if(FXMLDocumentController.dtsiswa.update()){
                Alert a=new Alert(Alert.AlertType.INFORMATION,"Data berhasil diubah",ButtonType.OK);
                a.showAndWait();
                npm.setEditable(true);
                batalclick(event);                
            } else {
                Alert a=new Alert(Alert.AlertType.ERROR,"Data gagal diubah",ButtonType.OK);
                a.showAndWait();                    
            }
        }else if(FXMLDocumentController.dtsiswa.validasi(s.getNPM())<=0){
            if(FXMLDocumentController.dtsiswa.insert()){
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
            npm.requestFocus();
        }
    }

    @FXML
    private void batalclick(ActionEvent event) {
        npm.setText("");
        nama.setText("");
        alamat.setText("");
        npm.requestFocus();
    }

    @FXML
    private void keluarclick(ActionEvent event) {
        keluar.getScene().getWindow().hide();
    }
    
}
