package fakultas;
import java.util.Scanner;
public class Fakultas {
private String fakultas;
public String universitas;
public String namarek;

public Fakultas(){
    
}
    
public Fakultas(String fakultas ,String universitas,String namarek){
    this.fakultas=fakultas;
    this.universitas=universitas;
    this.namarek=namarek;
}
public String getfakultas(){
    return "Fakultas Ilmu Komputer";
}
public String getuniversitas(){
    return "Universitas Brawijaya";
}
public String getnamarek(){
    return"Prof. Dr. Ir. Mohammad Bisri, M.S.";
}

        public void data(){
            System.out.println("Nama Fakultas       :"+getfakultas());
            System.out.println("Nama Universitas    :"+getuniversitas());
            System.out.println("Nama Rektorat       :"+getnamarek());
        }
}