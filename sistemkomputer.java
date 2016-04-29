package bab5;

public class sistemkomputer {
 private String labotarium;
    private String keminatan;
    private String dosen;
    private String ketuaprodi;
           
    
    public sistemkomputer() {
        labotarium = "LabSISKOMP";
        keminatan = "ROBOTIK";
        dosen = "gatau";
        ketuaprodi = "Marji";
    }
    public String getLabotarium() {
        return labotarium;
    }

    public void setLabotarium(String labotarium) {
        this.labotarium = labotarium;
    }

    public String getKeminatan() {
        return keminatan;
    }

    public void setKeminatan(String keminatan) {
        this.keminatan = keminatan;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getKetuaprodi() {
        return ketuaprodi;
    }

    public void setKetuaprodi(String ketuaprodi) {
        this.ketuaprodi = ketuaprodi;
    }
   public void tampil(){
    System.out.println("|-------Sistem Komputer---------|");
    System.out.println("| Labotarium  :"+labotarium+"\t|");
    System.out.println("| keminatan   :"+keminatan+"\t\t|");
    System.out.println("| dosen       :"+dosen+"\t\t|");
    System.out.println("| ketua prodi :"+ketuaprodi+"\t\t|"); 
    System.out.println("---------------------------------");
}
}
