package com.chason.ssh.dao.impl;


import com.chason.ssh.dao.IUserDao;

import com.chason.ssh.pojo.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {

	private static final long serialVersionUID = 1L;

		@Autowired
	    public void setSF(SessionFactory sf){
	        super.setSessionFactory(sf);
	    }

	public List<User> findAll() {

	    return (List<User>) this.getHibernateTemplate().find("from User");
	}
}
