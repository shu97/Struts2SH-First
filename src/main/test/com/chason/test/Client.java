package com.chason.test;

import com.chason.ssh.pojo.Department;
import com.chason.ssh.pojo.Role;
import com.chason.ssh.service.IDepartmentService;
import com.chason.ssh.service.IRoleService;
import com.chason.ssh.service.impl.HelloServiceImpl;
import com.chason.ssh.service.impl.RoleServiceImpl;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chason on 2017/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class Client {

    @Resource(name = "helloService")
    private HelloServiceImpl helloService;
    @Resource(name="roleService")
    private IRoleService roleService ;
   /* @Resource(name="departmentService")
    private IDepartmentService departmentService ;*/
   @Resource//name = "departmentService"
   protected IDepartmentService departmentService;
    @Test
    public void print() throws Exception {
        Department d = new Department();
        d.setId(2L);
        departmentService.delete(d);
    }
}
