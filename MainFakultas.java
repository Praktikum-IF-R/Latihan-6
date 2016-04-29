package Tugas6;

/**
 *
 * @author wahyuridiansyah
 */
public class MainFakultas {
    
public static void main(String[] args) {
        Fakultas a1 = new Fakultas("Fakultas Ilmu Komputer","Universitas Briwijaya","Prof. Dr. Ir. Mohammad Bisri, M.S.");
        Informatika b1 = new Informatika(7,7,49,"Drs. Marji, MT","Informatika");
        SistemInformasi c1 = new SistemInformasi(6,6,12,"Suprapto, ST., MT","Sistem Informasi");
        SistemKomputer d1 = new SistemKomputer(3,3,0,"Adharul Muttaqin, ST, MT","Sistem Komputer");
        
        System.out.println("------------------------------------------------");
        System.out.println("Nama Universitas: " + a1.getNamaUniversitas());
        System.out.println("Nama Rektor: "+a1.getNamaRektor());
        System.out.println("Nama Fakultas: "+a1.getNamaFakultas());
        System.out.println("------------------------------------------------");
        
        System.out.println("Nama Prodi: "+b1.getNamaProdi());
        System.out.println("Nama Kaprodi: "+b1.getKetua());
        System.out.println("Jumlah Lab: "+b1.getLab());
        System.out.println("Jumlah Keminatan: "+b1.getKeminatan());
        System.out.println("Jumlah Dosen Tetap: "+b1.getDosen());
        System.out.println("------------------------------------------------");
        
        System.out.println("Nama Prodi: "+c1.getNamaProdi());
        System.out.println("Nama Kaprodi: "+c1.getKetua());
        System.out.println("Jumlah Lab: "+c1.getLab());
        System.out.println("Jumlah Keminatan: "+c1.getKeminatan());
        System.out.println("Jumlah Dosen Tetap: "+c1.getDosen());
        System.out.println("------------------------------------------------");  

        System.out.println("Nama Prodi: "+d1.getNamaProdi());
        System.out.println("Nama Kaprodi: "+d1.getKetua());
        System.out.println("Jumlah Lab: "+d1.getLab());
        System.out.println("Jumlah Keminatan: "+d1.getKeminatan());
        System.out.println("Jumlah Dosen Tetap: "+d1.getDosen());
        System.out.println("------------------------------------------------"); 
    }
}