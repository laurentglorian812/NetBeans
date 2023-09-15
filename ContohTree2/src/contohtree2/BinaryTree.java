/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohtree2;

/**
 *
 * @author Acer
 */
public class BinaryTree{
    Node root;
    
    public void add(int value){
    //membuat root dengan data berisi nilai di value    
        root=add(root, value);
    }
    
    public Node add(Node current, int value){
    //menambah anak/cabang dengan node current
    //dan anak/cabang berisi nlai di value
    //apabila kosong, maka dibuatlah node yang berisi nilai di value
    //apabila value lebih kecil dari nilai node
    //maka tambahkan anaknya di bagian kiri
    //apabila value lebih besar dari nilai node
    //maka tambahkan anaknya di bagian kanan
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
    //traversal secara inorder
    //dimulai dari kiri - induk - kanan
    //dilakukan traversal apabila node tidak kosong
        if(node!=null){
            inOrderTraversal(node.left,lv+1);
            print(node.value,lv);
            inOrderTraversal(node.right,lv+1);
        }
    }

    public void print(int value,int lv) {
    //method yang digunakan untuk mencetak isi node
    //dari struktur pohon dengan level dari pohon   
        for(int i=0;i<lv;i++) System.out.print("   ");
        System.out.println(value);
    }    
    
    public void preordertraversal(Node node,int lv){
    //traversal secara preorder
    //dimulai dari induk - kiri - kanan
    //dilakukan traversal apabila node tidak kosong
        if(node!=null){
            print(node.value,lv);
            preordertraversal(node.left,lv+1);
            preordertraversal(node.right,lv+1);
        }
    }
    
    public void postordertraversal(Node node,int lv){
    //traversal secara postorder
    //dimulai dari kiri - kanan - induk
    //dilakukan traversal apabila node tidak kosong
        if(node!=null){
            postordertraversal(node.left,lv+1);
            postordertraversal(node.right,lv+1);
            print(node.value,lv);
        }
    }
    
    public boolean search(int a){
        boolean ketemu=false;
        if(root!=null){
            Node jalur=root;
            while(jalur!=null&&!ketemu){
                if(a==jalur.value){
                    ketemu=true;
                }else if(a<jalur.value){
                    jalur=jalur.left;
                }else 
                    jalur=jalur.right;
            }
        }
        return(ketemu);
    }
        
}
