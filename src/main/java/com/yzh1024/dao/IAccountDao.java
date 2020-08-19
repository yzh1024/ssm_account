package com.yzh1024.dao;

import com.yzh1024.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {
    //查询所有帐户
    @Select("select * from account")
    public List<Account> fidAll();

    //保存账户信息
    @Insert("insert into account (name,money) value (#{name},#{money})")
    public void saveAccount(Account account);

    //删除账户信息
    @Insert(" delete from account where id = #{id}")
    public void deleteAccount(Integer id);

    @Insert("update account set name = #{name},money=#{money} where id = #{id};")
    public void change(Account account);

}
