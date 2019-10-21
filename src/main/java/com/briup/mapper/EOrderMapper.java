package com.briup.mapper;

import com.briup.bean.EOrder;
import com.briup.bean.EOrderExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EOrderMapper {
    int countByExample(EOrderExample example);

    int deleteByExample(EOrderExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(EOrder record);

    int insertSelective(EOrder record);

    List<EOrder> selectByExample(EOrderExample example);

    EOrder selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") EOrder record, @Param("example") EOrderExample example);

    int updateByExample(@Param("record") EOrder record, @Param("example") EOrderExample example);

    int updateByPrimaryKeySelective(EOrder record);

    int updateByPrimaryKey(EOrder record);
}