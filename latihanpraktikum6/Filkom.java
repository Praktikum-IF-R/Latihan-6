package LatihanPraktikum6;
public class Filkom {
   private String Fakultas, Universitas, Rektor;
    public Filkom(String f, String u, String r){
        Fakultas = f;
        Universitas = u;
        Rektor = r;
    }
    public void setFilkom(String f){
        Fakultas = f;;
    }
    public String getFilkom(){
        return Fakultas;
    }
    public void setUniversitas(String u){
        Universitas = u;
    }
    public String getUniversitas(){
        return Universitas;
    }
    public void setRektor(String r){
        Rektor = r;
    }
    public String getRektor(){
        return Rektor;
    }
}