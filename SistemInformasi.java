/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_6;

/**
 *
 * @author Rexy
 */
public class SistemInformasi extends Fakultas {
        private String kepala;
    private String dosen;
    private String minat;
    private String laboratorium;

      public void SistemInformasi(String ke,String dos,String mi,String la){
        kepala = ke;
        dosen = dos;
        minat = mi;
        laboratorium = la;
      }
    public String getKepala() {
        return kepala;
    }

    public void setKepala(String kepala) {
        this.kepala = kepala;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getMinat() {
        return minat;
    }

    public void setMinat(String minat) {
        this.minat = minat;
    }

    public String getLaboratorium() {
        return laboratorium;
    }

    public void setLaboratorium(String laboratorium) {
        this.laboratorium = laboratorium;
    }
    public void tampil_SI(){
        System.out.println("Kepala Prodit\t:"+getKepala());
        System.out.println("Dosen\t:"+getDosen());
        System.out.println("Keminatan\t:"+getMinat());
        System.out.println("Laboratorium\t:"+getLaboratorium());
        
        
}
}