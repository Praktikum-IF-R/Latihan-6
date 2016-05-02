/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author DS
 */
public class SistemKomputer extends Fakultas {
//subclass sistem komputer
    public SistemKomputer(String dekan, String Prodi, int dosen, int mahasiswa, int lab, int minat) {
        super(dekan, Prodi, dosen, mahasiswa, lab, minat);
    }

}
