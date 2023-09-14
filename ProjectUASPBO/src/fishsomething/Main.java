package fishsomething;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;



/**
 * @author Kelompok 3
 * Fedora Yoshe Juandy (2019130032) - C
 * Felicia Yolanda (2019130005)
 * Laurent Glorian (2019130004)
 * Regina Viola (2019130011)
 * Serius Harefa (2019130024)
 */
public class Main extends Application {
    // Anggap filenya udh ada di 'database' (yg hanya berupa teks file...)
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    static Nota nota = new Nota();
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void loadFile(ArrayList AL, String namaFile) {
        String kode = "";
        String kelas = "";
        
        try {
            File saveFile = new File(namaFile);
            Scanner reader = new Scanner(saveFile);
            
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] arrData = data.split(";");
                kode = (String)Array.get(arrData, 0);
                kelas = kode.substring(0, 2);
                
                if(kelas.equals("99")) {
                    Kasir x = new Kasir((String)Array.get(arrData, 0), (String)Array.get(arrData, 1), (String)Array.get(arrData, 2), (String)Array.get(arrData, 3));
                    AL.add(x);
                }
                else if(kelas.equalsIgnoreCase("02")) {
                    Ikan x = new Ikan((String)Array.get(arrData, 0), (String)Array.get(arrData, 1), Double.parseDouble((String)Array.get(arrData, 3)));
                    x.setLingkungan((String)Array.get(arrData, 2));
                    AL.add(x);
                }
                else if(kelas.equalsIgnoreCase("01")) {
                    Akuarium x = new Akuarium((String)Array.get(arrData, 0), (String)Array.get(arrData, 1), Double.parseDouble((String)Array.get(arrData, 2)));
                    AL.add(x);
                }
                else if(kelas.equalsIgnoreCase("04")) {
                    Tanaman x = new Tanaman((String)Array.get(arrData, 0), (String)Array.get(arrData, 1), Double.parseDouble((String)Array.get(arrData, 2)));
                    AL.add(x);
                }
                else if(kelas.equalsIgnoreCase("03")) {
                    Pakan x = new Pakan((String)Array.get(arrData, 0), (String)Array.get(arrData, 1), Double.parseDouble((String)Array.get(arrData, 2)));
                    AL.add(x);
                }
                else {
                    System.out.println("Terjadi kesalahan. Kode produk tidak terdaftarkan.");
                }
            }
            
            reader.close();
        }
        catch (FileNotFoundException e) {
            Alert alert2 = new Alert (Alert.AlertType.WARNING);
            alert2.setHeaderText("");
            alert2.setContentText("File " + namaFile + " tidak ditemukan.");
            alert2.showAndWait();  
        }
    }
    
}
