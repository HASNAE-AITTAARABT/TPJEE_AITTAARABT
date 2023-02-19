package org.Enset.metier;

import org.Enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{

    @Autowired
    private IDao dao ; // couplage faible

    public MetierImpl() {this.dao = dao;}
    @Override
    public Double clacule() {
        return (double)this.dao.getDate().getMinutes();
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
