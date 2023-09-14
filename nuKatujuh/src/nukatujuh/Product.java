/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukatujuh;

/**
 *
 * @author Acer
 */
public class Product {
    private int productId, price;
    private String productName;
    
    public Product(int a, String b){
        productId = a;
        productName = b;
        price = 0;
    }
    
    public Product(int a, String b, int c){
        productId = a;
        productName = b;
        price = c;
    }
    
    public int getId(){
        return productId;
    }
    
    public void setId(int a){
        productId = a;
    }
    
    public String getName(){
        return productName;
    }
    
    public void setName(String a){
        productName = a;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int a){
        price = a;
    }
}
