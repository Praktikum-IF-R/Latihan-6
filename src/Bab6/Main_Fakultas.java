package Bab6;

import java.util.*;

public class Main_Fakultas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Fakultas fk = new Fakultas();
        fk.setNamaFak("Fakultas Ilmu Komedi");
        fk.setRektor("John Cena");
        fk.setUniversitas("Cena University");

        System.out.println("Nama Dosen   : " + fk.getNamaFak());
        System.out.println("Nama Rektor  : " + fk.getRektor());
        System.out.println("Universitas  : " + fk.getUniversitas());
        System.out.println("");
        Informatika fak = new Informatika();
        fak.setDosen("The Rock");
        fak.setKaprodi("Hulk Hogan");
        fak.setLabKeminatan("WWE RAW");
        System.out.println("Informatika");
        System.out.println("nama dosen   : " + fak.getDosen());
        System.out.println("nama karpodi : " + fak.getKaprodi());
        System.out.println("Laboratorium : " + fak.getLabKeminatan());
        System.out.println("");
        SistemInformasi SI = new SistemInformasi();
        SI.setDosen("Big Show");
        SI.setKaprodi("Sting");
        SI.setLabKeminatan("WWE SMACKDOWN");
        System.out.println("Sistem Informasi");
        System.out.println("nama dosen   : " + SI.getDosen());
        System.out.println("nama karpodi : " + SI.getKaprodi());
        System.out.println("Laboratorium : " + SI.getLabKeminatan());
        System.out.println("");
        SistemKomputer sk = new SistemKomputer();
        sk.setDosen("Rey Mysterio");
        sk.setKaprodi("Triple H");
        sk.setLabKeminatan("WWE vs SMACKDOWN");
        System.out.println("Sistem Komputer");
        System.out.println("nama dosen   : " + sk.getDosen());
        System.out.println("nama karpodi : " + sk.getKaprodi());
        System.out.println("Laboratorium : " + sk.getLabKeminatan());

    }
}
