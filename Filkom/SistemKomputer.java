package Filkom;

public class SistemKomputer extends Fakultas {
    private String lab, keminatan, dosen, ketuastudi;
    
    public SistemKomputer(String f, String r, String u){
        super(f, r, u);
    }
    public void setLab(String l){
        this.lab = l;
    }
    public String getLab(){
        return lab;
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
    public void setKetuaStudi(String ks){
        this.ketuastudi = ks;
    }
    public String getKetuaStudi(){
        return ketuastudi;
    }
    
}
