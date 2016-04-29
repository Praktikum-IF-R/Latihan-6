package latihanpraktikum6;
public class SistemKomputer extends Filkom{
    private String Laboratorium, Keminatan, Dosen, Kaprodi;
    
    public SistemKomputer(String f, String u, String r){
        super(f, u, r);
    }
    public void setLaboratorium(String a){
        this.Laboratorium=a;
    }
    public String getLaboratorium(){
        return Laboratorium;
        
    }
    public void setKeminatan(String b){
        this.Keminatan=b;
    }
    public String getKeminatan(){
        return Keminatan;
    }
    public void setDosen(String c){
        this.Dosen=c;
    }
    public String getDosen(){
        return Dosen;
    }
    public void setKaprodi(String d){
        Kaprodi=d;
    }
    public String getKaprodi(){
        return Kaprodi;
    }
}