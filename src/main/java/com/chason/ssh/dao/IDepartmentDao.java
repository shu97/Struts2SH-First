package com.chason.ssh.dao;

import com.chason.ssh.pojo.Department;

import java.util.List;

public interface IDepartmentDao extends IBaseDao<Department> {
    List<Department> findAll() throws Exception;

}
