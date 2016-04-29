package fakultas;
public class IF extends Fakultas {
    private String namaD;
    private String namaKPS;
    private String lab;
    private String minat;
    public static void NamaD(String nama){
        String namaD=nama;
        System.out.println("No\t||\tNama Dosen\t||");
        System.out.println("1\t||\tChandra Dewi\t||");
        System.out.println("2\t||\tMardji\t||");
    }
    public static void NamaKPS(String nama){
        String namaKPS=nama;
        System.out.println("Ketua Program Study : Ivan Primananda");
    }
    public static void Lab(String s){
        String lab=s;
        System.out.println("Laboraturium yang Tersedia  :");
        System.out.println("1. Pemrograman\n2. Robotik");
    }
    public static void Minat(String s){
        String minat=s;
        System.out.println("Minat dan Bakat         :");
        System.out.println("1. Futsal");
        System.out.println("2. Basket");
    }
}
