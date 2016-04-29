/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fakultas;

/**
 *
 * @author USER
 */
public class MainFakultas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Fakultas F = new Fakultas("Filkom", "Universitas Brawijaya", "M. Bisri");
        Informatika IF = new Informatika("Informatika", "M.Bisri", "Universitas Brawijaya");
        SistemInformasi SI = new SistemInformasi("Sistem Informasi", "M.Bisri", "Universitas Brawijaya");
        SistemKomputer SISKOM = new SistemKomputer("Sistem Komputer", "M.Bisri", "Universitas Brawijaya");
        
        IF.setLab("Lab.KC");
        IF.setDosen("Candra Dewi");
        IF.setMinat("Komputasi Cerdas");
        IF.setKaprodi("Marji");
        
        SI.setLab("Lab.SI");
        SI.setDosen("Himawat Aryadinata");
        SI.setMinat("Sistem analis");
        SI.setKaprodi("Basuki");
        
        SISKOM.setLab("Lab.Robotika");
        SISKOM.setDosen("Wijaya Kurniawan");
        SISKOM.setMinat("Robotika");
        SISKOM.setKaprodi("Eko");
        
        System.out.println("==================================================================================");
        System.out.println("Fakultas\t : "+F.getFakultas());
        System.out.println("Rektor\t\t : "+F.getRektor() );
        System.out.println("Universitas\t : "+F.getUniv()+"\n\n");
        System.out.println("===============================Program Studi======================================\n");
        System.out.println(IF.getFakultas());
        System.out.println(" ");
        System.out.println("Laboratorium        : "+IF.getLab());
        System.out.println("Dosen               : "+IF.getDosen());
        System.out.println("Keminatan           : "+IF.getMinat());
        System.out.println("Ketua Program Studi : "+IF.getKaprodi()+"\n");
        System.out.println(SI.getFakultas());
        System.out.println(" ");
        System.out.println("Laboratorium        : "+SI.getLab());
        System.out.println("Dosen               : "+SI.getDosen());
        System.out.println("Keminatan           : "+SI.getMinat());
        System.out.println("Ketua Program Studi : "+SI.getKaprodi()+"\n");
        System.out.println(SISKOM.getFakultas());
        System.out.println(" ");
        System.out.println("Laboratorium        : "+SISKOM.getLab());
        System.out.println("Dosen               : "+SISKOM.getDosen());
        System.out.println("Keminatan           : "+SISKOM.getMinat());
        System.out.println("Ketua Program Studi : "+SISKOM.getKaprodi()+"\n");
        System.out.println("====================================================================================");
    
    }
    
}
