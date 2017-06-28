package com.chason.ssh.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.chason.ssh.dao.IBaseDao;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {

	private static final long serialVersionUID = 1L;
	private Class<T> clazz ;
	
	public BaseDaoImpl(){
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
		this.clazz = (Class)type.getActualTypeArguments()[0];
	}
	
	public void save(T t) throws Exception {
		this.getHibernateTemplate().save(t);
	}

	public void update(T t) throws Exception {
		this.getHibernateTemplate().update(t);
	}

	public void remove(T t) throws Exception {
		this.getHibernateTemplate().delete(t);
	}

	public void remove(Serializable id) throws Exception {
		this.getHibernateTemplate().delete(id);
	}

	@SuppressWarnings("unchecked")
	public Collection<T> getPageList(DetachedCriteria dc, Integer start,
			Integer pageSize) throws Exception {
		return (Collection<T>) this.getHibernateTemplate().findByCriteria(dc, start, pageSize);
	}

	public Collection<T> findDetachedCriteria(DetachedCriteria dc) {
		return (Collection<T>) this.getHibernateTemplate().findByCriteria(dc);
	}

}
