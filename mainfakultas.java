/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum6;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class mainfakultas {
    public static void main(String[] args) {
        Scanner masuk= new Scanner(System.in);
        fakultas fak=new fakultas();
        System.out.println("pilihan prodi: ");
        System.out.println("1. Informatika\n2. Sistem Informasi\n3. Sistem Komputer");
        System.out.print("masukan pilihan prodi: ");
        int a=masuk.nextInt();
        switch(a){
            case 1: TIF infor=new TIF();
                fak.display();
                infor.display();
                break;
            case 2: SI si=new SI();
                fak.display();
                si.display();
                break;
            case 3: Siskom sk=new Siskom();
                fak.display();
                sk.display();
                break;
        }
    }
}
