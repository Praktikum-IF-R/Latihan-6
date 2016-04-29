/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultas;

/**
 *
 * @author Asus Laptop
 */
public class Fakultas {
 final String namafak = "Fakultas Ilmu Komputer";
 final String namarek = "Prof.Dr. Ir. Mohammad Bisri, M.S ";
 final String namauniv ="Universitas Brawijaya";
 String lab, minat, dosen, kaprodi;
 public Fakultas (){
     
 }
public void displaymessage(){
    System.out.println("==============================================");
    System.out.println("Nama Universitas: "+namauniv);
    System.out.println("Nama Rektor:      "+namarek);
    System.out.println("Nama Fakultas:    "+namafak);
    System.out.println("==============================================");
    
}

   
}