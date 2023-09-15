/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohstack2;
import java.util.Stack;

public class ContohStack2 {

    public static void main(String[] args) {
        Stack<String>s=new Stack<>();
        s.push("Tas");
        s.push("Baju");
        s.push("Topi");
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
