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
public class SistemInformasi extends Fakultas {
//subclass sistem Informasi
    public SistemInformasi(String dekan, String Prodi, int dosen, int mahasiswa, int lab, int minat) {
        super(dekan, Prodi, dosen, mahasiswa, lab, minat);
    }
}
