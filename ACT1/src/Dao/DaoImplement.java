package Dao;

public class DaoImplement implements IDao {
    @Override
    public double getData() {
        System.out.println("Version de base de donnees");
        double data = 22;
        return data;
    }
}
