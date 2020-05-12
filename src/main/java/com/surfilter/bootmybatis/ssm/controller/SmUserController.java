package com.surfilter.bootmybatis.ssm.controller;

import com.surfilter.bootmybatis.ssm.model.SmUser;
import com.surfilter.bootmybatis.ssm.service.SmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/SmUser")
public class SmUserController {
    @Autowired
    private SmUserService smUserService;
    @GetMapping("/getUserNameById.action")
    @ResponseBody
    public String getUserNameById(int id){
        return smUserService.getUserNameById(id);
    }
    @GetMapping("/getUserById.action")
    @ResponseBody
    public SmUser getUserById(int id){
        return smUserService.getUserById(id);
    }
}
