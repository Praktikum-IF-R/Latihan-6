package filkom;
public class SistemInformasi extends Filkom {
    private String laboratorium;
    private String keminatan;
    private String dosen;
    private String kaprodi;
    
    public SistemInformasi(){
        this.laboratorium   = "Lab.Robotika";
        this.keminatan      = "Membuat Robot";
        this.dosen          = "Pak Adit";
        this.kaprodi        = "Dr.Ir .Ignatius Suryo";
    }
    
    public void display(){
        System.out.println("Universitas         : "+super.namauniversitas);
        System.out.println("Rektor              : "+super.namarektor);
        System.out.println("Fakultas            : "+super.namafakultas);
        System.out.println("Laboratorium        : "+this.laboratorium);
        System.out.println("Keminatan           : "+this.keminatan);
        System.out.println("Dosen               : "+this.dosen);
        System.out.println("Ketua Program Studi : "+this.kaprodi);
    }
}
