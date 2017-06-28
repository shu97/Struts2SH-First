package com.chason.ssh.dao;

import com.chason.ssh.pojo.Role;

import java.util.List;

public interface IRoleDao extends IBaseDao<Role> {
	
    List<Role> findRoleAll() throws Exception;
}
