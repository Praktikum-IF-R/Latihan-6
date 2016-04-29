package Inheritence;
public class SisInformasi extends Fakultas{
    private String kajur,lab,minat;
    public String Fakultas(){
        return fak;
    } 
    public String Rektor(){
        return rektor;
    }
    public String Univ(){
        return univ;
    }
    public void setKajur(String a){
        kajur = a;
    }
    public String getKajur(){
        return kajur;
    }
    public void setLab(String a){
        lab = a;
    }
    public String getLab(){
        return lab;
    }
    public void setMinat(String a){
        minat = a;
    }
    public String getMinat(){
        return minat;
    }
}
