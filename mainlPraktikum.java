/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6;

/**
 *
 * @author nugroho
 */
public class mainlPraktikum {

    public static void main(String[] args) {
        fakultas in = new fakultas();
        in.masukan();
        informatika on = new informatika("pak kaprodi TIF", 4, 35, 5, "informatika");
        SI en = new SI("pak kaprodi SI", 3, 30, 9, "SI");
        SK un = new SK("pak kaprodi SISKOM", 4, 20, 8, "Siskom");

        System.out.println("\n\nnama kampus : " + in.namaKampus);
        System.out.println("nama Fakultas : " + in.namaFak);
        System.out.println("===============================");
        System.out.println("nama prodi : " + on.namaProdi);
        System.out.println("nama dekan : " + on.dekan);
        System.out.println("jumlah lab : " + on.lab);
        System.out.println("jumlah keminatan : " + on.keminatan);
        System.out.println("jumlah dosen : " + on.dosen);

        System.out.println("===============================");
        System.out.println("nama prodi : " + en.namaProdi);
        System.out.println("nama dekan : " + en.dekan);
        System.out.println("jumlah lab : " + en.lab);
        System.out.println("jumlah keminatan : " + en.keminatan);
        System.out.println("jumlah dosen : " + en.dosen);

        System.out.println("===============================");
        System.out.println("nama prodi : " + un.namaProdi);
        System.out.println("nama dekan : " + un.dekan);
        System.out.println("jumlah lab : " + un.lab);
        System.out.println("jumlah keminatan : " + un.keminatan);
        System.out.println("jumlah dosen : " + un.dosen);

    }
}
