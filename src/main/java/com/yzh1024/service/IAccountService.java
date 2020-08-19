package com.yzh1024.service;

import com.yzh1024.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IAccountService {
    //查询所有帐户
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);

    //删除账户信息
    public void deleteAccount(Integer id);

    //修改账户信息
    public void change(Account account);
}
