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
public class Fakultas {
   private String fak, univ, rektor;
    public Fakultas(String f, String u, String r){
        fak = f;
        univ = u;
        rektor = r;
    }
    public void setFakultas(String f){
        fak = f;;
    }
    public String getFakultas(){
        return fak;
    }
    public void setUniv(String u){
        univ = u;
    }
    public String getUniv(){
        return univ;
    }
    public void setRektor(String r){
        rektor = r;
    }
    public String getRektor(){
        return rektor;
    }
    
}
