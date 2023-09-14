package fishsomething;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Kelompok 3
 */
public class FXMLMenuController implements Initializable {
    static String uname="";
    
    PrintWriter outputStream = null;
    PrintWriter noNota = null;
    int no = getNoTerakhir();
    double total = 0;
    
    ArrayList<Barang> listBarang = new ArrayList();
    String fileTanaman = "DaftarTanaman.txt";
    static ArrayList<Barang> daftarTanaman = new ArrayList();
    String filePakan = "DaftarPakan.txt";
    static ArrayList<Barang> daftarPakan = new ArrayList();
    String fileIkan = "DaftarIkan.txt";
    static ArrayList<Barang> daftarIkan = new ArrayList();
    String fileAkuarium = "DaftarAkuarium.txt";
    static ArrayList<Barang> daftarAkuarium = new ArrayList();
   
    @FXML
    private Label totallabel;
    @FXML
    private TextField jumlaharwana;
    @FXML
    private TextField jumlahlionfish;
    @FXML
    private TextField jumlahbadut;
    @FXML
    private TextField jumlahdory;
    @FXML
    private TextField jumlahhornwort;
    @FXML
    private TextField jumlahwater;
    @FXML
    private TextField jumlahamazon;
    @FXML
    private TextField jumlahakuariumusba;
    @FXML
    private TextField jumlahakuariumkaca;
    @FXML
    private TextField jumlahakuariumusbc;
    @FXML
    private TextField jumlahseaweed;
    @FXML
    private TextField jumlahpellet;
    @FXML
    private TextField jumlahmarine;
    
    @FXML //beli
    void handleButtonAction(ActionEvent event) {
        no += 1;
        Main.nota.setNo(no);
        
        try
        {
            outputStream = new PrintWriter(new FileOutputStream("DaftarNota.txt", true));
            noNota = new PrintWriter(new FileOutputStream("JumlahNota.txt"));
        }
        catch(FileNotFoundException e)
        {
            Alert alert= new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("File penyimpanan data Nota tidak ditemukan!");
            alert.showAndWait();
        }
        
        outputStream.print(Main.nota.getNo());
        outputStream.print(";" + Main.nota.getKasir());
        for(int i = 0; i < listBarang.size(); i ++) {
            Barang b = listBarang.get(i);
            outputStream.print(";" + b.getKode() + "," + b.getJumlah());
        }
        outputStream.println(";" + total);
        
        noNota.println(no);
        
        outputStream.close();
        noNota.close();
        
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Data telah tersimpan.");
        alert.showAndWait();
        
        total = 0;
        hapus();
    }
    
   @FXML //hapus
   void handleButtonAction1(ActionEvent event) {
       hapus();
   }
   
   @FXML //hitung
    void handleButtonAction2(ActionEvent event) throws IOException {
        
        try{
            int jum1= Integer.parseInt(jumlaharwana.getText());
            int jum2= Integer.parseInt(jumlahlionfish.getText());
            int jum3= Integer.parseInt(jumlahbadut.getText());
            int jum4= Integer.parseInt(jumlahdory.getText());
            
            for(int i = 0; i < daftarIkan.size(); i ++) {
                Barang x = daftarIkan.get(i);
                switch(i){
                    case 0:
                        if(jum1 > 0) {
                            x.setJumlah(jum1);
                            Main.nota.addBarang(x);
                        }
                        break;
                    case 1:
                        if(jum2 > 0) {
                            x.setJumlah(jum2);
                            Main.nota.addBarang(x);
                        }
                        break;
                    case 2:
                        if(jum3 > 0) {
                            x.setJumlah(jum3);
                            Main.nota.addBarang(x);
                        }
                        break;
                    case 3:
                        if(jum4 > 0) {
                            x.setJumlah(jum4);
                            Main.nota.addBarang(x);
                        }
                        break;
                }
            }

            int jum5= Integer.parseInt(jumlahhornwort.getText());
            int jum6= Integer.parseInt(jumlahwater.getText());
            int jum7= Integer.parseInt(jumlahamazon.getText());
            setJum(daftarTanaman, jum5, jum6, jum7);
            
            int jum8= Integer.parseInt(jumlahakuariumusba.getText());
            int jum9= Integer.parseInt(jumlahakuariumkaca.getText());
            int jum10= Integer.parseInt(jumlahakuariumusbc.getText());
            setJum(daftarAkuarium, jum8, jum9, jum10);
            
            int jum11= Integer.parseInt(jumlahseaweed.getText());
            int jum12= Integer.parseInt(jumlahpellet.getText());
            int jum13= Integer.parseInt(jumlahmarine.getText());
            setJum(daftarPakan, jum11, jum12, jum13);
            
            listBarang = Main.nota.getBarang();
            
            Main.nota.getTot();
            total = Main.nota.tot;
            String jumlahharga= String.valueOf(Main.nota.tot);
            totallabel.setText(jumlahharga);
        }
        catch(java.lang.NumberFormatException e) {
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Tolong isi kolom jumlah yang kosong! Note: Jumlah hanya berupa angka.");
            alert.showAndWait();  
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Main.loadFile(daftarTanaman, fileTanaman);
        Main.loadFile(daftarPakan, filePakan);
        Main.loadFile(daftarIkan, fileIkan);
        Main.loadFile(daftarAkuarium, fileAkuarium);
        
        hapus();
    }    

    public static int getNoTerakhir() {
        try {
            File saveFile = new File("JumlahNota.txt");
            Scanner reader = new Scanner(saveFile);
            int id = reader.nextInt();
            reader.close();
            return id;
        }
        catch (FileNotFoundException e) {
            Alert alert2 = new Alert (Alert.AlertType.WARNING);
            alert2.setHeaderText("");
            alert2.setContentText("File JumlahNota.txt tidak ditemukan.");
            alert2.showAndWait();
            return 0;
        }
    }
    
    public void setJum(ArrayList<Barang> y, int a, int b, int c) {
        for(int i = 0; i < y.size(); i ++) {
            Barang x = y.get(i);
            switch(i){
                case 0:
                    if(a > 0) {
                        x.setJumlah(a);
                        Main.nota.addBarang(x);
                    }
                    break;
                case 1:
                    if(b > 0) {
                        x.setJumlah(b);
                        Main.nota.addBarang(x);
                    }
                    break;
                case 2:
                    if(c > 0) {
                        x.setJumlah(c);
                        Main.nota.addBarang(x);
                    }
                    break;
            }
        }
    }
    
    public void hapus() {
        totallabel.setText("0");
        jumlaharwana.setText("0");
        jumlahlionfish.setText("0");
        jumlahbadut.setText("0");
        jumlahdory.setText("0");
        jumlahhornwort.setText("0");
        jumlahwater.setText("0");
        jumlahamazon.setText("0");
        jumlahakuariumusba.setText("0");
        jumlahakuariumkaca.setText("0");
        jumlahakuariumusbc.setText("0");
        jumlahseaweed.setText("0");
        jumlahpellet.setText("0");
        jumlahmarine.setText("0");
        
        Main.nota.removeBarang();
    }
    
}