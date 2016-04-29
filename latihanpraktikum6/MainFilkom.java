package LatihanPraktikum6;
public class MainFilkom {
    public static void main(String[] args) {
        Filkom F = new Filkom("Filkom", "Universitas Brawijaya", "M. Bisri");
        Informatika TIF = new Informatika("Informatika", "M.Bisri", "Universitas Brawijaya");
        SistemInformasi SI = new SistemInformasi("Sistem Informasi", "M.Bisri", "Universitas Brawijaya");
        SistemKomputer SISKOM = new SistemKomputer("Sistem Komputer", "M.Bisri", "Universitas Brawijaya");
        
        TIF.setLaboratorium("Lab.RPL");
        TIF.setDosen("Issa Arwani");
        TIF.setKeminatan("Rekayasa Perangkat Lunak");
        TIF.setKaprodi("Marji");
        
        SI.setLaboratorium("Lab.SI");
        SI.setDosen("Satrio Agung");
        SI.setKeminatan("Database");
        SI.setKaprodi("Suprapto");
        
        SISKOM.setLaboratorium("Lab.Robotika");
        SISKOM.setDosen("Wijaya Kurniawan");
        SISKOM.setKeminatan("Robotika");
        SISKOM.setKaprodi("Sutrisno");
        
        System.out.println("==================================================================================");
        System.out.println("Fakultas\t : "+F.getFilkom());
        System.out.println("Rektor\t\t : "+F.getRektor() );
        System.out.println("Universitas\t : "+F.getUniversitas()+"\n\n");
        System.out.println("===============================Program Studi======================================\n");
        System.out.println(TIF.getFilkom());
        System.out.println(" ");
        System.out.println("Laboratorium        : "+TIF.getLaboratorium());
        System.out.println("Dosen               : "+TIF.getDosen());
        System.out.println("Keminatan           : "+TIF.getKeminatan());
        System.out.println("Ketua Program Studi : "+TIF.getKaprodi()+"\n");
        System.out.println(SI.getFakultas());
        System.out.println(" ");
        System.out.println("Laboratorium        : "+SI.getLaboratorium());
        System.out.println("Dosen               : "+SI.getDosen());
        System.out.println("Keminatan           : "+SI.getKeminatan());
        System.out.println("Ketua Program Studi : "+SI.getKaprodi()+"\n");
        System.out.println(SISKOM.getFakultas());
        System.out.println(" ");
        System.out.println("Laboratorium        : "+SISKOM.getLaboratorium());
        System.out.println("Dosen               : "+SISKOM.getDosen());
        System.out.println("Keminatan           : "+SISKOM.getKeminatan());
        System.out.println("Ketua Program Studi : "+SISKOM.getKaprodi()+"\n");
        System.out.println("====================================================================================");
    
    }
    
}