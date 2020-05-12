package com.surfilter.bootmybatis.ssm.service;

import com.surfilter.bootmybatis.ssm.dao.SmUserMapper;
import com.surfilter.bootmybatis.ssm.model.SmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmUserService {
    @Autowired
    private SmUserMapper smUserMapper;
    public String getUserNameById(int id) {
        SmUser user = smUserMapper.selectByPrimaryKey(id);
        return user.getUSER_NAME();
    }
    public SmUser getUserById(int id) {
        return smUserMapper.selectByPrimaryKey(id);
    }
}
