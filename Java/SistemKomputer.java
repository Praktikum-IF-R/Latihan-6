package filkom;
public class SistemKomputer extends Filkom {
    private String laboratorium;
    private String keminatan;
    private String dosen;
    private String kaprodi;
    
    public SistemKomputer(){
        this.laboratorium   = "Lab.Jaringan";
        this.keminatan      = "Membuat Rangkaian - rangkaian";
        this.dosen          = "Pak Wibisono";
        this.kaprodi        = "Dr.Ir .Zeddin Arief";
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
