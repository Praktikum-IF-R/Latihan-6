package inheritanceVI;
public class filkomTIF extends Fakultas{
    private String dekan;
    private String dosen;
    private String lab;
    private String keminatan;
    public filkomTIF(String u, String r, String f){
        super(u,r,f);
    }
    public void setDekan(String dek){
        dekan = dek;
    }
    public String getDekan(){
        return dekan;
    }
    public void setDosen(String dos){
        dosen = dos;
    }
    public String getDosen(){
        return dosen;
    }
    public void setLab(String labo){
        lab = labo;
    }
    public String getLab(){
        return lab;
    }
    public void setMinat(String kmntn){
        keminatan = kmntn;
    }
    public String getMinat(){
        return keminatan;
    }
}
