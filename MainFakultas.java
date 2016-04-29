/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuliah;

/**
 *
 * @author imgeek
 */
import java.util.*;

public class MainFakultas {

    public static void main(String[] args) {
        String prod;
        Scanner nuel = new Scanner(System.in);
        System.out.println("======Daftar Prodi FILKOM======");
        System.out.println("1. IF - Informatika");
        System.out.println("2. SISKOM - Sistem Komputer");
        System.out.println("3. SI - Sistem Informasi");
        System.out.println("4. EX - EXIT");
        System.out.println("===============================");
        System.out.print("Input Nama Fakultas \t: ");
        String fak = nuel.nextLine();
        System.out.print("Input Rektor \t\t: ");
        String rek = nuel.nextLine();
        System.out.print("Input Universitas \t: ");
        String univ = nuel.nextLine();
        Fakultas filkom = new Fakultas(fak, rek, univ);
        System.out.println("===============================");
        do {
            System.out.print("Input Kode Prodi : ");
             prod = nuel.nextLine();
            System.out.println("===============================");
            if (prod.equalsIgnoreCase("if")) {
                Informatika inf = new Informatika(fak, rek, univ);
                inf.setLab("Pemograman Lanjut");
                inf.setMinat("Kecerdasan Buatan");
                inf.setDosen("Candra Dewi");
                inf.setKetua("Candra Dewi");
                System.out.println("Fakultas \t: " + filkom.getFakul());
                System.out.println("Rektor \t\t: " + filkom.getRekt());
                System.out.println("Universitas \t: " + filkom.getUniv());
                System.out.println("Laboratorium \t: " + inf.getLab());
                System.out.println("Keminatan \t: " + inf.getMinat());
                System.out.println("Dosen \t\t: " + inf.getDosen());
                System.out.println("Ketua Pelaksana : " + inf.getKetua());
            } else if (prod.equalsIgnoreCase("siskom")) {
                Siskom sis = new Siskom(fak, rek, univ);
                sis.setLab("Sistem Digital");
                sis.setMinat("Robotika");
                sis.setDosen("Wijaya Kurniawan");
                sis.setKetua("Wijaya Kurniawan");
                System.out.println("Fakultas \t: " + filkom.getFakul());
                System.out.println("Rektor \t\t: " + filkom.getRekt());
                System.out.println("Universitas \t: " + filkom.getUniv());
                System.out.println("Laboratorium \t: " + sis.getLab());
                System.out.println("Keminatan \t: " + sis.getMinat());
                System.out.println("Dosen \t\t: " + sis.getDosen());
                System.out.println("Ketua Pelaksana : " + sis.getKetua());
            } else if (prod.equalsIgnoreCase("si")) {
                Sistem_informasi sif = new Sistem_informasi(fak, rek, univ);
                sif.setLab("Basis Data");
                sif.setMinat("Database");
                sif.setDosen("Gon Freeccs");
                sif.setKetua("Gon Freeccs");
                System.out.println("Fakultas \t: " + filkom.getFakul());
                System.out.println("Rektor \t\t: " + filkom.getRekt());
                System.out.println("Universitas \t: " + filkom.getUniv());
                System.out.println("Laboratorium \t: " + sif.getLab());
                System.out.println("Keminatan \t: " + sif.getMinat());
                System.out.println("Dosen \t\t: " + sif.getDosen());
                System.out.println("Ketua Pelaksana : " + sif.getKetua());
            } else {
                System.out.println("Menu Tidak ditemukan, exit........");
                System.exit(0);
            }

        } while (prod !="EX");

    }
}
