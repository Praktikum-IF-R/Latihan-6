package Inheritance;
import java.util.Scanner;
public class FakultasMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fakultas A = new Fakultas("Filkom","Bisri","Univ.Brawijaya");
        Informatika B = new Informatika("Informatika","Bisri","Univ.Brawijaya");
        Siskom C = new Siskom("Sistem Komputer","Bisri","Univ.Brawijaya");
        SistemInformasi D = new SistemInformasi("Sistem Informasi","Bisri","Univ.Brawijaya");
        B.setLabor("Pemrograman Dasar");
        B.setDosen("Marji");
        B.setKeminatan("RPL");
        B.setKetuaStudi("Chandra Dewi");
        C.setLabor("Sistem Digital");
        C.setDosen("Wijaya Kusuma");
        C.setKeminatan("Robotika");
        C.setKetuaStudi("Barlian");
        D.setLabor("Sistem Informasi");
        D.setDosen("Wibisono");
        D.setKeminatan("Sistem Digital");
        D.setKetuaStudi("Fridawati");
        
        System.out.println("===================================================");
        System.out.println("Fakultas            \t:"+A.getFakultas());
        System.out.println("Rektor              \t:"+A.getRektor());
        System.out.println("Universitas         \t:"+A.getUniversitas());
        System.out.println("===================================================");
        System.out.println("                INFORMASI JURUSAN                  ");
        System.out.println("---------------------------------------------------");
        System.out.println("Jurusan             \t:"+B.getFakultas());
        System.out.println("Labor               \t:"+B.getLabor());
        System.out.println("Dosen               \t:"+B.getDosen());
        System.out.println("Keminatan           \t:"+B.getKeminatan());
        System.out.println("Ketua Studi         \t:"+B.getKetuaStudi());
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Jurusan             \t:"+C.getFakultas());
        System.out.println("Labor               \t:"+C.getLabor());
        System.out.println("Dosen               \t:"+C.getDosen());
        System.out.println("Keminatan           \t:"+C.getKeminatan());
        System.out.println("Ketua Studi         \t:"+C.getKetuaStudi());
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Jurusan             \t:"+D.getFakultas());
        System.out.println("Labor               \t:"+D.getLabor());
        System.out.println("Dosen               \t:"+D.getDosen());
        System.out.println("Keminatan           \t:"+D.getKeminatan());
        System.out.println("Ketua Studi         \t:"+D.getKetuaStudi());
        System.out.println("---------------------------------------------------");
    }
}
