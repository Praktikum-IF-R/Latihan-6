package Bab6;

public class SistemKomputer extends Fakultas {

    private String LabKeminatan;
    private String dosen;
    private String kaprodi;

    public void setLabKeminatan(String LabKeminatan) {
        this.LabKeminatan = LabKeminatan;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public void setKaprodi(String kaprodi) {
        this.kaprodi = kaprodi;
    }

    public String getLabKeminatan() {
        return LabKeminatan;
    }

    public String getDosen() {
        return dosen;
    }

    public String getKaprodi() {
        return kaprodi;
    }

}
