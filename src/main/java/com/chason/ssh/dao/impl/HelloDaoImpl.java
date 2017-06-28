package com.chason.ssh.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chason.ssh.dao.IHelloDao;
import com.chason.ssh.pojo.Hello;

@Repository("helloDao")
public class HelloDaoImpl extends BaseDaoImpl<Hello> implements IHelloDao {

	private static final long serialVersionUID = 1L;

		@Autowired
	    public void setSF(SessionFactory sf){
	        super.setSessionFactory(sf);
	    }
	
}
