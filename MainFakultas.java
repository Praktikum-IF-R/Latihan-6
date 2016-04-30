package javaapplication3;

import java.util.*;

public class MainFakultas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama universitas: ");
        String universitas = in.nextLine();
        System.out.print("Nama Rektor: ");
        String rektor = in.nextLine();
        System.out.print("Fakultas: ");
        String fakultas = in.nextLine();
        Fakultas filkom = new Fakultas(universitas, rektor, fakultas);
        Informatika informatika = new Informatika(universitas, rektor, fakultas);
        SisKom siskom = new SisKom(universitas, rektor, fakultas);
        SistemInformasi si = new SistemInformasi(universitas, rektor, fakultas);
        informatika.Informatika("Komputasi Cerdas & Visualisasi","Komputasi Cerdas", "Candra Dewi,S.Kom,M.Sc", "Issa Arwani,S.Kom,M.Sc");
        siskom.Siskom("Sistem Komputer & Robotika", "Teknik Komputer", "Agung Setia Budi,S.T, M.T", "Sabriansyah Rizqika Akbar,S.T,M.Eng");
        si.SistemInformasi("Sistem Informasi", "Sistem Informasi", "Yusi Tyroni Mursityo,S.Kom ", "Suprapto,S.T,M.T");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(filkom.getUniversitas());
        System.out.println(filkom.getRektor());
        System.out.println(filkom.getFakultas());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Program Studi\t\t Laboratorium\t\t\t Dosen\t\t\t\t Keminatan\t\t Ketua Prodi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Informatika  \t\t "+informatika.getLab()+"  "+informatika.getDosen()+"\t\t "+informatika.getKeminatan()+"\t "+informatika.getKetuaprodi());
        System.out.println("Sistem Komputer \t "+siskom.getLab()+"\t "+siskom.getDosen()+"\t "+siskom.getKeminatan()+"\t "+siskom.getKetuaprodi());
        System.out.println("Sistem Informasi  \t "+si.getLab()+"\t\t "+si.getDosen()+"\t "+si.getKeminatan()+"\t "+si.getKetuaprodi());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
