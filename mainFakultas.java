package inheritancepraktikum.LatihanTugas;

public class mainFakultas {

    public static void main(String[] args) {
        Fakultas fakultas = new Fakultas();

        System.out.println("Fakultas        : " + fakultas.getNamafak());
        System.out.println("Universitas     : " + fakultas.getNamaUniv());
        System.out.println("Nama Rektor     : " + fakultas.getNamaRektor());
        System.out.println("");
//informatika
        Informatika inf = new Informatika("Lab. Komdas", "RPL", "Candra Dewi S.Kom, M.Kom", "-", "Informatika");
        System.out.println("Prodi " + inf.getNamaProdi() + " dengan Dosen " + inf.getDosen() + " " + fakultas.getNamaUniv());
        System.out.println("Nama rektor adalah " + inf.getNamaRektor());
//sistem informasi
        System.out.println("");
        SistemInformasi si = new SistemInformasi("Lab. Komdas", "RPL", "Sigit Adi Nugroho", "-", "Sistem Informasi");
        System.out.println("Prodi " + si.getNamaProdi() + " mempunyai laboratorium " + si.getLab());
        System.out.println("Nama rektor adalah " + si.getNamaRektor());

    }

}
