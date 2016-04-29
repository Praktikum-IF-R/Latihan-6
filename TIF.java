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
public class TIF extends fakultas {
    private String kaprod;
    private String[]minat={"komputasi cerdas","RPL","Game","Operating System"};
    private String[]lab={"Game","Artificial Intel","Operating System"};
    private String[]dosen={"prof.Andi Triyono","Gugun Ruhiyat","Julian Derick","Kintan Lisius"};
    public TIF(){
        kaprod="Prof.Andi Triyono,SE";
    }
    public void display(){
        System.out.println("nama ketua prodi: "+kaprod);
        for (int x=0;x<minat.length;x++){
            System.out.println("minat "+(x+1)+": "+minat[x]);}
        for (int y=0;y<lab.length;y++){
            System.out.println("lab "+(y+1)+": "+lab[y]);}
        for (int z=0;z<dosen.length;z++){
            System.out.println("dosen "+(z+1)+": "+dosen[z]);}
    }
}
