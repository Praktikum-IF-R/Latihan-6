package filkom;
public class Filkom {
    protected String namafakultas;
    protected String namauniversitas;
    protected String namarektor;
    private String nama;
    private String nim;
    
    public Filkom(){
        this.namafakultas = "Fakultas Ilmu Komputer";
        this.namauniversitas = "Universitas Brawijaya";
        this.namarektor = "Prof. Dr. Ir. Mohammad Bisri, M.S.";
    }
    
    public Filkom(String a , String b , String c){
        this.namafakultas = a;
        this.namauniversitas = b;
        this.namauniversitas = c;
    }

    public String getNamafakultas() {
        return namafakultas;
    }

    public String getNamauniversitas() {
        return namauniversitas;
    }

    public String getNamarektor() {
        return namarektor;
    }   
}
