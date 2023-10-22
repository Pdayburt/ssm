package com.laogou.edu.service.impl;

import com.laogou.edu.mapper.AccountMapper;
import com.laogou.edu.pojo.Account;
import com.laogou.edu.service.AccountService;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Transactional
    @Override
    public List<Account> queryAccountList() {
        return accountMapper.queryAccountList();
    }
}
