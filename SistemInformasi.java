package javaapplication3;
public class SistemInformasi extends Fakultas {
    private String lab, keminatan, dosen, ketuaprodi;
    public SistemInformasi(String universitas, String rektor, String fakultas){
        super(universitas, rektor, fakultas);
    }
    public void SistemInformasi(String lab, String keminatan, String dosen, String ketuaprodi){
        this.lab = lab;
        this.keminatan = keminatan;
        this.dosen = dosen;
        this.ketuaprodi = ketuaprodi;
    }
    public String getLab(){
        return lab;
    }
    public String getKeminatan(){
        return keminatan;
    }
    public String getDosen(){
        return dosen;
    }
    public String getKetuaprodi(){
        return ketuaprodi;
    }
    
}
