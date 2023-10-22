package com.lagou.edu.controller;

import com.lagou.edu.pojo.Account;
import com.lagou.edu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {

    /**
     * Spring 容器和Springmvc容器是有层次的（父子容器）
     * Spring 管理 service 和dao 对象
     * SpringMVC 管理controller对象 可以引用Spring容器中的对象
     */
    @Autowired
    private AccountService accountService;
    @RequestMapping("queryAll")
    @ResponseBody
    public List<Account> queryAll(){
        return  accountService.queryAccountList();

    }

}
