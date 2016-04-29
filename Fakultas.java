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
public class Fakultas {
    private String fakul, rekt, univs;
    public Fakultas(String fak, String rek, String univ){
       fakul=fak;
       rekt=rek;
       univs=univ;
               
    }
    public String getFakul(){
        return fakul;
    }
    public String getRekt(){
        return rekt;
    }
    public String getUniv(){
        return univs;
    }
}
