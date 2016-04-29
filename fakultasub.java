/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5;

/**
 *
 * @author user
 */
public class fakultasub {
    private String fakultas;
    private String universitas;
    private String rektor;
    
    public fakultasub(){
    fakultas = "FILKOM";
    universitas = "Brawijaya";
    rektor = "Bisri";
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public String getRektor() {
        return rektor;
    }

    public void setRektor(String rektor) {
        this.rektor = rektor;
    }
   
    public void tampil(){
        System.out.println("|--------SELAMAT DATANG---------|");
        System.out.println("| Universitas  :"+universitas+"\t|");
        System.out.println("| Rektor       :"+rektor+"\t\t|");
        System.out.println("| Faklutas     :"+fakultas+"\t\t|");
        System.out.println("|-------------------------------|");
}
}
