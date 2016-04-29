/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultas;

public class Fakultas {

    final static String fakultas = "Fakultas Ilmu Komputer";
    final static String universitas = "Universitas Brawijaya";
    final static String rektor = "Prof. Dr. Ir. Mohammad Bisri, M.S.";
    private static String lab;
    private static String minat;
    private static String kaprodi;
    private static String dosen;

    public Fakultas(String a, String b, String c, String d) {
        lab = a;
        minat = b;
        kaprodi = c;
        dosen = d;
    }

    public static void setLab(String l) {
        lab = l;
    }

    public static String getLab() {
        return lab;
    }

    public static void setMinat(String m) {
        minat = m;
    }

    public static String getMinat() {
        return minat;
    }

    public static void setKaprodi(String k) {
        kaprodi = k;
    }

    public static String getKaprodi() {
        return kaprodi;
    }

    public static void setDosen(String d) {
        dosen = d;
    }

    public static String getDosen() {
        return dosen;
    }
    public static void UniversitasMessage(){
                System.out.println("Nama Universitas :"+universitas);
        System.out.println("Nama Rektor :"+rektor);
        System.out.println("Nama Fakultas"+fakultas);
    }
}
