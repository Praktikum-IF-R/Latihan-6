
package fakultas;

public class SistemKomputer {
    private String Lab;
 private String keminatan;
 private String dosen;
 private String KAprodi;
 
    public SistemKomputer(String Lab,String keminatan,String dosen,String KAprodi){
     this.Lab=Lab;
     this.dosen=dosen;
     this.keminatan=keminatan;
     this.KAprodi=KAprodi;
}

    public SistemKomputer() {
        
    }
    public String getLab(){
     return "Laboratorium Sistem Komputer Dasar ";
 }
 public String getkeminatan(){
     return "Elektronika Dasar";
 }
 public String getdosen(){
     return "Dr. Reza Firsandaya Malik, S.T., M. ";
 }
 public String getKAprodi(){
     return "Dr. Ermatita M.Kom. ";
 }
 public void data(){
     System.out.println("Lab            :"+getLab());
     System.out.println("Keminatan      :"+getkeminatan());
     System.out.println("Dosen          :"+getdosen());
     System.out.println("Kepala Prodi   :"+getKAprodi());
 }
}
