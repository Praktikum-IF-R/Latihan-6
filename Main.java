/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Fakultas a1 = new Fakultas();
        Informatika a2 = new Informatika();
        SI a3 = new SI();
        Siskom a4 = new Siskom();
        System.out.println("Pilihan Program Studi");
        System.out.println("1. Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Sistem Komputer");
        System.out.print("Masukkan pilihan Anda : ");
        int c = x.nextInt();
        System.out.println();
        switch(c){
            case 1 : a1.Display();
                     a2.Display1();break;
            case 2 : a1.Display();
                     a3.Display1();break;
            case 3 : a1.Display();
                     a4.Display1();break;
            default : System.exit(0);
        }
    }
}
