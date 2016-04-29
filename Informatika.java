package inheritancepraktikum.LatihanTugas;

public class Informatika extends Fakultas {
    private String namaprodi;
    private String laboratorium;
    private String keminatan;
    private String dosen;
    private String kaprodi;

    public Informatika(String a, String b, String c, String d, String e) {
        //super(fak, rektor, univ);
        this.laboratorium = a;
        this.keminatan = b;
        this.dosen = c;
        this.kaprodi = d;
        this.namaprodi = e;
    }

    public String getLab() {
        return laboratorium;
    }

    public String getKeminatan() {
        return keminatan;
    }

    public String getDosen() {
        return dosen;
    }

    public String getKaprodi() {
        return kaprodi;
    }
    public String getNamaProdi(){
        return namaprodi;
    }

}
