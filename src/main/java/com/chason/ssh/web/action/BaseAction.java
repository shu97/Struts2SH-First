package com.chason.ssh.web.action;

import com.chason.ssh.service.IDepartmentService;
import com.chason.ssh.service.IRoleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;

/**
 * Created by chason on 2017/6/17.
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
    @Resource(name = "roleService")
    protected IRoleService roleService ;
    @Resource(name = "departmentService")
    protected IDepartmentService departmentService;

    protected T model ;
    public BaseAction() {
        try {
            ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
            Class<T> clazz = (Class<T>) type.getActualTypeArguments()[0];
            model = clazz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public T getModel() {

        return  model;
    }

    /**
     * 获得值栈
     * @return
     */
    protected ValueStack getValueStack(){
        return ActionContext.getContext().getValueStack();
    }
}
