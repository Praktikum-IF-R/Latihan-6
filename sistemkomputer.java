package lap6inherit;
public class sistemkomputer extends filkom {
    public String getLab(){
        return "Robotics Laboratory";
    }
    public String getMinat(){
        return "Robotika";
    }
    public String getDosen(){
        return "Gembong Edhi Setyawan, S.T, M.T";
    }
    public String getKaprodi(){
        return "Barlian Henryranu Prasetio, S.T, M.T";
    }
    public void setLab(String lab,String minat,String dosen,String kaprodi){
        this.lab=lab;
        this.minat=minat;
        this.dosen=dosen;
        this.kaprodi=kaprodi;
    }
    public void Display(){
        System.out.println("====================== Sistem Komputer ======================");
        System.out.println("Laboratorium          : "+getLab());
        System.out.println("Keminatan             : "+getMinat());
        System.out.println("Dosen                 : "+getDosen());
        System.out.println("Kepala Program Studi  : "+getKaprodi());
    }    
}
    

