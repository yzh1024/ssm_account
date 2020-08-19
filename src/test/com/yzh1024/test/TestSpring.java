package com.yzh1024.test;

import com.yzh1024.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        //调用方法
        as.findAll();

    }
}
