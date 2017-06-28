package com.chason.ssh.service;

import com.chason.ssh.pojo.Department;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

/**
 * Created by chason on 2017/6/18.
 */
public interface IDepartmentService{
    void save(Department department) throws Exception;
    List<Department> findAll() throws Exception;
    void update(Department department) throws Exception;
    List<Department> findDetachedCriteria(DetachedCriteria detachedCriteria) throws Exception;
    void delete(Department department) throws Exception;
}
