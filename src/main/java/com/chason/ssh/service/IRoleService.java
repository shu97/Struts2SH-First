package com.chason.ssh.service;

import com.chason.ssh.pojo.Role;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface IRoleService {
    List<Role> findDeachedCriteria(DetachedCriteria dc) throws Exception;
    void save(Role role) throws Exception;
    List<Role> findRoleAll() throws Exception ;
    void delete(Role role) throws Exception;
    void update(Role role) throws Exception ;
}
