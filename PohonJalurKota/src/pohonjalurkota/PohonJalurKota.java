/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pohonjalurkota;

import java.util.Scanner;
import java.util.Enumeration;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class PohonJalurKota {

    public static void main(String[] args) {
        DefaultMutableTreeNode KotaA=new DefaultMutableTreeNode (new jalur("A",0),true);
        DefaultTreeModel pohon=new DefaultTreeModel (KotaA,true);
        DefaultMutableTreeNode JalurAB=new DefaultMutableTreeNode (new jalur("B",3),true);
        DefaultMutableTreeNode JalurAG=new DefaultMutableTreeNode (new jalur("G",1),true);
        KotaA.add(JalurAB);
        KotaA.add(JalurAG);
        DefaultMutableTreeNode JalurGI=new DefaultMutableTreeNode (new jalur("I",2),true);
        DefaultMutableTreeNode JalurIJ=new DefaultMutableTreeNode (new jalur("J",5),true);
        JalurAG.add(JalurGI);
        JalurGI.add(JalurIJ);
        DefaultMutableTreeNode JalurBC=new DefaultMutableTreeNode (new jalur("C",1),true);
        DefaultMutableTreeNode JalurBD=new DefaultMutableTreeNode (new jalur("D",2),true);
        JalurAB.add(JalurBC);
        JalurBC.add(JalurBD);
        DefaultMutableTreeNode JalurDH=new DefaultMutableTreeNode (new jalur("H",3),true);
        JalurBD.add(JalurDH);
        DefaultMutableTreeNode JalurCE=new DefaultMutableTreeNode (new jalur("E",5),true);
        JalurBC.add(JalurCE);
        DefaultMutableTreeNode JalurEF=new DefaultMutableTreeNode (new jalur("F",1),true);
        JalurCE.add(JalurEF);
        DefaultMutableTreeNode JalurFH=new DefaultMutableTreeNode (new jalur("H",2),true);
        JalurEF.add(JalurFH);
        DefaultMutableTreeNode JalurHJ=new DefaultMutableTreeNode (new jalur("J",3),true);
        JalurFH.add(JalurHJ);
        JalurDH.add(JalurHJ);
        Enumeration<DefaultMutableTreeNode> e=KotaA.preorderEnumeration();
        while(e.hasMoreElements()){
            DefaultMutableTreeNode node=e.nextElement();
            jalur j=(jalur)node.getUserObject();
            String tmp="";
            for(int i=0;i<node.getLevel();i++) tmp+="   ";
            System.out.println(tmp+j.getKota()+","+j.getJarak());
        }
    }
    
    public static class jalur{
        String kota;
        int jarak;

        public int getJarak() {
            return jarak;
        }

        public void setJarak(int jarak) {
            this.jarak = jarak;
        }

        public String getKota() {
            return kota;
        }

        public void setKota(String kota) {
            this.kota = kota;
        }
        
        public jalur(String k,int j){
            kota=k; jarak=j;
        }
    }
}
