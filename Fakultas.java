/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class Fakultas {
//memasukkan scanner
    Scanner in = new Scanner(System.in);
    //deklarasi variabel
  
    public String univ, Rektor, Fakultas,dekan, Prodi;
    public int   dosen, mahasiswa, lab, minat;
   
    public Fakultas() {
    //pengisian constructor default
    univ = "UNIVERSITAS BRAWIJAYA";
    Rektor = "Dicky Satriawan";
    Fakultas = "Fakultas Ilmu Komputer";
            
    }
    //constructor dengan parameter
    public Fakultas(String dekan, String Prodi, int dosen, int mahasiswa, int lab, int minat) {        
        this.dekan = dekan;
        this.Prodi = Prodi;
        this.dosen = dosen;        
        this.mahasiswa = mahasiswa;
        this.lab = lab;
        this.minat = minat;
    }

}
