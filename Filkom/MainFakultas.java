package Filkom;

public class MainFakultas {
    public static void main(String[] args){
        Fakultas f = new Fakultas("Filkom", "M.Bisri", "Universitas Brawijaya");
        Informatika i = new Informatika("Informatika", "M.Bisri", "Universitas Brawijaya");
        SistemInformasi si = new SistemInformasi("Sistem Informasi", "M.Bisri", "Universitas Brawijaya");
        SistemKomputer sk = new SistemKomputer("Sistem Komputer", "M.Bisri", "Universitas Brawijaya");
        
        i.setLab("Laboratorium KC");
        i.setDosen("Candra Dewi");
        i.setKeminatan("Komputasi Cerdas");
        i.setKetuaStudi("Marji");
        
        si.setLab("Laboratorium SI");
        si.setDosen("M. Ali Fauzi");
        si.setKeminatan("Manajemen Informasi");
        si.setKetuaStudi("Marjo");
        
        sk.setLab("Laboratorium Robotika");
        sk.setDosen("Wijaya Kurniawan");
        sk.setKeminatan("Robotika");
        sk.setKetuaStudi("Marje");
        
        System.out.println("================PROFIL FAKULTAS================");
        System.out.println("Fakultas\t\t : "+f.getFakultas());
        System.out.println("Universitas\t\t : "+f.getUniv() );
        System.out.println("Rektor\t\t\t : "+f.getRektor()+"\n\n");
        System.out.println("===========JURUSAN YANG DITAWARKAN=============\n");
        System.out.println("Jurusan\t\t\tLab\t\t\t\tDosen\t\t\tKetua Program Studi\n");
        System.out.println(i.getFakultas()+"\t\t"+i.getLab()+"\t\t\t"+i.getDosen()+"\t\t\t"+i.getKetuaStudi());
        System.out.println(si.getFakultas()+"\t"+si.getLab()+"\t\t\t"+si.getDosen()+"\t\t\t"+si.getKetuaStudi());
        System.out.println(sk.getFakultas()+"\t\t"+sk.getLab()+"\t\t"+sk.getDosen()+"\t\t"+sk.getKetuaStudi());
       
    }
    
}
