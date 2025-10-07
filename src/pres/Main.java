package pres;
import Dao.DaoImplement;
import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        IDao dao = new DaoImplement();
        IMetier metier = new MetierImpl(dao);
        double res = metier.calcul();
        System.out.println("Résultat (statique) = " + res);
    }
}
