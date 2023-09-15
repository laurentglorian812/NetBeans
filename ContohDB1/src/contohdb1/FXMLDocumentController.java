/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohdb1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class FXMLDocumentController implements Initializable {
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public static DBSiswa dtsiswa=new DBSiswa();
    public static DBMatkul dtmatkul=new DBMatkul();

    @FXML
    private void masterclick(ActionEvent event) {
    }


    @FXML
    private void transaksiclick(ActionEvent event) {
    }

    @FXML
    private void displayclick(ActionEvent event) {
    }

    @FXML
    private void keluarclick(ActionEvent event) {
    }

    @FXML
    private void mastersiswaclick(ActionEvent event) {
        try{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_inputsiswa.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){e.printStackTrace();}
    }

    @FXML
    private void mastermatkulclick(ActionEvent event) {
        try{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_inputmatkul.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){e.printStackTrace();}
    }

    @FXML
    private void transpenilaianclick(ActionEvent event) {
    }

    @FXML
    private void displaysiswaclick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_displaysiswa.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){e.printStackTrace();}
    }

    @FXML
    private void displaymatkulclick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_displaymatkul.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){e.printStackTrace();}
    }

    @FXML
    private void displaypenilaianclick(ActionEvent event) {
    }

    @FXML
    private void kelkeluarclick(ActionEvent event) {
    }
    
}
