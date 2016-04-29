package Inheritance;
public class Informatika extends Fakultas {
    private String Labor;
    private String Keminatan;
    private String Dosen;
    private String KetuaStudi;
    
public Informatika(String F, String R, String U){
    super(F, R, U);
}
public void setLabor(String L){
    Labor = L;
}
public String getLabor(){
    return Labor;
}
public void setKeminatan(String K){
    Keminatan = K;
}
public String getKeminatan(){
    return Keminatan;
}
public void setDosen(String D){
    Dosen = D;
}
public String getDosen(){
    return Dosen;
}
public void setKetuaStudi(String KS){
    KetuaStudi = KS;
}
public String getKetuaStudi(){
    return KetuaStudi;
}

    
}
