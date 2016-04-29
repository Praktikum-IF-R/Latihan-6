package lap6inherit;
public class informatika extends filkom {
    public String getLab(){
        return "Laboratory of Mobile Applications";
    }
    public String getMinat(){
        return "Kecerdasan Buatan";
    }
    public String getDosen(){
        return "Herman Tolle, Dr. Eng., S.T, M.T";
    }
    public String getKaprodi(){
        return "Drs. Mardji, M.T.";
    }
    public void setLab(String lab,String minat,String dosen,String kaprodi){
        this.lab=lab;
        this.minat=minat;
        this.dosen=dosen;
        this.kaprodi=kaprodi;
    }
    public void Display(){
        System.out.println("======================== Informatika ========================");
        System.out.println("Laboratorium          : "+getLab());
        System.out.println("Keminatan             : "+getMinat());
        System.out.println("Dosen                 : "+getDosen());
        System.out.println("Kepala Program Studi  : "+getKaprodi());
    }    
}