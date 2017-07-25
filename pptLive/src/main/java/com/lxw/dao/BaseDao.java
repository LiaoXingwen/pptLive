package com.lxw.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by lxw on 2017/7/24.
 */
public interface BaseDao<T> {
    public Serializable save(T t);
    public void  update(T t) ;
    public void saveOrUpdate(T t) ;
    public void delete(T t) ;
    public T get(Serializable id) ;
    public T findByEntity(T t) ;
    public List<Map> findBySql(String sql) ;
    public List<T> findByHql(String hql) ;
    public void excSql(String sql) ;
    public void excHql(String hql) ;

}
