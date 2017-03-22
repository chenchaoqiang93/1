package com.test.work.base.dao;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import com.test.work.base.model.Page;
import org.hibernate.HibernateException;
import org.hibernate.annotations.Parameter;

/**
 * Created by renrunkeji_059 on 2017/3/21.
 */
public interface IBaseDao<T> {

    //单个CRUD
    public void save(final T entity) throws Exception;
    public void delete(final T entity) throws Exception;
//    <span style="white-space:pre">  </span>public void deleteWithHql(final String hql) throws Exception;
    public void update(final T entity) throws Exception;
    public T getOne(final int id) throws Exception;

//    <span style="white-space:pre">  </span>//批处理
//    <span style="white-space:pre">  </span>public int batchSave(final List<T> list) throws Exception;
//    <span style="white-space:pre">  </span>public void deleteAll(final Collection entities) throws Exception;

    //createQuery（Query）
    public T findOne(final String hql) throws Exception;
    public T findOne(final String hql, final Parameter parameter) throws Exception;

    //list查询
    public List<T> findList(final String hql) throws Exception;
    public List<T> findList(final String hql, final Parameter parameter) throws Exception;

    //分页查询
    public Page<T> findPage(final int currentPage, final int pageSize, final String queryHql, final String countHql, final Object[] values)
            throws HibernateException,SQLException;
    public Page<T> findPage(final int currentPage, final int pageSize, final String queryHql, final String countHql)
            throws HibernateException,SQLException;

    //查询满足条件的记录数
    public long findCount(final String hql);
    public long findCount(final String hql, final Object[] values);
}
