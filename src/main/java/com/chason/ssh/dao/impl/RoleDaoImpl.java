package com.chason.ssh.dao.impl;

import com.chason.ssh.dao.IRoleDao;
import com.chason.ssh.pojo.Role;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements IRoleDao {

	private static final long serialVersionUID = 1L;
		@Resource
	    public void setSF(SessionFactory sf){
	        super.setSessionFactory(sf);
	    }

	public List<Role> findRoleAll() throws Exception{
		return (List<Role>) this.getHibernateTemplate().find("from Role");

	}
}
