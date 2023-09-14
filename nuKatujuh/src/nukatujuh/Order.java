/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukatujuh;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Order {
    private int orderId;
    private ArrayList products;
    
    public Order(int a) {
        orderId = a;
        products = new ArrayList();
    }
    
    public int getId(){
        return orderId;
    }
    
    public void setId(int a){
        orderId = a;
    }
    
    public ArrayList getProducts(){
        if (products.size()>0){
            return products;
        }
        return null;
    }
    
    public void addProduct(Product a){
        products.add(a);
    }
    
    public void removeProduct(Product a){
        products.remove(a);
    }
    
    public float getTotal(){
        if (products.size()>0){
            float sum = 0;
            for(int i=0; i<products.size(); i++){
                Product p = (Product) products.get(i);
                sum += p.getPrice();
            }
            return sum;
        }
        return 0;
    }
}
