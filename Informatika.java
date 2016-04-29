/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuliah;

/**
 *
 * @author imgeek
 */
public class Informatika extends Fakultas {

    private String lab, minat, dosen, ketua;
  
    public Informatika(String fak, String rek, String univ) {
        super (fak, rek, univ);
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
    public void setKetua(String k){
        this.ketua=k;
    }
    public String getKetua(){
        return ketua;
    }
    
}
