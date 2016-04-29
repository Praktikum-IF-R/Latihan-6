/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6;

import java.util.*;

public class fakultas {

    Scanner in = new Scanner(System.in);
    String namaKampus, namaRektor, namaFak, dekan, namaProdi;
    int lab, dosen, keminatan;

    fakultas() {

    }

    fakultas(String ket, int la, int dos, int kem, String namaProdi) {
        lab = la;
        dosen = dos;
        keminatan = kem;
        dekan = ket;
        this.namaProdi = namaProdi;
    }

    void masukan() {
        System.out.print("masukan nama Kampus : ");
        namaKampus = in.nextLine();
        System.out.print("masukan nama Rektor : ");
        namaRektor = in.nextLine();
        System.out.print("masukan nama Fakultas : ");
        namaFak = in.nextLine();
    }

}
