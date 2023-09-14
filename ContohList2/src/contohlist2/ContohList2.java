/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohlist2;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class ContohList2 {

    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>();
        for(int i=0;i<5;i++){
            list.add(i);        
        }
        System.out.println("isi list : "+list);
        list.remove(2);
        System.out.println("isi list setelah dihapus index ke 2 : "+list);
        list.clear();
        for(int i=0;i<5;i++){
            list.add(i);        
        }
        list.add(2,7);
        System.out.println("isi list setelah menambah index 2 dengan 7 : "+list);
    }
}
