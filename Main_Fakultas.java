/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6;

/**
 *
 * @author Deltaviyahya
 */
public class Main_Fakultas {
    public static void main(String[] args) {
       Fakultas fk = new Fakultas();
       fk.setNamaFak("Fakultas Ilmu Komputer");
       fk.setRektor("Mohamad Bisri");
       fk.setUniversitas("Universitas Brawijaya");
        System.out.println("|------------================------------|");
        System.out.println("|============ Selamat Datang ============|");
        System.out.println("|------------================------------|");
        System.out.println("\t  "+fk.getNamaFak());
        System.out.println("\t      "+fk.getRektor());
        System.out.println("\t   "+fk.getUniversitas());
        System.out.println("");
        System.out.println("|----------------------------------------|");
        System.out.println("|------------- Program Studi ------------|");
        System.out.println("|----------------------------------------|");
        System.out.println("");
       
       Informatika In = new Informatika();
       In.setDosen("Marji");
       In.setKaprodi("Delta");
       In.setLabKeminatan("Gedung B1");
        System.out.println("|----------------------------------------|");
        System.out.println("\t\tInformatika");
        System.out.println("|----------------------------------------|");
        System.out.println("  nama dosen   : "+In.getDosen());
        System.out.println("  nama kaprodi : "+In.getKaprodi());
        System.out.println("  Laboratorium : "+In.getLabKeminatan());
        
        
       SistemInformasi Si = new SistemInformasi();
       Si.setDosen("Delta");
       Si.setKaprodi("Wibisono");
       Si.setLabKeminatan("Gedung B2");
       
        System.out.println("|----------------------------------------|");
        System.out.println("\t      Sistem Informasi");
        System.out.println("|----------------------------------------|");
        System.out.println("  nama dosen   : "+Si.getDosen());
        System.out.println("  nama kaprodi : "+Si.getKaprodi());
        System.out.println("  Laboratorium : "+Si.getLabKeminatan());
       
       SistemKomputer Sk = new SistemKomputer();
       Sk.setDosen("Wibisono");
       Sk.setKaprodi("Marji");
       Sk.setLabKeminatan("Gedung B3");
        System.out.println("|----------------------------------------|");
        System.out.println("\t      Sistem Komputer");
        System.out.println("|----------------------------------------|");
        System.out.println("  nama dosen   : "+Sk.getDosen());
        System.out.println("  nama kaprodi : "+Sk.getKaprodi());
        System.out.println("  Laboratorium : "+Sk.getLabKeminatan());
        System.out.println("");
        System.out.println("|----------------------------------------|");
       
       
    }
}
