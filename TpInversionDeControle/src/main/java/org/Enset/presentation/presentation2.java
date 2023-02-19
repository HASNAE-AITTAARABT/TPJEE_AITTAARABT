package org.Enset.presentation;

import org.Enset.dao.IDao;
import org.Enset.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import static java.lang.Class.forName;

public class presentation2 {

    public presentation2() {
    }
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //injection de dépendance par instanciation dynamique
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao= forName(daoClassName);
        IDao dao = (IDao)cDao.newInstance();
        System.out.println(dao.getDate());

        String metierClassName =scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method m  = cMetier.getMethod("setDao", IDao.class);

        //metier.setDao(dao);
        m.invoke(metier,dao);
        System.out.println("Résultat => "+metier.clacule());
    }
}
