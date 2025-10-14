package Metier;

import Dao.IDao;

public class MetierImpl implements IMetier {
    private final IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 23;
    }
}
