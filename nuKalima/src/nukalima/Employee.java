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
public class Employee extends Person{
    private String position;
    private double salary;
    
    public Employee(String a, Person b, String c, double d){
        super(a, b);
        position = c;
        salary = d;
    }
    
    public Employee(String a, String c, double d){
        super(a);
        position = c;
        salary = d;
    }
    
    public String getPosition(){
        return position;
    }
    
    public void setPosition(String a){
        position = a;
    }

    @Override
    public String getName(){
        return super.getName();
    }
    
    public Double getSalary(){
        return salary;
    }
    
    public void setSalary (Double x){
        salary = x;
    }
        
}
