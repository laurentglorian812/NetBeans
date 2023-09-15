/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihantree1_2019130004;

import java.util.Scanner;
import java.util.Enumeration;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
/**
 *
 * @author Laurent Glorian-2019130004
 */
public class LatihanTree1_2019130004 {

    public static void main(String[] args) {
        DefaultMutableTreeNode isk=new DefaultMutableTreeNode ("Informasi Sistem Komputer",true);
        DefaultTreeModel pohon=new DefaultTreeModel (isk,true);
        DefaultMutableTreeNode sw=new DefaultMutableTreeNode ("Software",true);
        DefaultMutableTreeNode hw=new DefaultMutableTreeNode ("Hardware",true);
        DefaultMutableTreeNode bw=new DefaultMutableTreeNode ("Brainware",true);
        isk.add(sw);
        isk.add(hw);
        isk.add(bw);
        DefaultMutableTreeNode al=new DefaultMutableTreeNode ("Application Layer",true);
        DefaultMutableTreeNode hosl=new DefaultMutableTreeNode ("Higher Order Software Layer",true);
        DefaultMutableTreeNode osl=new DefaultMutableTreeNode ("Operating System Layer",true);
        sw.add(al);
        sw.add(hosl);
        sw.add(osl);
        DefaultMutableTreeNode mal=new DefaultMutableTreeNode ("Machine Layer",true);
        DefaultMutableTreeNode mil=new DefaultMutableTreeNode ("Microprogrammed Layer",true);
        DefaultMutableTreeNode dll=new DefaultMutableTreeNode ("Digital Logic Layer",true);
        DefaultMutableTreeNode pdl=new DefaultMutableTreeNode ("Physical Device Layer",true);
        hw.add(mal);
        hw.add(mil);
        hw.add(dll);
        hw.add(pdl);
        DefaultMutableTreeNode sa=new DefaultMutableTreeNode ("System Analyst",true);
        DefaultMutableTreeNode pro=new DefaultMutableTreeNode ("Programmer",true);
        DefaultMutableTreeNode ad=new DefaultMutableTreeNode ("Administrator",true);
        DefaultMutableTreeNode op=new DefaultMutableTreeNode ("Operator",true);
        DefaultMutableTreeNode tek=new DefaultMutableTreeNode ("Teknisi",true);
        bw.add(sa);
        bw.add(pro);
        bw.add(ad);
        bw.add(op);
        bw.add(tek);
        DefaultMutableTreeNode ana=new DefaultMutableTreeNode ("Analisis",true);
        DefaultMutableTreeNode mn=new DefaultMutableTreeNode ("Manajerial",true);
        DefaultMutableTreeNode te=new DefaultMutableTreeNode ("Teknis",true);
        DefaultMutableTreeNode in=new DefaultMutableTreeNode ("Interpersonal",true);
        sa.add(ana);
        sa.add(mn);
        sa.add(te);
        sa.add(in);
        Enumeration<DefaultMutableTreeNode> e=isk.preorderEnumeration();
        System.out.println(e.nextElement());
        while(e.hasMoreElements()){
            DefaultMutableTreeNode node=e.nextElement();
            String tmp="";
            for(int i=0;i<node.getLevel();i++) tmp+="   ";
            System.out.println(tmp+node);
        }
    }
}
