package Dao;

public class DaoImplement implements  IDao{
    @Override
    public double getData() {
        System.out.printf("Version de base de donnees");

        double data = 22;

        return data;
    }
}
