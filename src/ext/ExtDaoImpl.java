package ext;

import Dao.IDao;

public class ExtDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        return 33; // Simule une donnée provenant d'un service externe
    }
}
