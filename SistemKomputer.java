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
public class SistemKomputer extends Fakultas {
    
    public SistemKomputer(){
        
    }
    
    public SistemKomputer(String l, String k, String nd, String kp){
        super(l,k,nd,kp);
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Jurusan              : Sistem Komputer");
        System.out.println("Keminatan            : "+getKeminatan());
        System.out.println("Nama Laboratorium    : "+getLab());
        System.out.println("Nama Dosen           : "+getNamaDosen());
        System.out.println("Kepala Program Studi : "+getKaProDi());
    }
    
}
