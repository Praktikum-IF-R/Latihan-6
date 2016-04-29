package fakultas;
public class Fakultas {
    private String NamaFakultas;
    private String NamaUniversitas;
    private String NamaRektor;
    public Fakultas (String nf, String nu, String nr){
        NamaFakultas = nf;
        NamaUniversitas = nu;
        NamaRektor = nr;
    }
    public String getNamaFakultas(){
        return NamaFakultas;
    }
    public String getNamaUniversitas(){
        return NamaUniversitas;
    }
    public String getNamaRektor(){
        return NamaRektor;
    }
    public void display(){
        System.out.println("Nama Fakultas       : "+NamaFakultas);
        System.out.println("Nama Universitas    : "+NamaUniversitas);
        System.out.println("Nama Rektor         : "+NamaRektor);
    }
}