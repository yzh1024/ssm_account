package com.yzh1024.service.impl;

import com.yzh1024.dao.IAccountDao;
import com.yzh1024.domain.Account;
import com.yzh1024.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    /**
     * 查询所有账户
     * @return
     */
    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有信息...");
        return accountDao.fidAll();
    }

    /**
     * 增加账户
     * @param account
     */
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户...");
        accountDao.saveAccount(account);
    }

    /**
     * 删除账户
     * @param id
     */
    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }


    /**
     * 修改账户信息
     * @param account
     */
    @Override
    public void change(Account account) {
        accountDao.change(account);
    }


}
