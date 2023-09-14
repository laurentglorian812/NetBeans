package fishsomething;

import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author Kelompok 3
 * Fedora Yoshe Juandy (2019130032) - C
 * Felicia Yolanda (2019130005)
 * Laurent Glorian (2019130004)
 * Regina Viola (2019130011)
 * Serius Harefa (2019130024)
 */
public class FXMLDocumentController implements Initializable {
    
    //password & IdUser
    static ObservableList list = FXCollections.observableArrayList();
    String fileKasir = "DaftarKasir.txt";
    ArrayList<Kasir> daftarKasir = new ArrayList();
    ArrayList<String> id = new ArrayList();
    ArrayList<String> password = new ArrayList();
    
    static String uname = "";
    
    @FXML
    private TextField idpengguna;
    @FXML
    private PasswordField pass;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Main.loadFile(daftarKasir, fileKasir);
        for(int i = 0; i < daftarKasir.size(); i ++) {
            id.add(daftarKasir.get(i).getId());
            password.add(daftarKasir.get(i).getPw());
        }
    }    
    
    @FXML 
    void LoginUser (ActionEvent event) throws IOException{
        String ID = idpengguna.getText();
        String Pass = pass.getText();
        
        Main.nota.setKasir(ID);
        
        if (ID.isEmpty() || Pass.isEmpty()){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("");
            alert.setContentText("Tolong isi ID DAN PASSWORD Anda pada kolom yang tersedia.");
            alert.showAndWait();
        }
        else{
            try{
                int urut = Integer.parseInt(ID.substring(3, 4));
                if(ID.equals(id.get(urut)) && Pass.equals(password.get(urut))){
                    FXMLLoader fxml = new FXMLLoader();
                    fxml.setLocation(getClass().getResource("FXMLMenu.fxml"));
                    Scene scene = new Scene(fxml.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                    idpengguna.setText("");
                    pass.setText("");
                }
                else{
                    Alert alert1 = new Alert (AlertType.ERROR);
                    alert1.setHeaderText("");
                    alert1.setContentText("ID dan/atau Password salah.");
                    alert1.showAndWait();  
                }
            }
            catch(java.lang.NumberFormatException e) {
                Alert alert2 = new Alert (AlertType.ERROR);
                alert2.setHeaderText("");
                alert2.setContentText("Tolong cek ID Anda. ID berupa angka.");
                alert2.showAndWait();  
            }
            
        }
    }
    
}
