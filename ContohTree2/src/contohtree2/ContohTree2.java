/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohtree2;

/**
 *
 * @author Acer
 */

public class ContohTree2 {
    public static void main(String[] args) {
        BinaryTree pohon=new BinaryTree();
        pohon.add(100);
        pohon.add(30);
        pohon.add(72);
        pohon.add(23);
        pohon.add(10);
        pohon.add(16);
        pohon.add(25);
        pohon.add(50);
        System.out.println("inorder");
        pohon.inOrderTraversal(pohon.root,0);
        System.out.println("");
        System.out.println("preorder");
        pohon.preordertraversal(pohon.root,0);
        System.out.println("");
        System.out.println("postorder");
        pohon.postordertraversal(pohon.root,0);
        System.out.println("");
    }
}
