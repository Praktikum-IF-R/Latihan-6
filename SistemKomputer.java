/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultas;

/**
 *
 * @author yudi hermawan
 */
public class SistemKomputer extends Fakultas{
        public SistemKomputer(String lab, String minat, String kaprodi, String dosen){
        super(lab, minat, kaprodi, dosen);
    }
    public void SiskomMessage(){
        System.out.println("Nama Lab :"+Fakultas.getLab());
        System.out.println("Nama Keminatan :"+Fakultas.getMinat());
        System.out.println("Nama Kepala Program Studi"+Fakultas.getKaprodi());
        System.out.println("Nama Dosen :"+Fakultas.getDosen());
}
}
