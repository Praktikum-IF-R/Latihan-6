/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.si
 */
package fakultas;

/**
 *
 * @author LENY
 */
public class mainFakultas {

    public static void main(String[] args) {
        informatika a = new informatika("FILKOM", "BRAWIJAYA", "PAK BISRI","informatika");
        a.getinformatika();
        SI b = new SI("FILKOM", "BRAWIJAYA", "PAK BISRI","SI");
        b.getSI();
        SisKom c = new SisKom("FILKOM", "BRAWIJAYA", "PAK BISRI","Siskom");
        c.getSisKom();

    }
}
