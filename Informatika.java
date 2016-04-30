package fakultas;

public class Informatika {
 private String Lab;
 private String keminatan;
 private String dosen;
 private String KAprodi;
 
 public Informatika(){
     
 }
 public Informatika(String Lab,String keminatan,String dosen,String KAprodi){
     this.Lab=Lab;
     this.dosen=dosen;
     this.keminatan=keminatan;
     this.KAprodi=KAprodi;
 }

 public String getLab(){
     return "Laboratorium Jaringan dan Arsitektur Komputer";
 }
 public String getkeminatan(){
     return "Jaringan Komputer";
 }
 public String getdosen(){
     return "Dr. H. Nugraha, SE, Ak, M.Si";
 }
 public String getKAprodi(){
     return "Prof. Dr.H. Agus Rahayu, M.Si";
 }
 public void data(){
     System.out.println("Lab            :"+getLab());
     System.out.println("Keminatan      :"+getkeminatan());
     System.out.println("Dosen          :"+getdosen());
     System.out.println("Kepala Prodi   :"+getKAprodi());
 }
 
 
}
