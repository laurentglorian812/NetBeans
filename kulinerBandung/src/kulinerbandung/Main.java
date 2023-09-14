/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kulinerbandung;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Laurent Glorian - 2019130004
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList al = new ArrayList();
        al.add(new Kuliner ("Martabak Nikmat", "15.00 - 23.00", -6.9189678, 107.5896501));
        al.add(new Kuliner ("Mie Lezat", "08.00 - 23.00", -6.9196282, 107.5908758));
        al.add(new Kuliner ("Sate DJ", "16.30 - 01.30", -6.9194502, 107.5939635));
        al.add(new Kuliner ("Ayam Goreng Susi Sari", "16.00 - 22.30", -6.9205966, 107.6178998));
        al.add(new Kuliner ("Bakso Malang Enggal", "09.00 - 22.00", -6.9248587, 107.6196881));
        
        PrintWriter outputStream = null; 
        try {
            outputStream = new PrintWriter(new FileOutputStream("out.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("Error opening the file out.txt. " + e.getMessage());
            System.exit(0);
        }
        outputStream.println("----------------------------");
        outputStream.println("REKOMENDASI KULINER BANDUNG");
        outputStream.println("----------------------------");
        for (int i=0; i<al.size(); i++) {
            Kuliner x = (Kuliner) al.get(i);
            outputStream.println("Nama: " + x.getNama());
            outputStream.println("Jam Buka: " + x.getJam());
            outputStream.println("Geolocation: " + x.getLatitude() + x.getLongitude());
            outputStream.println("-----------------------------------");
        }
        outputStream.close();
        System.out.println("... written to out.txt.");
        
        try{
            File file = new File("C:\\Users\\Acer\\Documents\\STMIK LIKMI LOLEN\\Sem 3\\PBO\\kulinerBandung\\out.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String getDataString = scan.nextLine();
                System.out.println(getDataString);
            }
            scan.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Error opening the file out.txt. " + e.getMessage());
            System.exit(0);
        }
    }
    
}
