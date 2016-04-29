/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultas;

import java.util.Scanner;

/**
 *
 * @author Acer-pc
 */
public class MainFakultas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String Universitas, Fakultas, jurusan, Rektor, Laboratorium, Keminatan, Dosen, ProgramStudi;
        
        System.out.print("Masukan Nama Universitas :");
        Universitas = in.nextLine();
        System.out.print("Masukan Nama Fakultas    :");
        Fakultas = in.nextLine();
        System.out.print("Masukan Nama Rektor      :");
        Rektor = in.nextLine();
        
        Fakultas fakultas = new Fakultas(Universitas, Fakultas, Rektor);
        
        System.out.println("\nDaftar Jurusan     ");
        System.out.println("===================");
        System.out.println("1. Informatika     ");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Sistem Komputer ");
        
        Informatika IF = new Informatika();
        SistemInformasi SI = new SistemInformasi();
        SistemKomputer SISKOM = new SistemKomputer();
        
        System.out.print("\nMasukan Nama Jurusan      :");
        jurusan = in.nextLine();
        
        if(jurusan.equalsIgnoreCase("informatika")){
            
            System.out.print("Masukan Nama Keminatan    :");
            Keminatan = in.nextLine();
            System.out.print("Masukan Nama Laboratorium :");
            Laboratorium = in.nextLine();
            System.out.print("Masukan Nama Dosen        :");
            Dosen = in.nextLine();
            System.out.print("Masukan Nama Kaprodi      :");
            ProgramStudi = in.nextLine();
        
            System.out.println("\n======================================");
            IF.setJurusan(Laboratorium, Keminatan, Dosen, ProgramStudi);
            IF.display();  
            System.out.println("======================================");
        }
        else if(jurusan.equalsIgnoreCase("sistem informasi")){
            
            System.out.print("Masukan Nama Keminatan    :");
            Keminatan = in.nextLine();
            System.out.print("Masukan Nama Laboratorium :");
            Laboratorium = in.nextLine();
            System.out.print("Masukan Nama Dosen        :");
            Dosen = in.nextLine();
            System.out.print("Masukan Nama Kaprodi      :");
            ProgramStudi = in.nextLine();
            
            System.out.println("\n======================================");
            SI.setJurusan(Laboratorium, Keminatan, Dosen, ProgramStudi);
            SI.display();  
            System.out.println("======================================");
        }
        else if(jurusan.equalsIgnoreCase("sistem komputer")){
           
            System.out.print("Masukan Nama Keminatan    :");
            Keminatan = in.nextLine();
            System.out.print("Masukan Nama Laboratorium :");
            Laboratorium = in.nextLine();
            System.out.print("Masukan Nama Dosen        :");
            Dosen = in.nextLine();
            System.out.print("Masukan Nama Kaprodi      :");
            ProgramStudi = in.nextLine();
        
            System.out.println("\n======================================");
            SI.setJurusan(Laboratorium, Keminatan, Dosen, ProgramStudi);
            SI.display();  
            System.out.println("======================================");
        }
        else{
            System.out.println("Jurusan Tidak Tersedia");
        }
            
      
        
        
    }
    
}
