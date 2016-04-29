package fakultas;
public class Informatika extends Fakultas{
    private String lab,dosen,ketuaprodi,nama,nim,jur,minat;
    public Informatika(){
        lab="";
        minat="";
        dosen="";
        ketuaprodi="";
        nama="";
        nim="";
        jur="";
    }
    public Informatika(String l, String t,String d, String k, String n, String m, String j){
        lab=l;
        minat=t;
        dosen=d;
        ketuaprodi=k;
        nama=n;
        nim=m;
        jur=j;
    }
    public void setInformatika(String n, String m, String j){
        nama=n;
        nim=m;
        jur=j;
    }
    public String getLab(){
        return lab;
    }
    public String getDosen(){
        return dosen;
    }
    public String getKetua(){
        return ketuaprodi;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getJur(){
        return jur;
    }
    public String getMinat(){
        return minat;
    }
}
