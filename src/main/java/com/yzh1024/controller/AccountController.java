package com.yzh1024.controller;

import com.yzh1024.domain.Account;
import com.yzh1024.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    //跳转到zhu
    @RequestMapping("/zhu")
    public String login(){
        return "zhu";
    }


    //增加账户
    @RequestMapping("/add")
    public String add(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        //重定向
        //response.sendRedirect(request.getContextPath()+"/account/re");
        return "zhu";
    }

    //删除账户
    @RequestMapping("/delete")
    public String delete(Integer id) {
       accountService.deleteAccount(id);
        return "zhu";
    }

    //修改账户
    @RequestMapping("/change")
    public String add(Account account){
        accountService.change(account);
        return "zhu";
    }

    //查询所有
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询所有帐户...");
        //调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "findall";
    }




    //跳转到add
    @RequestMapping("/toadd")
    public String add(){
        return "add";
    }

    //跳转到change
    @RequestMapping("/tochange")
    public String change(){
        return "change";
    }

    //跳转到delete
    @RequestMapping("/todelete")
    public String delete(){
        return "delete";
    }


}
