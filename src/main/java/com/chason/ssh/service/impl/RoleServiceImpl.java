package com.chason.ssh.service.impl;

import com.chason.ssh.dao.impl.RoleDaoImpl;
import com.chason.ssh.pojo.Role;

import com.chason.ssh.service.IRoleService;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by chason on 2017/6/16.
 */
@Service("roleService" )
@Transactional(readOnly=true,rollbackFor = Exception.class)
public class RoleServiceImpl implements IRoleService {
    @Resource(name = "roleDao")
    private RoleDaoImpl roleDao ;

    public List<Role> findDeachedCriteria(DetachedCriteria dc) throws Exception{
        return (List<Role>) roleDao.findDetachedCriteria(dc);
    }
    @Transactional(readOnly=false)
    public void save(Role role) throws Exception {
        roleDao.save(role);
    }
    public List<Role> findRoleAll() throws Exception{
        try {
            return roleDao.findRoleAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null ;
    }
    @Transactional(readOnly = false)
    public void delete(Role role) throws Exception {
        roleDao.remove(role);
    }
    @Transactional(readOnly = false)
    public void update(Role role) throws Exception {
        roleDao.update(role);
    }
}
