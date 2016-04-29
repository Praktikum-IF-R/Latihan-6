package fakultas;

public class SistemKomputer extends Fakultas {
    private String laboratorium, keminatan, dosen, kaprodi;
    public SistemKomputer(String f, String r, String u){
        super (f, r, u);
    }
    public void setLaboratorium(String l){
        this.laboratorium = l;
    }
    public String getLaboratorium(){
        return laboratorium;
    }
    public void setKeminatan(String k){
        this.keminatan = k;
    }
    public String getKeminatan(){
        return keminatan;
    }
    public void setDosen(String d){
        this.dosen = d;
    }
    public String getDosen(){
        return dosen;
    }
    public void setKaprodi(String kps){
        this.kaprodi = kps;
    }
    public String getKaprodi(){
        return kaprodi;
    }
}
