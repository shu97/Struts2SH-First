package com.chason.ssh.service.impl;

import com.chason.ssh.dao.IDepartmentDao;
import com.chason.ssh.pojo.Department;
import com.chason.ssh.service.IDepartmentService;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chason on 2017/6/18.
 */
@Service("departmentService")
@Transactional(readOnly = true,rollbackFor = Exception.class)
public class DepartmentServiceImpl  implements IDepartmentService{
    @Resource
    private IDepartmentDao departmentDao;

    @Transactional(readOnly = false)
    public void save(Department department) throws Exception {
        departmentDao.save(department);
    }

    public List<Department> findAll() throws Exception {
        return departmentDao.findAll();
    }

    @Transactional(readOnly = false)
    public void update(Department department) throws Exception{
        try {
            departmentDao.update(department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Department> findDetachedCriteria(DetachedCriteria detachedCriteria) throws Exception {
        return (List<Department>) departmentDao.findDetachedCriteria(detachedCriteria);
    }
    @Transactional(readOnly = false)
    public void delete(Department department) throws Exception {
        departmentDao.remove(department);
    }

    public List<Department> findDe(DetachedCriteria dc) {
        return (List<Department>) departmentDao.findDetachedCriteria(dc);
    }
}
