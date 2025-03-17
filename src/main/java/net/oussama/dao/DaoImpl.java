package net.oussama.dao;


public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double t = 41 ;
        return t;
    }
}
