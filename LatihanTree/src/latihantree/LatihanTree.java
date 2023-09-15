/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihantree;

public class LatihanTree {

    public static void main(String[] args) {
        //asumsi notasi menggunakan
        //operand dan operator yang benar
        //notasi dibuat dalam bentuk postorder
        //String notasi="ABC*DEF^/G*-H*+"
        String notasi="45+312+/*";
        ExprTree pohon=new ExprTree();
        pohon.insert(notasi);
        System.out.println("notasi :"+notasi);
        System.out.println("inorder : ");
        pohon.inorder(pohon.root, 0);
        System.out.println("");
    }
}
