/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_6;

/**
 *
 * @author Rexy
 */
import java.util.Scanner;
public class TestProg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Program Studi di Fakultas Ilmu Komputer\n");
        System.out.println("1.Informatika");
        System.out.println("2.Sistem Informasi");
        System.out.println("3.Sistem Komputer\n");
        System.out.print("Masukkan Pilihan anda  : ");
        System.out.println("");
        String pil1 = scn.nextLine();
        if(pil1.equalsIgnoreCase("1")){
        Fakultas info = new Fakultas();
            System.out.println("Anda memilih Prodi Teknik Informatika");
        info.Fakultas("Universitas Brawijaya","Prof. Dr. Ir. Mohammad Bisri, M.S.","Fakultas Ilmu Komputer");
        System.out.println("Nama Universitas : "+info.getUniversitas());
        System.out.println("Nama Rektor\t : "+info.getRektor());
        System.out.println("Nama Fakultas\t : "+info.getFakultas());
            System.out.println("");
        Informatika info2 = new Informatika();
        info2.Informatika("Drs. Marji, MT","Candra Dewi","Jarkom","LabJarkom");
            System.out.println("Nama Kepala Prodi: " + info2.getKepala());
            System.out.println("Nama Dosen\t : " + info2.getDosen());
            System.out.println("Nama Keminatan\t : " + info2.getMinat());
            System.out.println("Nama Lab\t : " + info2.getLaboratorium());
        }
        else if(pil1.equalsIgnoreCase("2")){
            Fakultas info = new Fakultas();
            System.out.println("Anda Memilih Prodi Sistem Informasi");
        info.Fakultas("Universitas Brawijaya","Prof. Dr. Ir. Mohammad Bisri, M.S.","Fakultas Ilmu Komputer");
        System.out.println("Nama Universitas:"+info.getUniversitas());
        System.out.println("Nama Rektor\t:"+info.getRektor());
        System.out.println("Nama Fakultas\t:"+info.getFakultas());
            System.out.println("");
            
SistemInformasi info3 = new SistemInformasi();
        info3.SistemInformasi("Suprapto, ST., MT","Aditya Rachmadi, S.ST., M.TI","Database","Laboratorium Sistem Informasi ");
            System.out.println("Nama Kepala Prodi:" + info3.getKepala());
            System.out.println("Nama Dosen\t :" + info3.getDosen());
            System.out.println("Nama Keminatan  :" + info3.getMinat());
            System.out.println("Nama Lab\t:" + info3.getLaboratorium());
        
        }
        else if(pil1.equalsIgnoreCase("3")){
            Fakultas info = new Fakultas();
            System.out.println("Anda Memilih Prodi Sistem Komputer");
        info.Fakultas("Universitas Brawijaya","Prof. Dr. Ir. Mohammad Bisri, M.S.","Fakultas Ilmu Komputer");
        System.out.println("Nama Universitas :"+info.getUniversitas());
        System.out.println("Nama Rektor\t :"+info.getRektor());
        System.out.println("Nama Fakultas\t :"+info.getFakultas());
            System.out.println("");
             SistemKomputer info3 = new SistemKomputer();
        info3.SistemKomputer("Adharul Muttaqin, ST., MT","Wijaya Kurniawan","Komputasi Cerdas","Laboratorium Sistem Komputer dan Robotika");
            System.out.println("Nama Kaprodi\t:" + info3.getKepala());
            System.out.println("Nama Dosen\t:" + info3.getDosen());
            System.out.println("Nama Keminatan  :" + info3.getMinat());
            System.out.println("Nama Lab\t:" + info3.getLaboratorium());
        }
    }
    
}
