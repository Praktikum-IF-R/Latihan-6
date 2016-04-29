
package latihan6;

import java.util.Scanner;

public class mainFakultas {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("PROFIL JURUSAN FAKULTAS ILMU KOMPUTER");
        System.out.println("1. Profil Jurusan Teknik Informatika");
        System.out.println("2. Profil jurusan Sistem Informasi");
        System.out.println("3. profil Jurusan Sistem Komputer");
        System.out.print("Masukkan pilihan anda : ");
        String pil = in.nextLine();
        System.out.println("");
        if ( pil.equalsIgnoreCase("Teknik Informatika")){
            informatika i = new informatika();
            i.tes();
            System.out.println("Program Studi "+pil);
            i.tampil();
        }
        else if (pil.equalsIgnoreCase("Sistem Informasi")){
            SInformasi si = new SInformasi ();
            si.tes();
            System.out.println("Program Studi "+pil);
            si.tampil();
        }
        else if (pil.equalsIgnoreCase("Sistem Komputer")){
            SisKom sk = new SisKom();
            sk.tes();
            System.out.println("Program Studi "+pil);
            sk.tampil();
        } 
    }
}
