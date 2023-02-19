package org.Enset.presentation;

import org.Enset.dao.DaoImpl;
import org.Enset.metier.MetierImpl;

public class presentation {
    public static void main(String[] args) {
        //injection de dépendance par instanciation static
        DaoImpl dao=new DaoImpl();

        MetierImpl metier= new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultats = "+metier.clacule());
    }
}
