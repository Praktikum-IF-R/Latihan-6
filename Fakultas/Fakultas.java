
package fakultas;
public class Fakultas {
    private String fakultas, universitas, rektor;
    public Fakultas(){
        fakultas="";
        universitas="";
        rektor="";
    }
   public Fakultas(String f, String u, String r){
       fakultas=f;
       universitas=u;
       rektor=r;
   } 
    public String getNamafak(){
        return fakultas;
    }
    public String getUniv(){
        return universitas;
    }
    public String getRektor(){
        return rektor;
    }
}
