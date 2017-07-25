package com.lxw.dao.impl;

import com.lxw.dao.BaseDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by lxw on 2017/7/24.
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{


    public BaseDaoImpl() {
    }

    @Override
    public Serializable save(T t) {
        return null;
    }

    @Override
    public void update(T t) {

    }

    @Override
    public void saveOrUpdate(T t) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public T get(Serializable id) {
        return null;
    }

    @Override
    public T findByEntity(T t) {
        return null;
    }

    @Override
    public List<Map> findBySql(String sql) {
        return null;
    }

    @Override
    public List<T> findByHql(String hql) {
        return null;
    }

    @Override
    public void excSql(String sql) {

    }

    @Override
    public void excHql(String hql) {

    }
}
