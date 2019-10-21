package com.briup.mapper;

import com.briup.bean.EUser;
import com.briup.bean.EUserExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EUserMapper {
    int countByExample(EUserExample example);

    int deleteByExample(EUserExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(EUser record);

    int insertSelective(EUser record);

    List<EUser> selectByExample(EUserExample example);

    EUser selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") EUser record, @Param("example") EUserExample example);

    int updateByExample(@Param("record") EUser record, @Param("example") EUserExample example);

    int updateByPrimaryKeySelective(EUser record);

    int updateByPrimaryKey(EUser record);
}