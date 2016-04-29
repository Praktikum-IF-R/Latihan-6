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
public class Fakultas {

    private String fakultas ;
    private String universitas ;
    private String rektor ;
    private String jurusan;

    public Fakultas(String a, String b, String c, String d) {
        fakultas = a;
        universitas = b;
        rektor = c;
        jurusan = d;
    }

    public String getfakukltas() {
        return fakultas;
    }

    public String getuniversitas() {
        return universitas;
    }

    public String getrektor() {
        return rektor;
    }
    public String getjurusan() {
        return jurusan;
    }

    public void tampil() {
        System.out.println("Fakultas    : " + fakultas);
        System.out.println("Universitas : " + universitas);
        System.out.println("Nama Rektor : " + rektor);
        System.out.println("Jurusan     : "+jurusan);

    }
}
