/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latio;

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
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList al = new ArrayList();
        al.add(new Pemain (130001, "Ara", "Penyerang", 4));
        
        PrintWriter outputStream = null; 
        try {
            outputStream = new PrintWriter(new FileOutputStream("out.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("Error opening the file out.txt. " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Enter ID:");
        String line = null;
        Scanner s = new Scanner(System.in);
        line = s.next();
        for (int i=0; i<al.size(); i++) {
            Pemain x = (Pemain) al.get(i);
            outputStream.println("ID: " + line);
            outputStream.println("Nama: " + x.getNama());
            outputStream.println("Posisi: " + x.getPosisi());
            outputStream.println("Skill: " + x.getSkill());
        }
        outputStream.close();
        System.out.println("... written to out.txt.");
        
        try{
            File file = new File("C:\\Users\\Acer\\Documents\\STMIK LIKMI LOREN\\Sem 3\\PBO\\latIO\\file bacaan.txt");
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
