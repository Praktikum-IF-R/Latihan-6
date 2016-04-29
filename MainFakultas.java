package fakultas;

public class MainFakultas {
    public static void main(String[] args) {
        Fakultas fa = new Fakultas("Filkom", "Prof.Dr.Ir.M.Bisri", "Universitas Brawijaya");
        Informatika in = new Informatika("Informatika", "Prof.Dr.Ir.M.Bisri", "Universitas Brawijaya");
        SistemInformasi si = new SistemInformasi("Sistem Informasi", "Prof.Dr.Ir.M.Bisri", "Universitas Brawijaya");
        SistemKomputer sk = new SistemKomputer("SistemKomputer", "Prof.Dr.Ir.M.Bisri", "Universitas Brawijaya");
        
        in.setLaboratorium("Laboratorium KSC");
        in.setKeminatan("Komputasi dan Sistem Cerdas");
        in.setDosen("Sutrisno");
        in.setKaprodi("Issa Arwani");
        
        si.setLaboratorium("Laboratorium KD");
        si.setKeminatan("Komputer Dasar");
        si.setDosen("Candra Dewi");
        si.setKaprodi("Satrio Agung");
        
        sk.setLaboratorium("Laboratorium MA");
        sk.setKeminatan("Mobile Apps");
        sk.setDosen("Komang Candra");
        sk.setKaprodi("Tri Astoto");
        
        System.out.println("  ========Profil Universitas========  ");
        System.out.println("Fakultas\t\t : "+fa.getFakultas());
        System.out.println("Universitas\t\t : "+fa.getUniversitas());
        System.out.println("Rektor\t\t         : "+fa.getRektor());
        System.out.println("  =====Pilihan Jurusan=====   ");
        System.out.println("Nama Jurusan : "+in.getFakultas());
        System.out.println("Keminatan    : "+in.getKeminatan());
        System.out.println("Dosen:       : "+in.getDosen());
        System.out.println("Kaprodi      : "+in.getKaprodi());
        System.out.println("");
        System.out.println("Nama Jurusan : "+si.getFakultas());
        System.out.println("Keminatan    : "+si.getKeminatan());
        System.out.println("Dosen:       : "+si.getDosen());
        System.out.println("Kaprodi      : "+si.getKaprodi());
        System.out.println("");
        System.out.println("Nama Jurusan : "+sk.getFakultas());
        System.out.println("Keminatan    : "+sk.getKeminatan());
        System.out.println("Dosen:       : "+sk.getDosen());
        System.out.println("Kaprodi      : "+sk.getKaprodi());
    }
}
