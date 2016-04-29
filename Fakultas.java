package Latihan;
public class Fakultas {
    protected String fakultas;
    protected String univ;
    protected String rektor;

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public String getRektor() {
        return rektor;
    }

    public void setRektor(String rektor) {
        this.rektor = rektor;
    }
    
    public void displayInfo(){
        System.out.println("Fakultas: "+getFakultas());
        System.out.println("Universitas: "+getUniv());
        System.out.println("Rektor: "+getRektor());
    }
}