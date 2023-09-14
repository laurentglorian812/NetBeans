/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.Stack;

/**
 *
 * @author Acer
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(10);
        stk.push(17);
        stk.push(8);
        stk.push(30);
        stk.push(25);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        if(!stk.isEmpty()){ //kalo jenisnya boolean pakenya isEmpty
            //if(!stk.empty()) dipake kalo jenisnya bukan boolean
            System.out.println(stk.pop());
        }else{
            System.out.println("stack habis");
        }
    }
}
