package lap6inherit;
public class sisteminformasi extends filkom {
    public String getLab(){
        return "Information System Laboratory";
    }
    public String getMinat(){
        return "Manajemen Data";
    }
    public String getDosen(){
        return "Satrio Agung W., S.Kom, M.Kom";
    }
    public String getKaprodi(){
        return "Suprapto, S.T, M.T";
    }
    public void setLab(String lab,String minat,String dosen,String kaprodi){
        this.lab=lab;
        this.minat=minat;
        this.dosen=dosen;
        this.kaprodi=kaprodi;
    }
    public void Display(){
        System.out.println("===================== Sistem Informasi ======================");
        System.out.println("Laboratorium          : "+getLab());
        System.out.println("Keminatan             : "+getMinat());
        System.out.println("Dosen                 : "+getDosen());
        System.out.println("Kepala Program Studi  : "+getKaprodi());
    }    
}
