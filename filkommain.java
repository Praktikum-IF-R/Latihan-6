package lap6inherit;

import java.util.Scanner;

public class filkommain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        informatika tif=new informatika();
        sisteminformasi si= new sisteminformasi();
        sistemkomputer sk= new sistemkomputer();
        filkom fik=new filkom();
        
        tif.Display();
        fik.show();
        si.Display();
        fik.show();
        sk.Display();
        fik.show();
    }
    
}
