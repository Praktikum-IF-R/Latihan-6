package latihan;

public class Fakultas {

    private String Universitas;
    private String Rektor;
    private String Fakultas;
    private String Laboratorium;
    private String Keminatan;
    private String Dosen;
    private String Kaprodi;

    public Fakultas() {
        this.Universitas = "Universitas Brawijaya";
        this.Rektor = "Prof. Dr. Ir. Mohammad Bisri, M.S.";
        this.Fakultas = "Fakultas Ilmu Komputer";
    }

    public Fakultas(String a, String b, String c, String d) {
        this.Laboratorium = a;
        this.Keminatan = b;
        this.Dosen = c;
        this.Kaprodi = d;
    }

    public String getUniversitas() {
        return Universitas;
    }

    public void setUniversitas(String Universitas) {
        this.Universitas = Universitas;
    }

    public String getRektor() {
        return Rektor;
    }

    public void setRektor(String Rektor) {
        this.Rektor = Rektor;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    public String getLaboratorium() {
        return Laboratorium;
    }

    public void setLaboratorium(String Laboratorium) {
        this.Laboratorium = Laboratorium;
    }

    public String getKeminatan() {
        return Keminatan;
    }

    public void setKeminatan(String Keminatan) {
        this.Keminatan = Keminatan;
    }

    public String getDosen() {
        return Dosen;
    }

    public void setDosen(String Dosen) {
        this.Dosen = Dosen;
    }

    public String getKaprodi() {
        return Kaprodi;
    }

    public void setKaprodi(String Kaprodi) {
        this.Kaprodi = Kaprodi;
    }

}
