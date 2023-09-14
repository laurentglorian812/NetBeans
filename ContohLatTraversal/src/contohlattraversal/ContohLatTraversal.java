/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohlattraversal;

/**
 *
 * @author Acer
 */
public class ContohLatTraversal {

    public static void main(String[] args) {
        BinaryTree pohon=new BinaryTree();
        pohon.add(70);
        pohon.add(20);
        pohon.add(30);
        pohon.add(80);
        pohon.add(50);
        pohon.add(10);
        pohon.add(90);
        pohon.add(40);
        pohon.add(60);
        pohon.add(100);
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
