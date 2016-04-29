/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultas;


public class TIF extends Fakultas{
String lab,minat,dosen,ketua;
public TIF(){
    
}
public TIF(String minat, String lab, String dosen, String ketua){
    this.minat=minat;
    this.lab=lab;
    this.dosen=dosen;
    this.ketua=ketua;
}
public void setMinat(String m){
    minat=m;
}
public String getMinat(){
    return minat;
}
public void setLab(String l){
    lab=l;
}
public String getLab(){
    return lab;
}
public void setDosen(String d){
    dosen=d;
}
public String getDosen(){
    return dosen;
}
public void setKetua(String k){
    ketua=k;
}
public String getKetua(){
    return ketua;
}
public void display(){
    System.out.println("==============================================");
    System.out.println("Keminatan       : "+minat);
    System.out.println("Laboratorium    : "+lab);
    System.out.println("Dosen           : "+dosen);
    System.out.println("Ketua Prodi     : "+ketua);
    System.out.println("==============================================");
}
}
