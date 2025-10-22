package pres;
import Dao.DaoImplement;
import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        IDao dao = new DaoImplement();
        IMetier metier = new MetierImpl(dao);
        double res = metier.calcul();
        System.out.println("Résultat (statique) = " + res);
    }
}
