/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
public class Informatika extends Fakultas {
    private String lab, keminatan, dosen, ketuaprodi;
    public Informatika(String universitas, String rektor, String fakultas){
        super(universitas, rektor, fakultas);;
    }
    public void Informatika(String lab, String keminatan, String dosen, String ketuaprodi){
        this.lab = lab;
        this.keminatan = keminatan;
        this.dosen = dosen;
        this.ketuaprodi = ketuaprodi;
    }
    public String getLab(){
        return lab;
    }
    public String getKeminatan(){
        return keminatan;
    }
    public String getDosen(){
        return dosen;
    }
    public String getKetuaprodi(){
        return ketuaprodi;
    }
    
}
