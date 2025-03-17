package net.oussama.metier;


import net.oussama.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage faible

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDO
     * au moment de l'instantiation
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }


    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 *Math.PI/2 *Math.cos(t);
        return res;
    }


    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDO
     * après l'instantiation
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
