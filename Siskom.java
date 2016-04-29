/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum6;

/**
 *
 * @author Lenovo
 */
public class Siskom extends fakultas {
    private String kaprod;
    private String[]minat={"Jaringan","robotik"};
    private String[]lab={"jaringan","robotik"};
    private String[]dosen={"prof.Kurniawan gugun","Yayan Columbus","Saiful Jamil"};
    public Siskom(){
        kaprod="Prof.Kurniawan Gugun,SE";
    }
    public void display(){
        System.out.println("nama ketua prodi: "+kaprod);
        for (int i=0;i<minat.length;i++){
            System.out.println("minat "+(i+1)+": "+minat[i]);}
        for (int i=0;i<lab.length;i++){
            System.out.println("lab "+(i+1)+": "+lab[i]);}
        for (int i=0;i<dosen.length;i++){
            System.out.println("dosen "+(i+1)+": "+dosen[i]);}
    }
}
