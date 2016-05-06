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
public class Fakultas {
    private String fakultas, univ, rektor;
    public Fakultas(){
        fakultas = "Fakultas Ilmu Komputer";
        univ = "Universitas Brawijaya";
        rektor = "Prof. Dr. Ir. Mohammad Bisri, M.S.";
    }
    public void setFakultas(String a){
        fakultas = a;
    }
    public String getFakultas(){
        return fakultas;
    }
    public void setUniv(String a){
        univ = a;
    }
    public String getUniv(){
        return univ;
    }
    public void setRektor(String a){
        rektor = a;
    }
    public String getRektor(){
        return rektor;
    }
    public void Display(){
        System.out.println("\t     "+fakultas);
        System.out.println("\t      "+univ);
        System.out.println("\t"+rektor);
    }
    
    
}
