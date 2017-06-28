package com.chason.ssh.service.impl;

import com.chason.ssh.dao.impl.HelloDaoImpl;

import com.chason.ssh.pojo.Hello;

import com.chason.ssh.service.IHelloService;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chason on 2017/6/16.
 */
@Service("helloService")
@Transactional(readOnly=true)
public class HelloServiceImpl implements IHelloService {
    @Resource(name = "helloDao")
    private HelloDaoImpl helloDaoimpl ;

    public Hello test(){
        Hello h = new Hello ();
        h.setName("aa");
        try {
            helloDaoimpl.save(h);
            return h;
        } catch (Exception e) {

            e.printStackTrace();
        }
        return h;
    }
    public List<Hello> findDeachedCriteria(DetachedCriteria dc){
        return (List<Hello>) helloDaoimpl.findDetachedCriteria(dc);
    }
    @Transactional(readOnly=false)
    public void save(Hello hello) throws Exception {
        helloDaoimpl.save(hello);
    }

}
