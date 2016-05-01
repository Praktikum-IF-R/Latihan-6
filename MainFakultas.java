package inheritanceVI;
import java.util.Scanner;
public class MainFakultas {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        Fakultas fac = new Fakultas("Brawijaya","Prof. Dr. Ir. Mohammad Bisri, M. S.","Ilmu Komputer");
        filkomTIF tif = new filkomTIF("Brawijaya","Prof. Dr. Ir. Mohammad Bisri, M. S.","Informatika");
        filkomSI si = new filkomSI("Brawijaya","Prof. Dr. Ir. Mohammad Bisri, M. S.","Sistem Informasi");
        filkomPTI pti = new filkomPTI("Brawijaya","Prof. Dr. Ir. Mohammad Bisri, M. S.","Pendidikan Teknologi Informasi");
        tif.setDekan("Drs. Marji, MT");
        tif.setDosen("Wibisono Sukmo Wardhono, S.T, M.T");
        tif.setLab("Candra Dewi, S.Kom, M.Sc");
        tif.setMinat("Wijaya Kurniawan, S.T, M.T");
        si.setDekan("Suprapto, S.T, M.T");
        si.setDosen("Ismiarta Aknuranda, S.T, M.Sc, Ph.D");
        si.setLab("Eko Sakti Pramukanturo, S.Kom, M.Kom");
        si.setMinat("Denny Sagita Rusdianto, S.Kom, M.Kom");
        pti.setDekan("Satrio Agung W., S.Kom, M.Kom");
        pti.setDosen("Gembong Edhi Setyawan, S.T, M.T");
        pti.setLab("Admaja Dwi Herlambang, S.Pd, M.Pd");
        pti.setMinat("Retno Indah Rokhmawati, S.Pd, M.Pd");
        int choose;
        do{
            fac.displayMessage();
            System.out.println("============================================");
            System.out.println("Daftar Jurusan : ");
            System.out.println("1. Teknik Informatika");
            System.out.println("2. Sistem Informasi");
            System.out.println("3. Pendidikan Teknologi Informasi");
            System.out.println("4. Keluar");
            System.out.println("============================================");
            System.out.print("Pilihan anda : ");
            choose = in.nextInt();
            switch(choose){
                case 1:{
                    System.out.println("Jurusan      : Teknik Informatika");
                    System.out.println("Ketua Prodi  : "+tif.getDekan());
                    System.out.println("Dosen        : "+tif.getDosen());
                    System.out.println("Laboratorium : "+tif.getLab());
                    System.out.println("Keminatan    : "+tif.getMinat());
                    System.out.println("");
                    break;
                }
                case 2:{
                    System.out.println("Jurusan      : Sistem Informasi");
                    System.out.println("Ketua Prodi  : "+si.getDekan());
                    System.out.println("Dosen        : "+si.getDosen());
                    System.out.println("Laboratorium : "+si.getLab());
                    System.out.println("Keminatan    : "+si.getMinat());
                    System.out.println("");
                    break;
                }
                case 3:{
                    System.out.println("Jurusan      : Pendidikan Teknologi Informasi");
                    System.out.println("Ketua Prodi  : "+pti.getDekan());
                    System.out.println("Dosen        : "+pti.getDosen());
                    System.out.println("Laboratorium : "+pti.getLab());
                    System.out.println("Keminatan    : "+pti.getMinat());
                    System.out.println("");
                    break;
                }
                case 4:{
                    System.out.println("Terima kasih telah mengunjungin laman informasi Fakultas "+fac.getFaculty());
                    System.out.println("Sampai jumpa.");
                }
            }
        }while(choose!=4);
    }
}
