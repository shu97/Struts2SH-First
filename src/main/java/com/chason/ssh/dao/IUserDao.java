package com.chason.ssh.dao;

import com.chason.ssh.pojo.User;

import java.util.List;

public interface IUserDao extends IBaseDao<User> {
	List<User>findAll();

}
