/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohlattraversal;

/**
 *
 * @author Acer
 */
public class BinaryTree {
    Node root;
    
    public void add(int value){
        root=add(root, value);
    }
    
    public Node add(Node current, int value){
        if(current==null){
            return new Node(value);
        }else if(value<current.value){
            current.left=add(current.left,value);
        }else if(value>current.value){
            current.right=add(current.right,value);
        }
        return(current);
    }
    
    public void inOrderTraversal(Node node,int lv) {
        if(node!=null){
            inOrderTraversal(node.left,lv+1);
            print(node.value,lv);
            inOrderTraversal(node.right,lv+1);
        }
    }

    public void print(int value,int lv) {
        for(int i=0;i<lv;i++) System.out.print("   ");
        System.out.println(value);
    }    
    
    public void preordertraversal(Node node,int lv){
        if(node!=null){
            print(node.value,lv);
            preordertraversal(node.left,lv+1);
            preordertraversal(node.right,lv+1);
        }
    }
    
    public void postordertraversal(Node node,int lv){
        if(node!=null){
            postordertraversal(node.left,lv+1);
            postordertraversal(node.right,lv+1);
            print(node.value,lv);
        }
    }
}
