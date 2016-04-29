package fakultas;
import java.util.Scanner;
public class MainFakultas {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Daftar Jurusan Fakultas Ilmu Komputer : ");
        System.out.println("1. Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Sistem Komputer");
        System.out.println();
        System.out.println("Data Pribadi ");
        System.out.print("Masukkan Nama    : ");
        String a=input.nextLine();
        System.out.print("Masukkan Nim     : ");
        String b=input.nextLine();
        System.out.print("Masukkan Jurusan : ");
        String c=input.nextLine();
         Fakultas f1 = new Fakultas("Ilmu Komputer","Brawijaya Malang","Prof. Dr. Ir. Mohammad Bisri, M.S");
        if (c.equalsIgnoreCase("Informatika")||c.equalsIgnoreCase("1")){
        Informatika I1= new Informatika("Komputasi Cerdas & Visualisasi","Komputasi Cerdas","Candra Dewi, S.Kom, M.Sc","Drs. Marji, MT","","","");
        Informatika I2= new Informatika();
        I2.setInformatika(a,b,"Informatika");
        System.out.println();
        System.out.println("Nama         : "+I2.getNama());
        System.out.println("Nim          : "+I2.getNim());
        System.out.println("Jurusan      : "+I2.getJur());
        System.out.println("Laboratorium : "+I1.getLab());
        System.out.println("Keminatan    : "+I1.getMinat());
        System.out.println("Dosen        : "+I1.getDosen());
        System.out.println("Ketua Prodi  : "+I1.getKetua());}
        else if (c.equalsIgnoreCase("Sistem Informasi")||c.equalsIgnoreCase("2")){
        SistemInformasi S1= new SistemInformasi("Jaringan Komputer","Basis Data","Sabriansyah Rizqika Akbar, S.T, M.Eng","Suprapto, ST., MT","","","");
        SistemInformasi S2= new SistemInformasi();
        S2.setSi(a,b,"Sistem Informasi");
        System.out.println();
        System.out.println("Nama         : "+S2.getNama());
        System.out.println("Nim          : "+S2.getNim());
        System.out.println("Jurusan      : "+S2.getJur());
        System.out.println("Laboratorium : "+S1.getLab());
        System.out.println("Keminatan    : "+S1.getMinat());
        System.out.println("Dosen        : "+S1.getDosen());
        System.out.println("Ketua Prodi  : "+S1.getKetua());
        }
        else {
        SistemKomputer K1= new SistemKomputer("Robotika","Robotik","Barlian Henryranu Prasetio, S.T, M.T","Adharul Muttaqin, ST, MT","","","");
        SistemKomputer K2= new SistemKomputer();
        K2.setSk(a,b,"Sistem Komputer");
        System.out.println();
        System.out.println("Nama         : "+K2.getNama());
        System.out.println("Nim          : "+K2.getNim());
        System.out.println("Jurusan      : "+K2.getJur());
        System.out.println("Laboratorium : "+K1.getLab());
        System.out.println("Keminatan    : "+K1.getMinat());
        System.out.println("Dosen        : "+K1.getDosen());
        System.out.println("Ketua Prodi  : "+K1.getKetua());
           }
        System.out.println("Fakultas     : "+f1.getNamafak());
        System.out.println("Universitas  : "+f1.getUniv());
        System.out.println("Rektor       : "+f1.getRektor());
    }
}
