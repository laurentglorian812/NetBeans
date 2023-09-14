/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukalima;

/**
 *
 * @author Acer
 */
public class Person {
    private String name;
    private Person spouse;
    
    //Constructor
    public Person(String a){
        name = a;
    }
    
    //Polymorphism
    public Person(String a, Person b){
        name = a;
        spouse = b;
    }
    
    public String getName(){
        return name;
    }
    
    public Person getSpouse(){
        return spouse;
    }
    
    public void setSpouse(Person x){
        spouse = x;
    }
}


