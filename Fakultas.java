/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultas;

/**
 *
 * @author Acer-pc
 */
public class Fakultas {
    private String Universitas, Fakultas, namaRektor;
    private String Laboratorium;
    private String Keminatan;
    private String namaDosen;
    private String KaProDi;
    
    public Fakultas(){
        Universitas = "Brawijaya";
        Fakultas = "Filkom";
        namaRektor = "Sutris";
    }
    
    public Fakultas(String universitas, String fakultas, String nama){
        Universitas = universitas;
        Fakultas = fakultas;
        namaRektor = nama;
    }
    
     public Fakultas(String l, String k, String nd, String kp){
        Laboratorium = l;
        Keminatan = k;
        namaDosen = nd;
        KaProDi = kp;
    }
    
    public void setJurusan(String l, String k, String nd, String kp){
        Laboratorium = l;
        Keminatan = k;
        namaDosen = nd;
        KaProDi = kp;
    }
    
    public String getUniversitas(){
        return Universitas;
    }
    
    public String getFakultas(){
        return Fakultas;
    }
    
    public String getNamaRektor(){
        return namaRektor;
    }
    
    public String getLab(){
        return Laboratorium;
    }
    
    public String getKeminatan(){
        return Keminatan;
    }
    
    public String getNamaDosen(){
        return namaDosen;
    }
    
    public String getKaProDi(){
        return KaProDi;
    }
        
    public void display(){
        System.out.println("Universitas          : "+Universitas);
        System.out.println("Fakultas             : "+Fakultas);
        System.out.println("Rektor               : "+namaRektor);
    }
    
    
    
}
