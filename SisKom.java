/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultas;

/**
 *
 * @author LENY
 */
public class SisKom extends Fakultas {

    private String laboratorium = "Sistem Digital";
    private String keminatan = "AOK";
    private String dosen = "Pak Wijaya";
    private String ketuaprodi = "Pak Sigit";

    public SisKom(String fakultas, String universitas, String rektor, String jurusan) {
        super(fakultas, universitas, rektor, jurusan);
    }

    public String getSisKom() {
        super.tampil();
        System.out.println("laboratorium        : " + laboratorium);
        System.out.println("keminatan           : " + keminatan);
        System.out.println("nama dosen          : " + dosen);
        System.out.println("ketua program studi : " + ketuaprodi);
        System.out.println("====================================");
        return null;
    }
}
