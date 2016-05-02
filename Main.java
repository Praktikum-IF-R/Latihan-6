/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author DS
 */
public interface Main {

   
    public static void main(String[] args) {
        Fakultas Test = new Fakultas();
        //pengisian data berdasar setiap subclass dengan constructor
        Informatika IF = new Informatika("Dicky", "informatika",50, 900, 10, 5 );
        SistemInformasi SI = new SistemInformasi("Satriawan","Sistem Informasi", 40, 500, 9, 4 );
        SistemKomputer SK = new SistemKomputer("Elke Hilmi", "Sistem Komputer", 30, 300, 8, 3);
        System.out.println("************ INHERITANCE ************");       
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        //pengisisan berdasar default constructor pada superclass
        System.out.println("nama Universitas: " + Test.univ);
        System.out.println("Nama Rektor     : " + Test.Rektor);
        System.out.println("Nama Fakultas   : "+Test.Fakultas);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        //pengisian data setiap subclass berdasar pada parameter pada saat menginstance object per subclass
        
        System.out.println("nama prodi      : " + IF.Prodi);
        System.out.println("nama dekan      : " + IF.dekan);        
        System.out.println("jumlah dosen    : " + IF.dosen);
        System.out.println("jumlah mahasiswa: " + IF.mahasiswa);
        System.out.println("jumlah lab      : " + IF.lab);
        System.out.println("jumlah keminatan: " + IF.minat);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("nama prodi      : " + SI.Prodi);
        System.out.println("nama dekan      : " + SI.dekan);
        System.out.println("jumlah dosen    : " + SI.dosen);
        System.out.println("jumlah mahasiswa: " + SI.mahasiswa);
        System.out.println("jumlah lab      : " + SI.lab);
        System.out.println("jumlah keminatan: " + SI.minat);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("nama prodi      : " + SK.Prodi);
        System.out.println("nama dekan      : " + SK.dekan);
        System.out.println("jumlah dosen    : " + SK.dosen);
        System.out.println("jumlah mahasiswa: " + SK.mahasiswa);
        System.out.println("jumlah lab      : " + SK.lab);
        System.out.println("jumlah keminatan: " + SK.minat);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
