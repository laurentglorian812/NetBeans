/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohtree;

import java.util.Scanner;
import java.util.Enumeration;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class ContohTree {

    public static void main(String[] args) {
        DefaultMutableTreeNode mahluk=new DefaultMutableTreeNode ("Mahluk",true);
        DefaultTreeModel pohon=new DefaultTreeModel (mahluk,true);
        DefaultMutableTreeNode hewan=new DefaultMutableTreeNode ("Hewan",true);
        DefaultMutableTreeNode tanaman=new DefaultMutableTreeNode ("Tanaman",true);
        mahluk.add(hewan);
        mahluk.add(tanaman);
        DefaultMutableTreeNode mamalia=new DefaultMutableTreeNode ("Mamalia",true);
        DefaultMutableTreeNode ikan=new DefaultMutableTreeNode ("Ikan",true);
        DefaultMutableTreeNode burung=new DefaultMutableTreeNode ("Burung",true);
        hewan.add(mamalia);
        hewan.add(ikan);
        hewan.add(burung);
        DefaultMutableTreeNode bunga=new DefaultMutableTreeNode ("Bunga",true);
        DefaultMutableTreeNode buah=new DefaultMutableTreeNode ("Buah",true);
        tanaman.add(bunga);
        tanaman.add(buah);
        mamalia.add(new DefaultMutableTreeNode("Kucing",true));
        mamalia.add(new DefaultMutableTreeNode("Anjing",true));
        mamalia.add(new DefaultMutableTreeNode("Marmut",true));
        ikan.add(new DefaultMutableTreeNode("Ikan Mas",true));
        ikan.add(new DefaultMutableTreeNode("Ikan Hiu",true));
        ikan.add(new DefaultMutableTreeNode("Ikan Lele",true));
        burung.add(new DefaultMutableTreeNode("Penguin",true));
        burung.add(new DefaultMutableTreeNode("Ayam",true));
        burung.add(new DefaultMutableTreeNode("Merpati",true));
        bunga.add(new DefaultMutableTreeNode("Melati",true));
        bunga.add(new DefaultMutableTreeNode("Mawar",true));
        bunga.add(new DefaultMutableTreeNode("Matahari",true));
        buah.add(new DefaultMutableTreeNode("Mangga",true));
        buah.add(new DefaultMutableTreeNode("Pisang",true));
        buah.add(new DefaultMutableTreeNode("Jeruk",true));
        Enumeration<DefaultMutableTreeNode> e=mahluk.preorderEnumeration();
        System.out.println(e.nextElement());
        while(e.hasMoreElements()){
            DefaultMutableTreeNode node=e.nextElement();
            String tmp="";
            for(int i=0;i<node.getLevel();i++) tmp+="   ";
            System.out.println(tmp+node);
        }
    }
}
