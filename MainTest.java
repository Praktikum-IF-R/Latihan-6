/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultas;

/**
 *
 * @author Asus Laptop
 */
import java.util.*;
public class MainTest {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        Fakultas fak = new Fakultas ();
        TIF tif= new TIF();
        SI si= new SI();
        SisKom siskom= new SisKom();
        fak.displaymessage();
        System.out.println("1. INFORMATIKA ");
        System.out.println("2. SISTEM INFORMASI/ SI");
        System.out.println("3. SISTEM KOMPUTER/ SISKOM");
        System.out.print("Masukkan jurusan anda: ");
        String jur = in.next();
        switch (jur){
            case "INFORMATIKA" :
            System.out.print("Masukkan bidang keminatan: ");
            String minat= in.next();
            tif.setMinat(minat); tif.getMinat();
            System.out.print("Laboratorium: ");
            String lab= in.next();
            tif.setLab(lab);tif.getLab();
            System.out.print("Dosen: ");
            String dosen= in.next();
            tif.setDosen(dosen); tif.getDosen();
            System.out.print("Ketua prodi: ");
            String ketua= in.next();
            tif.setKetua(ketua);  tif.getKetua();
            tif.display();break;
        
            case "SI" :
            System.out.print("Masukkan bidang keminatan: ");
            String mina= in.next();
            si.setMinat(mina);
            System.out.print("Laboratorium: ");
            String la= in.next();
            si.setLab(la);
            System.out.print("Dosen: ");
            String dsn= in.next();
            si.setDosen(dsn);
            System.out.print("Ketua prodi: ");
            String ke= in.next();
            si.setKetua(ke);
            si.getMinat();
            si.getLab();
            si.getDosen();
            si.getKetua();
            si.display();break;
        
            case "SISKOM":
             System.out.print("Masukkan bidang keminatan: ");
            String min= in.next();
            siskom.setMinat(min);
            System.out.print("Laboratorium: ");
            String l= in.next();
            siskom.setLab(l);
            System.out.print("Dosen: ");
            String d= in.next();
            siskom.setDosen(d);
            System.out.print("Ketua prodi: ");
            String k= in.next();
            siskom.setKetua(k);
            siskom.getMinat();
            siskom.getLab();
            siskom.getDosen();
            siskom.getKetua();
            siskom.display();break;
        }
    }
}
