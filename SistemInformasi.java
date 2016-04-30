package fakultas;

public class SistemInformasi {
 private String Lab;
 private String keminatan;
 private String dosen;
 private String prodi;
 
 public SistemInformasi(){
     
 }
    public SistemInformasi(String Lab,String keminatan,String dosen,String prodi){
     this.Lab=Lab;
     this.dosen=dosen;
     this.keminatan=keminatan;
     this.prodi=prodi;
}
    public String getLab(){
     return "Lab Perencanaan dan Pembangunan Sistem Informasi";
 }
 public String getkeminatan(){
     return "Perencanaan dan Pembangunan Sistem Informasi";
 }
 public String getdosen(){
     return "Dr. Ermatita M.Kom. ";
 }
 public String getprodi(){
     return "YUDHA PRATOMO, MSC, PHD ";
 }
  public void data(){
      System.out.println("LAB           :"+getLab());
      System.out.println("Keminatan     :"+getkeminatan());
      System.out.println("dosen         :"+getdosen());
      System.out.println("Kepala prodi  :"+getprodi());
  }
}