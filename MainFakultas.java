package fakultas;

public class MainFakultas {
    public static void main(String[] args) {        
        System.out.println("Teknik Informatika");
    TeknikInformatika a = new TeknikInformatika("Laboratorium Rekayasa Perangkat Lunak","Rekayasa Perangkat Lunak","Issa Arwani","Drs Candra Dewi");
    a.InformatikaMessage();
        System.out.println();
        System.out.println("Sistem Komputer");
    SistemKomputer b= new SistemKomputer("Laboratorium Jaringan","Jaringan","Sutrisno","Eko Sakti");
    b.SiskomMessage();
        System.out.println();
        System.out.println("Sistem Informasi");
    SistemInformasi c=new SistemInformasi("Laboratorium Sistem Informasi","Database","Suprapto","Satrio Agung");
    c.SIMessage();
}
}