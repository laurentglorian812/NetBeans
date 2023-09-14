/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukadalapan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList al = new ArrayList();
        al.add(new Product(1, "Kaos"));
        al.add(new Product(2, "Celana"));
        
        PrintWriter outputStream = null; 
        try {
            outputStream = new PrintWriter(new FileOutputStream("out.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("Error opening the file out.txt. " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Enter three lines of text:");
        String line = null;
        int count;
        for (count = 1; count <= 3; count++) {
            Scanner s = new Scanner(System.in);
            line = s.next();
            outputStream.println(count + " " + line);
        }
        outputStream.close();
        System.out.println("... written to out.txt.");
    }

}
    