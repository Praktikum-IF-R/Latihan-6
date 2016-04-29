
package latihan6;

public class Fakultas {
    
    protected final String univ = "UNIVERSITAS BRAWIJAYA";
    protected final String rektor = "Prof. Dr. Ir. M. Bisri, MS";
    protected final String fakultas = "FAKULTAS ILMU KOMPUTER";
    protected String lab;
    protected String keminatan;
    protected String dosen;
    protected String ketua;
    
    public Fakultas (){
        
    }
    public void setLab(String lab){
        this.lab = lab;
    }
    public String getLab(){
        return lab;
    }
    public void setKeminatan(String keminatan){
        this.keminatan = keminatan;
    }
    public String getKeminatan(){
        return keminatan;
    }
    public void setDosen(String dosen){
        this.dosen = dosen;
    }
    public String getDosen(){
        return dosen;
    }
    public void setKetua(String prodi){
        this.ketua = prodi;
    }
    public String getKetua(){
        return ketua;
    }
    public void tes(){
        System.out.println(univ+"\n Nama Rektor : "+rektor+"\n "+fakultas);
        System.out.println("");
    }
    public void tampil (){
        System.out.println("LABORATORIUM : "+lab);
        System.out.println("KEMINATAN    : "+keminatan);
        System.out.println("DOSEN        : "+dosen);
        System.out.println("KETUA JURUSAN : "+ketua);
    }  
}
