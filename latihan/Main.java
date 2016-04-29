
package latihan;

public class Main {
    public static void main(String[] args) {
        Fakultas F=new Fakultas();
        Informatika TIF = new Informatika("Laboratorium Komputer Dasar","Komputasi Cerdas","CandraDewi, S.Kom., M.Sc","Drs. Marji, MT");
        SistemInformasi SI = new SistemInformasi("Laboratorium Sistem Informasi","Administrasi Basis Data","Suprapto, ST., MT","Suprapto, ST., MT");
        SistemKomputer SK = new SistemKomputer("Laboratorium Robotika","Jaringan Komputer","Adharul Muttaqin, ST, MT","Adharul Muttaqin, ST, MT");
        
        System.out.println("     Menampilkan Profil "+F.getUniversitas());
        System.out.println("------------------------------------------------------------");
        System.out.println("Nama Rektor  : "+F.getRektor());
        System.out.println("Fakultas     : "+F.getFakultas());
        System.out.println("------------------------------------------------------------");
        System.out.println("                    Prodi Informatika");
        System.out.println("Laboratorium : "+TIF.getLaboratorium());
        System.out.println("Keminatan    : "+TIF.getKeminatan());
        System.out.println("Ketua Prodi  : "+TIF.getKaprodi());
        System.out.println("Dosen        : "+TIF.getDosen());
        System.out.println("------------------------------------------------------------");
        System.out.println("                 Prodi Sistem Informasi");
        System.out.println("Laboratorium : "+SI.getLaboratorium());
        System.out.println("Keminatan    : "+SI.getKeminatan());
        System.out.println("Ketua Prodi  : "+SI.getKaprodi());
        System.out.println("Dosen        : "+SI.getDosen());
        System.out.println("------------------------------------------------------------");
        System.out.println("                 Prodi Sistem Informasi");
        System.out.println("Laboratorium : "+SK.getLaboratorium());
        System.out.println("Keminatan    : "+SK.getKeminatan());
        System.out.println("Ketua Prodi  : "+SK.getKaprodi());
        System.out.println("Dosen        : "+SK.getDosen());
        System.out.println("------------------------------------------------------------");
        System.out.println("     Menampilkan Profil "+F.getUniversitas());
    }
}
