package inheritancepraktikum.LatihanTugas;
public class Fakultas {
    private String namaFak;
    private String namaRektor;
    private String namaUniv;
    public Fakultas (){
        this.namaFak = "Fakultas Ilmu Komputer";
        this.namaRektor = "Prof. Dr. Ir. Mohammad Bisri, MS.";
        this.namaUniv = "Universitass Brawijaya";
    }
    public String getNamafak(){
        return namaFak;
    }
    public String getNamaRektor (){
        return namaRektor;
    }
    public String getNamaUniv(){
        return namaUniv;
    }
}
