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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person cindy = new Person("Cindy Crawling");
        
        Person james = new Employee("James Benedick", "Manager", 20000000);
        
        System.out.println(james.getName());
        
        Person jameson = new Employee("Jameson", cindy, "Supervisor", 10000000);
        
        System.out.println(jameson.getSpouse().getName());
    }
    
}
