package com.chason.ssh.web.action;

import com.chason.ssh.pojo.Department;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by chason on 2017/6/18.
 */
@Controller
@Scope("prototype")
public class DepartmentAction extends BaseAction<Department> {
    private Long parentId;//属性驱动



    public String list() throws Exception {
        List<Department> all = departmentService.findAll();
        getValueStack().set("list",all);
        return "list";
    }

    public String delete() throws Exception{
        departmentService.delete(model);
        return "toList" ;
    }

    public String addUI() throws Exception{
        List<Department> all = departmentService.findAll();
        getValueStack().set("departmentList",all);
        return "addUI" ;
    }
    public String add() throws Exception{
        if(parentId != null){
            DetachedCriteria dc =DetachedCriteria.forClass(Department.class);
            dc.add(Restrictions.eq("id",parentId));
            Department department = departmentService.findDetachedCriteria(dc).get(0);
            model.setParent(department);
        }else {
            model.setParent(null);
        }
        departmentService.save(model);
        return "toList";
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
