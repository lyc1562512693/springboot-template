package com.surfilter.bootmybatis.ssm.dao;

import com.surfilter.bootmybatis.ssm.model.SmUser;
import com.surfilter.bootmybatis.ssm.model.SmUserExample;
import java.util.List;

public interface SmUserMapper {
    int deleteByPrimaryKey(Integer USER_ID);

    int insert(SmUser record);

    int insertSelective(SmUser record);

    List<SmUser> selectByExample(SmUserExample example);

    SmUser selectByPrimaryKey(Integer USER_ID);

    int updateByPrimaryKeySelective(SmUser record);

    int updateByPrimaryKey(SmUser record);
}