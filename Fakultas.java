package Tugas6;

/**
 *
 * @author wahyuridiansyah
 */
public class Fakultas {

    private String NamaFakultas;
    private String NamaUniversitas;
    private String NamaRektor;
    private String Ketua, NamaProdi;
    private int Lab, Dosen, Keminatan;

    public Fakultas(String NamaFakultas, String NamaUniversitas, String NamaRektor) {
        this.NamaFakultas = NamaFakultas;
        this.NamaUniversitas = NamaUniversitas;
        this.NamaRektor = NamaRektor;
    }
    public Fakultas(int Lab, int Keminatan, int Dosen, String Ketua, String NamaProdi){
        this.Dosen = Dosen;
        this.Lab = Lab;
        this.Keminatan = Keminatan;
        this.Ketua = Ketua;
        this.NamaProdi = NamaProdi;
        
    }

    public String getNamaFakultas() {
        return NamaFakultas;
    }

    public String getNamaUniversitas() {
        return NamaUniversitas;
    }

    public String getNamaRektor(){
        return NamaRektor;
    }
    
    public int getLab(){
        return Lab;
    }
    
    public int getKeminatan(){
        return Keminatan;
    }
    
    public String getNamaProdi(){
        return NamaProdi;
    }
    
    public int getDosen(){
        return Dosen;
    }
    
    public String getKetua(){
        return Ketua;
    }
}