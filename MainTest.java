package Latihan;
import java.util.*;
public class MainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("============||Data Fakultas||============");
        System.out.println("Data Fakultas");
        Fakultas filkom = new Fakultas();
        filkom.setFakultas("Filkom");
        filkom.setRektor("M. Bisri");
        filkom.setUniv("Universitas Brawijaya");
        filkom.displayInfo();
        System.out.println("===================||===================");
        Informatika prodi1 = new Informatika();
        System.out.println("Teknik Informatika");
        prodi1.setDosen("Candra Dewi");
        prodi1.setLab("LabKomDas");
        prodi1.setKaprodi("Mardji");
        prodi1.setKeminatan("Teknik Informasi");
        prodi1.displayInfo();
        System.out.println("===================||===================");
        SistemInformasi prodi2 = new SistemInformasi();
        System.out.println("Sistem Informasi");
        prodi2.setDosen("Ismiarta Aknuranda");
        prodi2.setLab("LabSisIn");
        prodi2.setKaprodi("Suprapto");
        prodi2.setKeminatan("???");
        prodi2.displayInfo();
        System.out.println("===================||===================");
        SistemKomputer prodi3 = new SistemKomputer();
        System.out.println("Sistem Komputer");
        prodi3.setDosen("Barlian Henryranu");
        prodi3.setLab("SisKomBot");
        prodi3.setKaprodi("???");
        prodi3.setKeminatan("???");
        prodi3.displayInfo();
        System.out.println("===================||===================");
    }
}
