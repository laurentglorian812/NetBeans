/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pohonjob;

import java.util.Scanner;
import java.util.Enumeration;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class PohonJob {

    public static void main(String[] args) {
        DefaultMutableTreeNode amatir=new DefaultMutableTreeNode ("Amatir",true);
        DefaultTreeModel pohon=new DefaultTreeModel (amatir,true);
        DefaultMutableTreeNode petarung=new DefaultMutableTreeNode ("Petarung",true);
        DefaultMutableTreeNode pemanah=new DefaultMutableTreeNode ("Pemanah",true);
        DefaultMutableTreeNode pesulap=new DefaultMutableTreeNode ("Pesulap",true);
        DefaultMutableTreeNode penyembuh=new DefaultMutableTreeNode ("Penyembuh",true);
        amatir.add(petarung);
        amatir.add(pemanah);
        amatir.add(pesulap);
        amatir.add(penyembuh);
        DefaultMutableTreeNode ksatria=new DefaultMutableTreeNode ("Ksatria",true);
        DefaultMutableTreeNode gladiator=new DefaultMutableTreeNode ("Gladiator",true);
        petarung.add(ksatria);
        petarung.add(gladiator);
        DefaultMutableTreeNode penembak=new DefaultMutableTreeNode ("Penembak",true);
        DefaultMutableTreeNode perampok=new DefaultMutableTreeNode ("Perampok",true);
        pemanah.add(penembak);
        pemanah.add(perampok);
        DefaultMutableTreeNode warlock=new DefaultMutableTreeNode ("Warlock",true);
        DefaultMutableTreeNode dukun=new DefaultMutableTreeNode ("Dukun",true);
        DefaultMutableTreeNode penyihir=new DefaultMutableTreeNode ("Penyihir",true);
        pesulap.add(warlock);
        pesulap.add(dukun);
        pesulap.add(penyihir);
        DefaultMutableTreeNode pendeta=new DefaultMutableTreeNode ("Pendeta",true);
        DefaultMutableTreeNode shaolin=new DefaultMutableTreeNode ("Shaolin",true);
        penyembuh.add(pendeta);
        penyembuh.add(shaolin);
        DefaultMutableTreeNode paladin=new DefaultMutableTreeNode ("Paladin",true);
        ksatria.add(paladin);
        DefaultMutableTreeNode bajaklaut=new DefaultMutableTreeNode ("Bajak Laut",true);
        perampok.add(bajaklaut);
        DefaultMutableTreeNode druid=new DefaultMutableTreeNode ("Druid",true);
        DefaultMutableTreeNode sorcerer=new DefaultMutableTreeNode ("Sorcerer",true);
        penyihir.add(druid);
        penyihir.add(sorcerer);
        Enumeration<DefaultMutableTreeNode> e=amatir.preorderEnumeration();
        System.out.println(e.nextElement());
        while(e.hasMoreElements()){
            DefaultMutableTreeNode node=e.nextElement();
            String tmp="";
            for(int i=0;i<node.getLevel();i++) tmp+="   ";
            System.out.println(tmp+node);
        }
    }
}
