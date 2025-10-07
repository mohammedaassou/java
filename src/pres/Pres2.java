package pres;
import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(new File("config.txt"))) {
            String daoClassName = scanner.nextLine().trim();
            Class<?> cDao = Class.forName(daoClassName);
            IDao d = (IDao) cDao.getDeclaredConstructor().newInstance();

            String metierClassName = scanner.nextLine().trim();
            Class<?> cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();

            Method setDao = cMetier.getDeclaredMethod("setDao", Dao.IDao.class);
            setDao.invoke(metier, d);

            System.out.println("RES = " + metier.calcul());
        }
    }
}
