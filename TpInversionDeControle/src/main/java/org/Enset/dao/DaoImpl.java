package org.Enset.dao;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("dao")
public class DaoImpl implements IDao {


    public DaoImpl() {
    }
    @Override
    public Date getDate() {
        return new Date();
    }
}
