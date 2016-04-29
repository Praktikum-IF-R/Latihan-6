/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6;

/**
 *
 * @author Deltaviyahya
 */
public class SistemKomputer extends Fakultas{
    private String LabKeminatan;
    private String dosen;
    private String Kaprodi;

    public void setLabKeminatan(String LabKeminatan) {
        this.LabKeminatan = LabKeminatan;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public void setKaprodi(String Kaprodi) {
        this.Kaprodi = Kaprodi;
    }

    public String getLabKeminatan() {
        return LabKeminatan;
    }

    public String getDosen() {
        return dosen;
    }

    public String getKaprodi() {
        return Kaprodi;
    }
    
}
