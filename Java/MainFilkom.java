package filkom;
public class MainFilkom {
    public static void main(String[] args) {
        System.out.println("                      DATABASE SYSTEM                     ");
        System.out.println("==========================================================");
        Informatika TIF = new Informatika();
        TIF.display();
        System.out.println("==========================================================");
        SistemInformasi SI = new SistemInformasi();
        SI.display();
        System.out.println("==========================================================");
        SistemKomputer SK = new SistemKomputer();
        SK.display();
        System.out.println("==========================================================");
    }
}
