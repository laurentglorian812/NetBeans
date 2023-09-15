/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewqueue;
import java.util.Queue;
import java.util.LinkedList;
public class ReviewQueue {

    public static void main(String[] args) {
        Queue<String>a=new LinkedList<>();
        a.offer("Tas");
        a.offer("Baju");
        a.offer("Topi");
        System.out.println(a.poll());
        System.out.println(a.peek());
        System.out.println(a.poll());
        System.out.println(a.isEmpty());
        System.out.println(a.poll());
        System.out.println(a.isEmpty());
    }
}
