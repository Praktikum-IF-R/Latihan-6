package Inheritence;

import java.util.Scanner;

public class MainFakultas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fakultas fa = new Fakultas();
        Informatika ti = new Informatika();
        SisInformasi si = new SisInformasi();
        SisKomputer sk = new SisKomputer();
        System.out.println("1. Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Sistem Komputer");
        System.out.print("Pilih no : ");
        int pil = in.nextInt();
        if (pil == 1) {
            System.out.println("INFORMATIKA UB");
            System.out.print("nama : ");
            String nam = in.next();
            System.out.print("Nim :");
            String nim = in.next();
            System.out.print("Keminatan :");
            String min = in.next();
            System.out.println("=======================");
            System.out.println("Nama : " + nam);
            System.out.println("NIM : " + nim);
            fa.setDekan("Pak Wayan");
            ti.setKajur("Pak Marji");
            ti.setLab("Laboratorium komputer dasar");
            ti.setMinat(min);
            System.out.println(ti.Univ());
            System.out.println("Rektor :" + ti.Rektor());
            System.out.println(ti.Fakultas());
            System.out.println("Dekan : " + fa.getDekan());
        } else if (pil == 2) {
            System.out.println("SISTEM INFORMASI UB");
            System.out.print("nama : ");
            String nam = in.next();
            System.out.print("Nim :");
            String nim = in.next();
            System.out.print("Keminatan :");
            String min = in.next();
            System.out.println("=======================");
            System.out.println("Nama : " + nam);
            System.out.println("NIM : " + nim);
            fa.setDekan("Pak Wayan");
            ti.setKajur("Pak Suprapto");
            ti.setLab("Laboratorium Sistem Informasi");
            ti.setMinat(min);
            System.out.println(ti.Univ());
            System.out.println("Rektor :" + ti.Rektor());
            System.out.println(ti.Fakultas());
            System.out.println("Dekan : " + fa.getDekan());
        } else if (pil == 3) {
            System.out.println("Sistem Komputer UB");
            System.out.print("nama : ");
            String nam = in.next();
            System.out.print("Nim :");
            String nim = in.next();
            System.out.print("Keminatan :");
            String min = in.next();
            System.out.println("=======================");
            System.out.println("Nama : " + nam);
            System.out.println("NIM : " + nim);
            fa.setDekan("Pak Wayan");
            ti.setKajur("Pak Taufiq");
            ti.setLab("Laboratorium Rekayasa Perangkat Lunak");
            ti.setMinat(min);
            System.out.println(ti.Univ());
            System.out.println("Rektor :" + ti.Rektor());
            System.out.println(ti.Fakultas());
            System.out.println("Dekan : " + fa.getDekan());
        } else {
            System.out.println("Terima kasih");
        }
    }
}
