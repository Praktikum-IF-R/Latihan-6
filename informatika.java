/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5;

/**
 *
 * @author user
 */
public class informatika extends fakultasub {
    private String labotarium;
    private String keminatan;
    private String dosen;
     private String ketuaprodi;
    public informatika(){
        labotarium = "labproglan";
        keminatan = "Game";
        dosen = "bu Candra dewi";
        ketuaprodi = "pa marji";
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
    System.out.println("|--------informatika------------|");
    System.out.println("| Labotarium  :"+labotarium+"\t|");
    System.out.println("| keminatan   :"+keminatan+"\t\t|");
    System.out.println("| dosen       :"+dosen+"\t|");
    System.out.println("| ketua prodi :"+ketuaprodi+"\t\t|"); 
    }
}
