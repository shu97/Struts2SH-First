package com.chason.ssh.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface IBaseDao<T> extends Serializable{
	/**
	 * 增加
	 * @param t
	 * @throws Exception
	 */
	void save(T t) throws Exception;
	/**
	 * 修改
	 * @param t
	 * @throws Exception
	 */
	void update(T t) throws Exception;
	/**
	 * 删除
	 * @param t
	 * @throws Exception
	 */
	void remove(T t) throws Exception;
	/**
	 * 删除
	 * @param id
	 * @throws Exception
	 */
	void remove(Serializable id) throws Exception;

    /**
     * 查询分页列表数据
     * @param dc
     * @param start
     * @param pageSize
     * @return
     * @throws Exception
     */
	Collection<T> getPageList(DetachedCriteria dc, Integer start, Integer pageSize) throws Exception;

	/**
	 * 运用离线查询对象查询
	 * @param dc
	 * @return
	 */
	Collection<T>  findDetachedCriteria(DetachedCriteria dc);
}
