package fakultas;

public class Fakultas {
    private String fakultas, rektor, universitas;
    public Fakultas (String f, String r, String u){
        this.fakultas = f;
        this.rektor = r;
        this.universitas = u;
    }
    public String getFakultas(){
        return fakultas;
    }
    public String getRektor(){
        return rektor;
    }
    public String getUniversitas(){
        return universitas;
    }
    
}
