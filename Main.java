package fakultas;
import java.util.*;
public class Main {
  public static void main(String []args){
      Scanner input=new Scanner(System.in);
Informatika TI=new Informatika();
SistemInformasi SI=new SistemInformasi();
SistemKomputer SK=new SistemKomputer();
Fakultas F=new Fakultas ();
      System.out.println("--------------------------");
      System.out.print("Masukan Nama Anda :");
      String Nama =input.next();
      System.out.print("Masukan NIM Anda :");
      String NIM =input.next();
      System.out.println();
      System.out.println("--------------------------");
      F.data();
      System.out.println("--------------------------");
      System.out.println("   Daftar Jurusan  ");
      System.out.println("1.Teknik Informatika");
      System.out.println("2.Sistem Informasi");
      System.out.println("3.Sistem Komputer");
      System.out.print("Masukan Program studi:");
        int pilihan = input.nextInt();
        System.out.println("--------------------------");
         if(pilihan ==1){
             TI.data();
         }else if(pilihan ==2){
             SI.data();
         }else if(pilihan == 3){
             SK.data();
         }else{
             System.out.println("Pilihan Anda Tidak Ada ");
         }
             
    }
  }  

