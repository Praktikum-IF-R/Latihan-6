/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepraktikum.LatihanTugas;

/**
 *
 * @author Rikza Priyudha
 */
public class SistemInformasi extends Fakultas {
    private String namaprodi;
    private String laboratorium;
    private String keminatan;
    private String dosen;
    private String kaprodi;

    public SistemInformasi(String a, String b, String c, String d, String e) {
       // super(fak, rektor, univ);
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
