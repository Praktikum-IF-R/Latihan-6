public class classtest {
    public static void main(String[] args) {
        Informatika a = new Informatika();
        SI b = new SI();
        Siskom c = new Siskom();
        a.setDosen("Wibisono");
        a.setKaprodi("Firstian");
        a.setKeminatan("RPL");
        a.setLab("labkomdas");
        System.out.println("Prodi Informatika\nNama dosen: "+a.getDosen()+"\nKaprodi: "+a.getKaprodi()+"\nKeminatan: "+a.getKeminatan()+"\nlab: "+a.getKeminatan());
        System.out.println(a.namaFakultas+" "+a.namaRektor+" "+a.namaUniv+" yes yes yes");
        System.out.println("===================");
        b.setDosen("Candra");
        b.setKaprodi("Ilham");
        b.setKeminatan("Mengajar");
        b.setLab("labSI");
        System.out.println("Prodi SI\nNama dosen: "+b.getDosen()+"\nKaprodi: "+b.getKaprodi()+"\nKeminatan: "+b.getKeminatan()+"\nlab: "+b.getKeminatan());
        System.out.println(b.namaFakultas+" "+b.namaRektor+" "+b.namaUniv+" yes yes yes");
        System.out.println("===================");
        c.setDosen("Wijaya");
        c.setKaprodi("Wahyu");
        c.setKeminatan("Jaringan");
        c.setLab("labjaringan");
        System.out.println("Prodi Siskom\nNama dosen: "+b.getDosen()+"\nKaprodi: "+b.getKaprodi()+"\nKeminatan: "+b.getKeminatan()+"\nlab: "+b.getKeminatan());
        System.out.println(b.namaFakultas+" "+b.namaRektor+" "+b.namaUniv+" yes yes yes");
    }
    
}
