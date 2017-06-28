package com.chason.ssh.web.action;

import com.chason.ssh.pojo.Hello;
import com.chason.ssh.pojo.Role;
import com.opensymphony.xwork2.util.ValueStack;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by chason on 2017/6/15.
 */

@Controller
@Scope("prototype")
public class RoleAction extends BaseAction<Role>{

    public String list() throws Exception {
        List<Role> roleAll = roleService.findRoleAll();
        ValueStack vs = getValueStack();
        vs.set("list",roleAll);
        return "list";
    }
    public String delete() throws Exception {
        roleService.delete(model);

        return "toList";
    }

    public String editUI() throws Exception {
        DetachedCriteria dc = DetachedCriteria.forClass(Role.class);
        dc.add(Restrictions.eq("id",model.getId()));
        Role role = roleService.findDeachedCriteria(dc).get(0);
        getValueStack().push(role);
        return "editUI";
    }
    public String edit() throws Exception {
        DetachedCriteria dc = DetachedCriteria.forClass(Role.class);
        dc.add(Restrictions.eq("id",model.getId()));
        Role role = roleService.findDeachedCriteria(dc).get(0);
        role.setName(model.getName());
        role.setDescription(model.getDescription());
        roleService.update(role);
        return "toList";
    }

    public String addUI() throws Exception{
        return "addUI";
    }

    /**
     * 添加岗位
     * @return
     * @throws Exception
     */
    public String add() throws Exception{
        roleService.save(model);
        return "toList";
    }


}
