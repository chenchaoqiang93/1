package com.test.work.base.dao.Impl;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import com.test.work.base.dao.IBaseDao;
import com.test.work.base.model.Page;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Parameter;


public class BaseDaoImpl<T> implements IBaseDao<T> {

    private int BATCH_MAX_ROW = 5;

    private SessionFactory sessionFactory;
    private Class<T> entityClass;

    //construct methods
    public BaseDaoImpl(){
    }

    public BaseDaoImpl(Class<T> entityClass){
        this.entityClass = entityClass;
    }

    public void save(T entity) throws Exception {

    }

    public void delete(T entity) throws Exception {

    }

    public void update(T entity) throws Exception {

    }

    public T getOne(int id) throws Exception {
        return null;
    }

    public T findOne(String hql) throws Exception {
        return null;
    }

    public T findOne(String hql, Parameter parameter) throws Exception {
        return null;
    }

    public List<T> findList(String hql) throws Exception {
        return null;
    }

    public List<T> findList(String hql, Parameter parameter) throws Exception {
        return null;
    }

    public Page<T> findPage(int currentPage, int pageSize, String queryHql, String countHql, Object[] values) throws HibernateException, SQLException {
        return null;
    }

    public Page<T> findPage(int currentPage, int pageSize, String queryHql, String countHql) throws HibernateException, SQLException {
        return null;
    }

    public long findCount(String hql) {
        return 0;
    }

    public long findCount(String hql, Object[] values) {
        return 0;
    }
}