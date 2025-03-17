package net.oussama.presentation;

import net.oussama.dao.DaoImpl;
import net.oussama.extension.DaoImplV2;
import net.oussama.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
//        metier.setDao(d);// Injection des dépendances via le setter
        System.out.println("RES= "+metier.calcul());
    }
}