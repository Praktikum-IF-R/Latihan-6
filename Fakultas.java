package Inheritence;
public class Fakultas {
    String rektor,fak,univ;
    private String dek;
    public Fakultas(){
        rektor = "Pak Bisri";
        fak = "FILKOM";
        univ = "Universitas Brawijaya";
    }
    public void setDekan(String p){
        dek = p;
    }
    public String getDekan(){
        return dek;
    }
}
