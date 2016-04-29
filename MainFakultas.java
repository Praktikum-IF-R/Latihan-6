package fakultas;
import java.util.Scanner;
public class MainFakultas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama fakultas : ");
        String f = input.nextLine();
        System.out.print("Masukkan nama universitas : ");
        String u = input.nextLine();
        System.out.print("Masukkan nama rektor : ");
        String r = input.nextLine();
        Fakultas prodi = new Fakultas(f,u,r);
        if(f.equalsIgnoreCase("filkom")){
            System.out.print("Masukkan prodi : ");
            String p = input.nextLine();
            System.out.print("Masukkan nama lab : ");
            String l = input.nextLine();
            System.out.print("Masukkan nama keminatan : ");
            String ke = input.nextLine();
            System.out.print("Masukkan nama kaprodi : ");
            String ka = input.nextLine();
            System.out.print("Masukkan nama dosen : ");
            String d = input.nextLine();
            System.out.println("---------------------------");
            if(p.equalsIgnoreCase("informatika")){
                Informatika i = new Informatika(f,u,r);
                i.setInformatika(l, ke, ka,d);
                prodi.display();
                i.display();
                System.out.println("---------------------------");
            }
            else if(p.equalsIgnoreCase("sistem informasi")){
                Sistem_Informasi si = new Sistem_Informasi(f,u,r);
                si.setSistemInformasi(l, ke, ka,d);
                prodi.display();
                si.display();
                System.out.println("---------------------------");
            }
            else {
                Sistem_Komputer sk = new Sistem_Komputer(f,u,r);
                sk.setSistemKomputer(l, ke, ka,d);
                prodi.display();
                sk.display();
                System.out.println("---------------------------");
            }
        }
        else{
            System.out.println("---------------------------");
            prodi.display();
            System.out.println("---------------------------");
        }
    }
}