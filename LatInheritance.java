/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latinheritance;
import java.util.Scanner;
/**
 *
 * @author ANITA
 */
public class LatInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ins = new Scanner(System.in);
        int pil;
        String nama, lab, minat;
        Ilkom ti = new Ilkom();
        si si = new si();
        siskom siskom = new siskom();        
        
        System.out.println("      UNIVERSITAS BRAWIJAYA MALANG");
        System.out.println("         FAKULTAS ILMU KOMPUTER   ");
        System.out.println("============================================");
        System.out.println("1. Prodi INFORMATIKA");
        System.out.println("2. Prodi SISTEM INFORMASI");
        System.out.println("3. Prodi SISTEM KOMPUTER");
        System.out.print("Pilihan     : ");
        pil = in.nextInt();
        System.out.println("");
        switch(pil){
            case 1 : 
                System.out.print("Masukkan nama dosen        : ");
                nama = ins.nextLine();
                ti.namadosen(nama);
                System.out.print("Masukkan nama laboratorium : ");
                lab = ins.nextLine();
                ti.namalab(lab);
                System.out.print("Masukkan keminatan         : ");
                minat = ins.nextLine();
                ti.keminatan(minat);
                System.out.println("");
                
                ti.namauniv();
                ti.namafak();
                ti.rektor();
                System.out.println("--------------------------------------------");
                System.out.println("NAMA DOSEN      : "+ti.getdosen());
                System.out.println("KEMINATAN       : "+ti.getminat());
                System.out.println("LABORATORIUM    : "+ti.getlab());                
                System.out.println("            **************    ");
                break;
            case 2 : 
                System.out.print("Masukkan nama dosen        : ");
                nama = ins.nextLine();
                si.namadosen(nama);
                System.out.print("Masukkan nama laboratorium : ");
                lab = ins.nextLine();
                si.namalab(lab);
                System.out.print("Masukkan keminatan         : ");
                minat = ins.nextLine();
                si.keminatan(minat);
                System.out.println("");
                
                si.namauniv();
                si.namafak();
                si.rektor();
                System.out.println("--------------------------------------------");
                System.out.println("NAMA DOSEN      : "+si.getdosen());
                System.out.println("KEMINATAN       : "+si.getminat());
                System.out.println("LABORATORIUM    : "+si.getlab());                
                System.out.println("            **************    ");
                break;
            case 3 : 
                System.out.print("Masukkan nama dosen        : ");
                nama = ins.nextLine();
                siskom.namadosen(nama);
                System.out.print("Masukkan nama laboratorium : ");
                lab = ins.nextLine();
                siskom.namalab(lab);
                System.out.print("Masukkan keminatan         : ");
                minat = ins.nextLine();
                siskom.keminatan(minat);
                System.out.println("");
                
                siskom.namauniv();
                siskom.namafak();
                siskom.rektor();
                System.out.println("--------------------------------------------");
                System.out.println("NAMA DOSEN      : "+siskom.getdosen());
                System.out.println("KEMINATAN       : "+siskom.getminat());
                System.out.println("LABORATORIUM    : "+siskom.getlab());                
                System.out.println("            **************    ");
                break;
            default : 
                System.out.println("     Jurusan tidak ada!");
                System.out.println("    *** TERIMA KASIH ***    ");
                System.exit(0);
        }
        
        
    }
    
}
