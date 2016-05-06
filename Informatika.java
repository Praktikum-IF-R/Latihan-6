/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

/**
 *
 * @author Lenovo
 */
public class Informatika extends Fakultas {
    private String lab, keminatan, dosen, kaprodi;
    public Informatika(){
        lab = "Komputasi Cerdas & Visualisasi";
        keminatan = "Komputasi Cerdas";
        dosen = "Candra Dewi, S.Kom, M.Sc";
        kaprodi = "Issa Arwani, S.Kom, M.Sc";
    }
    public void setLab(String a){
        lab = a;
    }
    public String getLab(){
        return lab;
    }
    public void setKeminatan(String a){
        keminatan = a;
    }
    public String getKeminatan(){
        return keminatan;
    }
    public void setDosen(String a){
        dosen = a;
    }
    public String getDosen(){
        return dosen;
    }
    public void setKaprodi(String a){
        kaprodi = a;
    }
    public String getKaprodi(){
        return kaprodi;
    }
    public void Display1(){
        System.out.println("Program Studi\t: Informatika");
        System.out.println("Laboratorium\t: "+lab);
        System.out.println("Keminatan\t: "+keminatan);
        System.out.println("Dosen\t\t: "+dosen);
        System.out.println("Kaprodi\t\t: "+kaprodi);
    }
}
