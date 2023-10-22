package com.laogou.edu.mapper;

import com.laogou.edu.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountMapper {
    List<Account> queryAccountList();
}
