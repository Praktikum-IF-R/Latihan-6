package bab5;

public class mainfakultasub {
    public static void main(String[] args) {
        fakultasub ub = new fakultasub();
        informatika ub1 = new informatika();
        sisteminformasi ub2 = new sisteminformasi();
        sistemkomputer ub3 = new sistemkomputer();
        
        ub.tampil();
        System.out.println("");
        System.out.println("------FAKULTAS ILMU KOMPUTER-----");
        System.out.println("");    
        ub1.tampil();
        System.out.println("|                               |");
        ub2.tampil();
        System.out.println("|                               |");
        ub3.tampil();
        
    }
    
}
