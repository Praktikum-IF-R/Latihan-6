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
public class informatika extends Fakultas {

    private String laboratorium = "pemrograman dasar";
    private String keminatan = "komputasi dasar";
    private String dosen = "bu Can";
    private String ketuaprodi = "Pak Ali";

    public informatika(String fakultas, String universitas, String rektor, String jurusan) {
        super(fakultas, universitas, rektor, jurusan);
    }

    public String getLab() {
        return laboratorium;
    }

    public String getkeminatan() {
        return keminatan;
    }

    public String getdosen() {
        return dosen;
    }

    public String getketuaprodi() {
        return ketuaprodi;
    }

    public String getinformatika() {
        super.tampil();
        System.out.println("laboratorium        : " + laboratorium);
        System.out.println("keminatan           : " + keminatan);
        System.out.println("nama dosen          : " + dosen);
        System.out.println("ketua program studi : " + ketuaprodi);
        System.out.println("====================================");
        return null;

    }
}
