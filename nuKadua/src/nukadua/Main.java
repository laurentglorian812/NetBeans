/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukadua;

/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa laurent = new Mahasiswa(2019130004, "Laurent Glorian");
        System.out.println("NPM : " + laurent.getNpm() + "\nNama : " + laurent.getNama() + "\nJurusan : " + laurent.getJurusan());
        
        laurent.setJurusan("Teknik Informasi");
        System.out.println("\nNPM : " + laurent.getNpm() + "\nNama : " + laurent.getNama() + "\nJurusan : " + laurent.getJurusan());
        System.out.println("------------------------------");
        
        Karakter karakter = new Karakter(100, "Jeanne");
        System.out.println("Nama Karakter : " + karakter.getNamakarakter() + "\nHealth : " + karakter.getHealth());
        Senjata senjata = new Senjata(25, "Panah");
        System.out.println("\nSenjata : " + senjata.getNamasenjata() + "\nDamage : " + senjata.getDamage());
        Monster monster = new Monster(75, "Jelek");
        System.out.println("\nMonster : " + monster.getNamamonster() + "\nHealth : " + monster.getHealth());
        System.out.println("------------------------------");
        
        karakter.setSenjata(senjata);
        Senjata tmp = karakter.getSenjata();
        System.out.println("Senjata : " + tmp.getNamasenjata());
        hajar(karakter, monster);
        System.out.println("Monster : " + monster.getNamamonster() + "\nHealth : " + monster.getHealth());
    }
    
    public static void hajar (Karakter x, Monster y){
        Senjata s = x.getSenjata();
        y.setHealth(y.getHealth()-s.getDamage());
    }
    
}
