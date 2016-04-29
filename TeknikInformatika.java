
package fakultas;
public class TeknikInformatika extends Fakultas{
    public TeknikInformatika(String lab, String minat, String kaprodi, String dosen){
        super(lab, minat, kaprodi, dosen);
    }
    public void InformatikaMessage(){
        System.out.println("Nama Lab :"+Fakultas.getLab());
        System.out.println("Nama Keminatan :"+Fakultas.getMinat());
        System.out.println("Nama Kepala Program Studi"+Fakultas.getKaprodi());
        System.out.println("Nama Dosen :"+Fakultas.getDosen());
}
}
