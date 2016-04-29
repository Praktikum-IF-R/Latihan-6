package Latihan;
public class Informatika extends Fakultas{
    protected String lab;
    protected String dosen;
    protected String keminatan;
    protected String kaprodi;

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getKeminatan() {
        return keminatan;
    }

    public void setKeminatan(String keminatan) {
        this.keminatan = keminatan;
    }

    public String getKaprodi() {
        return kaprodi;
    }

    public void setKaprodi(String kaprodi) {
        this.kaprodi = kaprodi;
    }   
    
    public void displayInfo(){
        System.out.println("Kepala Prodi: "+getKaprodi());
        System.out.println("Dosen: "+getDosen());
        System.out.println("Lab: "+getLab());
        System.out.println("Keminatan: "+getKeminatan());
    }
}