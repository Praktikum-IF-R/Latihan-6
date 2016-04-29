package filkom;
public class Informatika extends Filkom {
    private String laboratorium;
    private String keminatan;
    private String dosen;
    private String kaprodi;
    
    public Informatika(){
        this.laboratorium   = "Lab.Komputer";
        this.keminatan      = "Mengoding";
        this.dosen          = "Bu Chandra Dewi";
        this.kaprodi        = "Dr.Ir .Firstian Satya";
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
