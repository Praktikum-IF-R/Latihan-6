/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_6;

/**
 *
 * @author Rexy
 */
public class Fakultas {
    private String universitas;
    private String rektor;
    private String fakultas;

    public void Fakultas(String a,String b,String c){
        universitas = a;
        rektor = b;
        fakultas = c;
    }
    public String getUniversitas() {
        return universitas;
    }

    
    public String getFakultas() {
        return fakultas;
    }

    
    public String getRektor() {
        return rektor;
    }

    
    
public void Fakultas(){
    System.out.println("Nama Universitas\t:"+getUniversitas());
    System.out.println("Nama Rektor\t:"+getRektor());
    System.out.println("Nama Fakultas\t:"+getFakultas());
    
}


}
