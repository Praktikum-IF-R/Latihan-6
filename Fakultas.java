package fakultas;
import java.util.*;
public class Fakultas {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("         UNIVERSITAS BRAWIJAYA MALANG");
        System.out.println("            REKTOR : PAK BISRI");
        System.out.println("=================================================");
        int plh;
        String lagi;
        do{
        System.out.println("            FAKULTAS ILMU KOMPUTER");
        System.out.println("             Daftar Program Studi");
        System.out.println("No\t||\tProgram Studi\t\t||\tJenjang\t||");
        System.out.println("1\t||\tTeknik Informatika\t||\tS1\t||");
        System.out.println("2\t||\tSistem Informasi\t||\tS1\t||");
        System.out.println("3\t||\tSistem Komputer\t\t||\tS1\t||");
        System.out.println("4\t||\tKeluar Program\t\t\t\t||");
        System.out.print("Masukan Nomor Pilihan Anda    : ");
        plh=in.nextInt();
        switch(plh){
            case 1:
                IF.NamaD("");
                IF.NamaKPS("");
                IF.Lab("");
                IF.Minat("");
                break;
            case 2:
                SI.NamaD("");
                SI.NamaKPS("");
                SI.Lab("");
                SI.Minat("");
                break;
            case 3:
                SISKOM.NamaD("");
                SISKOM.NamaKPS("");
                SISKOM.Lab("");
                SISKOM.Minat("");
                break;
            case 4:
                System.out.println("Terima Kasih");
        }
            System.out.println("Anda Ingin Mengecek Data Lagi?(y/t) : ");
            lagi=in.next();
    }while(lagi.equalsIgnoreCase("y"));
    }
}
