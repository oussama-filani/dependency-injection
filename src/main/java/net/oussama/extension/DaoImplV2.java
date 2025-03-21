package net.oussama.extension;

import net.oussama.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs ....");
        double t = 14;
        return t;
    }
}
