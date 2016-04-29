/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fakultas;

/**
 *
 * @author USER
 */
public class Informatika extends Fakultas{
     private String lab, minat, dosen, kaprodi;
    
    public Informatika(String f, String u, String r){
        super(f, u, r);
    }
    public void setLab(String l){
        this.lab=l;
    }
    public String getLab(){
        return lab;
        
    }
    public void setMinat(String m){
        this.minat=m;
    }
    public String getMinat(){
        return minat;
    }
    public void setDosen(String d){
        this.dosen=d;
    }
    public String getDosen(){
        return dosen;
    }
    public void setKaprodi(String k){
        kaprodi=k;
    }
    public String getKaprodi(){
        return kaprodi;
    }
}