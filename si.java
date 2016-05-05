/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latinheritance;

/**
 *
 * @author ANITA
 */
public class si extends Fakultas {
    private String dosen, lab, minat, kaprodi;
    
    public si(){
        kaprodi = "Suprapto, ST., MT";
    }
    
    public si(String d, String l, String m){
        kaprodi = "Suprapto, ST., MT";
        dosen = d;
        lab = l;
        minat = m;
        
    }
    
    public void namadosen(String d){
        dosen = d;
    }
    
    public void namalab(String l){
        lab = l;
    }
    
    public void keminatan(String m){
        minat = m;
    }
        
    public String getdosen(){
        return dosen;
    }
    
    public String getminat(){
        return minat;
    }
    
    public String getlab(){
        return lab;
    }
    
    
}
