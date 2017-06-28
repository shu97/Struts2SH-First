package com.chason.ssh.dao.impl;


import com.chason.ssh.dao.IDepartmentDao;

import com.chason.ssh.pojo.Department;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements IDepartmentDao {

	private static final long serialVersionUID = 1L;

		@Autowired
	    public void setSF(SessionFactory sf){
	        super.setSessionFactory(sf);
	    }

	public List<Department> findAll() throws Exception{
	    return (List<Department>) this.getHibernateTemplate().find("from Department");
	}
}
