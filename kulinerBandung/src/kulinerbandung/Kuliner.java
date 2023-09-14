/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kulinerbandung;

/**
 *
 * @author Acer
 */
public class Kuliner {
    private String nama;
    private String jam;
    private double latitude;
    private double longitude;
    
    public Kuliner(String a, String b, double c, double d){
        nama = a;
        jam = b;
        latitude = c;
        longitude = d;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String a){
        nama = a;
    }
    
    public String getJam(){
        return jam;
    }
    
    public void setJam(String b){
        jam = b;
    }
    
    public double getLatitude(){
        return latitude;
    }
    
    public void setLatitude(double c){
        latitude = c;
    }
    
    public double getLongitude(){
        return longitude;
    }
    
    public void setLongitude(double d){
        longitude = d;
    }
}
