/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihantree;
import java.util.Stack;

public class ExprTree {
    Node root;
    public void insert(String s){
        //stack untuk menampung subtree yang berhasil dibuat
        Stack<Node> stk=new Stack<>();
        //node untuk menampung hasil subtree/node yang dibuat
        Node newNode;
        //untuk mengakses setiap digit dari string
        char symbol;
        for(int i=0;i<s.length();i++){
            //simbol diisi dengan digit dari string
            symbol = s.charAt(i); //charAt: ngambil 1 digit"
            //simbol dibentuk menjadi node
            newNode = new Node(symbol);
            //untuk operator
            //membuat newnode dalam bentuk subtree dengan 2 tumpukan
            //pertama dari stack sebagai anaknya sesuai dengan urutan
            //pengambilan tumpukan pertama disimpan sebagai anak kanan
            //dan pengambilan kedua disimpan sebagai anak kiri
            if(symbol=='^'||symbol=='+'||symbol=='-'
                    ||symbol=='*'||symbol=='/'){
                //if("^+-*/".indexOf(symbol)>=0){}
                newNode.right = stk.pop();
                newNode.left = stk.pop();
            }
            //setelah selesai diproses dimasukkan kembali ke stack
            stk.push(newNode);
        }
        //hasil pohon diambil dari hasil stack
        //pembacaan tumpukan pertama
        root = stk.pop();
    }
    
    void inorder(Node root,int lv){
        //sama dengan yang ada di binarytree kemarin
        if(root!=null){
            inorder(root.left,lv+1);
            print(root.value,lv);
            inorder(root.right,lv+1);
        }
    }

    void print(char v,int l){
        //sama dengan yang ada di binarytree kemarin
        for(int i=0;i<l;i++) System.out.print("   ");
        System.out.println(v);
    }    
}
