/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohdb1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Laurent Glorian - 2019130004
 */
public class FXML_displaysiswaController implements Initializable {

    @FXML
    private TableView<SiswaModel> tbvsiswa;
    @FXML
    private Button awal;
    @FXML
    private Button sebelum;
    @FXML
    private Button sesudah;
    @FXML
    private Button akhir;
    @FXML
    private Button tambah;
    @FXML
    private Button hapus;
    @FXML
    private Button ubah;
    @FXML
    private Button keluar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showdata();
    }    

    private void showdata(){
        ObservableList<SiswaModel> data=FXMLDocumentController.dtsiswa.Load();
        if(data!=null){            
            tbvsiswa.getColumns().clear();
            tbvsiswa.getItems().clear();
            TableColumn col=new TableColumn("NPM");
            col.setCellValueFactory(new PropertyValueFactory<SiswaModel, String>("NPM"));
            tbvsiswa.getColumns().addAll(col);
            col=new TableColumn("Nama");
            col.setCellValueFactory(new PropertyValueFactory<SiswaModel, String>("Nama"));
            tbvsiswa.getColumns().addAll(col);
            col=new TableColumn("Alamat");
            col.setCellValueFactory(new PropertyValueFactory<SiswaModel, String>("Alamat"));
            tbvsiswa.getColumns().addAll(col);
            tbvsiswa.setItems(data);
        }else {
            Alert a=new Alert(Alert.AlertType.ERROR,"Data kosong",ButtonType.OK);
            a.showAndWait();
            tbvsiswa.getScene().getWindow().hide();;
        }
    }
    
    @FXML
    private void awalclick(ActionEvent event) {
        tbvsiswa.getSelectionModel().selectFirst();
        tbvsiswa.requestFocus();    
    }

    @FXML
    private void sebelumclick(ActionEvent event) {
        tbvsiswa.getSelectionModel().selectAboveCell();
        tbvsiswa.requestFocus();    
    }

    @FXML
    private void sesudahclick(ActionEvent event) {
        tbvsiswa.getSelectionModel().selectBelowCell();
        tbvsiswa.requestFocus();
    }

    @FXML
    private void akhirclick(ActionEvent event) {
        tbvsiswa.getSelectionModel().selectLast();
        tbvsiswa.requestFocus();
    }

    @FXML
    private void tambahclick(ActionEvent event) {
        try{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_inputsiswa.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.showAndWait();
        } catch (IOException e){e.printStackTrace();}
        showdata();
        awalclick(event);
    }

    @FXML
    private void hapusclick(ActionEvent event) {
        SiswaModel s= new SiswaModel();
        s=tbvsiswa.getSelectionModel().getSelectedItem();
        Alert a=new Alert(Alert.AlertType.CONFIRMATION,"Mau dihapus?",
            ButtonType.YES,ButtonType.NO);
        a.showAndWait();
        if(a.getResult()==ButtonType.YES){
            if(FXMLDocumentController.dtsiswa.delete(s.getNPM())){
                Alert b=new Alert(Alert.AlertType.INFORMATION,
                    "Data berhasil dihapus", ButtonType.OK);
                b.showAndWait();
            } else {
                Alert b=new Alert(Alert.AlertType.ERROR,
                    "Data gagal dihapus", ButtonType.OK);
                b.showAndWait();               
           }    
           showdata();
           awalclick(event);
        }
    }

    @FXML
    private void ubahclick(ActionEvent event) {
        SiswaModel s= new SiswaModel();
        s=tbvsiswa.getSelectionModel().getSelectedItem();
        try{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_inputsiswa.fxml"));    
        Parent root = (Parent)loader.load();
        FXML_inputsiswaController isidt=(FXML_inputsiswaController)loader.getController();
        isidt.execute(s);                
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.showAndWait();
        } catch (IOException e){e.printStackTrace();}
        showdata();
        awalclick(event);
    }

    @FXML
    private void keluarclick(ActionEvent event) {
        keluar.getScene().getWindow().hide();
    }

}    